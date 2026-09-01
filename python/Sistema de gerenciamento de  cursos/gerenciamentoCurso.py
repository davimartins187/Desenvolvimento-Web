import os

print('Sistema de Cursos \n'.center(30))

escolha = -1

class Aluno:
    def __init__(self, idAluno, nomeAluno, idadeAluno, emailAluno, cursosCadastrados):

        self.idAluno = idAluno
        self.nomeAluno = nomeAluno
        self.idadeAluno = idadeAluno
        self.emailAluno = emailAluno
        self.cursosCadastrados = cursosCadastrados

class Curso:
    def __init__(self, idCurso, nomeCurso, profCurso, cargaHorariaCurso):

        self.idCurso = idCurso
        self.nomeCurso = nomeCurso
        self.profCurso = profCurso
        self.cargaHorariaCurso = cargaHorariaCurso

alunos = []
cursos = []
cursosCadastrados = []
vouFicar = 'ficar'

def limpar_tela():
    os.system('cls' if os.name == 'nt' else 'clear')

def sairApliativo():

    verificacaoFicar = False

    while verificacaoFicar == False:

        permanercer = input('Deseja continuar? [S/N] ').upper()

        if permanercer == 'S':

            verificacaoFicar = True
            return 'ficar'
        
        elif permanercer == 'N':

            verificacaoFicar = False
            return 'não ficar'

        else:
            verificacaoFicar = False

def validarCampo(mensagem, erro):

    while True:
        nome = input(f'{mensagem}')
        
        if nome.replace(' ', '').isalpha() and len(nome.strip()) > 0:
            return nome.title()
        
        print(f'{erro}')

def validarHorario(mensagem, tipo):

    while True:

        horarioSTR = input(f'{mensagem}')

        if not horarioSTR.isdigit():
            print('Digite um valor válido!')
        else:
            horario = int(horarioSTR)
            
            if tipo == 'escolha':
                if 0 <= horario <= 12:
                    return horario
                print('Opção inválida! Escolha um número de 0 a 12.')
            
            else:
                if horario <= 0:
                    print('Digite um valor maior que zero!')
                else:
                    return horario


def listarAlunos():
    
    if alunos:

        for aluno in alunos:
            print(f"ID: {aluno.idAluno}")
            print(f"Nome: {aluno.nomeAluno}")
            print(f"Idade: {aluno.idadeAluno}")
            print(f"Email: {aluno.emailAluno}")
            print('-' * 30 + '\n')

    else:
        print('Nenhum aluno cadastrado. \n')

def listarCursos():
    if cursos: 
    
        for curso in cursos:

            print(f"ID: {curso.idCurso}")
            print(f"Nome do curso: {curso.nomeCurso}")
            print(f"professor(a): {curso.profCurso}")
            print(f"Carga Horaria: {curso.cargaHorariaCurso} horas")
            print('-' * 30 + '\n')

    else:
        print('Nenhum curso foi cadastrado')

while escolha != 0 and vouFicar == 'ficar':

    print(
        '1  - Cadastrar aluno \n' 
        '2  - Listar alunos \n'
        '3  - Pesquisar aluno \n'
        '4  - Cadastrar curso \n'
        '5  - Listar cursos \n'
        '6  - Matricular aluno \n'
        '7  - Registrar nota \n'
        '8  - Ver boletim \n'
        '9  - Remover aluno \n'
        '10 - Remover curso \n'
        '11 - Salvar dados \n'
        '12 - Carregar dados \n'
        '0 - Sair \n'
    )

    escolha = validarHorario('Digite a sua escolha: ', 'escolha')

# CADASTRO DE ALUNO

    if escolha == 1:

        nomeAlunoFormatado = validarCampo('Digite o nome do aluno: ', 'Valor invalido digite novamente')
        idadeAluno = validarHorario('Digite a sua idade: ', 'idade')
        verificacaoEmail = False

        while verificacaoEmail == False:

            emailAluno = input('Digite o email do aluno: ')

            emailValido = True

            for aluno in alunos:
                if aluno.emailAluno == emailAluno:
                    emailValido = False

            if emailValido == False:
                print('Esse email já foi cadastrado.')

            elif not emailAluno.endswith('@gmail.com'):
                print('Email inválido.')

            else:
                verificacaoEmail = True

                 
        idAluno = str(len(alunos) + 1)

        novoAluno = Aluno(
            idAluno = idAluno,
            nomeAluno = nomeAlunoFormatado,
            idadeAluno = idadeAluno,
            emailAluno = emailAluno,
            cursosCadastrados = []
        )

        alunos.append(novoAluno)

        print(f'Aluno {nomeAlunoFormatado} cadastrado com successo! ID: {idAluno}\n')

        vouFicar = sairApliativo()
        limpar_tela()

# Listar alunos

    elif escolha == 2:

        print(f"{'='*30}\n" + "Listar Alunos".center(30) + f"\n{'='*30}\n")
        listarAlunos()

        vouFicar = sairApliativo()
        print('\n')
        limpar_tela()

# pesquisar alunos

    elif escolha == 3:

        pesquisa = input('Digite o nome, email ou id do aluno: ').lower()

        for aluno in alunos:

            if pesquisa in aluno.idAluno or pesquisa in aluno.nomeAluno.lower() or pesquisa in aluno.emailAluno:

                print('Aluno encontrado!! \n\n')
                print(f"ID: {aluno.idAluno}")
                print(f"Nome: {aluno.nomeAluno}")
                print(f"Email: {aluno.emailAluno}")
                print('-' * 30 + '\n')

        vouFicar = sairApliativo()
        print('\n')
        limpar_tela()

# Cadastrar Cursos

    elif escolha == 4:

        nomeCurso = validarCampo('Digite o nome do curso: ', 'Valor invalido, digite novamente')
        professorCurso = validarCampo('Digite o nome do professor(a): ', 'Valor invalido, digite novamente')
        cargaHorariaCurso = validarHorario('Digite a carga horaria do curso: ', 'carga horaria')
        idCurso = str(len(cursos) + 1)

        novoCurso = Curso(
            idCurso = idCurso,
            nomeCurso = nomeCurso,
            profCurso = professorCurso,
            cargaHorariaCurso = cargaHorariaCurso
        )

        cursos.append(novoCurso)

        print(f'O curso {novoCurso.nomeCurso} foi cadastrado com sucesso!! ID: {novoCurso.idCurso}\n')

        vouFicar = sairApliativo()
        print('\n')
        limpar_tela()

# Listar Cursos

    elif escolha ==  5:

        print(f"{'='*30}\n" + "Listar Cursos".center(30) + f"\n{'='*30}\n")
        listarCursos()

        vouFicar = sairApliativo()
        print('\n')
        limpar_tela()

# Matricular Aluno

    elif escolha == 6:
        
        if len(alunos) > 0 and len(cursos) > 0: 
            print(f"{'='*30}\n" + "Matricular Aluno".center(30) + f"\n{'='*30}\n")
            print('Alunos disponiveis: ')
            listarAlunos()
            
            idAlunoEncontrado = False
            alunoEncontrado = None

            while idAlunoEncontrado == False:
                pesquisarID_aluno = str(validarHorario('Digite o ID do aluno: ', 'idAluno'))

                for aluno in alunos:
                    if pesquisarID_aluno == aluno.idAluno:
                        idAlunoEncontrado = True
                        alunoEncontrado = aluno
                        break
            
                if idAlunoEncontrado == False:
                    print('Aluno não encontrado, digite novamente. \n')
                elif pesquisarID_aluno > str(len(alunos)):
                    print('Esse ID não existe, digite novamente.')
                    idAlunoEncontrado == False

            print(f'Aluno selecionado: \n {alunoEncontrado.nomeAluno} \n\n')
            print('Cursos disponiveis: \n')
            listarCursos()
            
            idCursoEncontrado = False
            cursoEncontrado = None

            while idCursoEncontrado == False:
                pesquisarID_curso = str(validarHorario('Digite o ID do curso: ', 'idCurso'))
                for curso in cursos:
                    if pesquisarID_curso == curso.idCurso:
                        idCursoEncontrado = True
                        cursoEncontrado = curso
                        break

                if idCursoEncontrado == False:
                    print('Curso não encontrado, digite novamente. \n')
                elif int(pesquisarID_curso) > len(cursos):
                    print('Esse ID não existe, digite novamente.')

            matriculaRealizada = False
            for c in alunoEncontrado.cursosCadastrados:

                if c.idCurso == cursoEncontrado.idCurso:
                    matriculaRealizada = True
                    break

            if matriculaRealizada:
                print('Você já esta matriculado nesse curso')
            else:
                matriculaRealizada = False

                print(f'{'='*31} ')
                print('Confirmação'.center(31))
                print(f'{'='*31} \n\n')

                print(f'Aluno: {alunoEncontrado.nomeAluno}')
                print(f'Curso: {cursoEncontrado.nomeCurso}')
                print(f'professor(a): {cursoEncontrado.profCurso}')

            RealizarMatricula = validarCampo('Deseja realizar a matricula? [S/N] ', 'Valor invalido, digite novamente!!').upper()

            if RealizarMatricula == 'S':
                print(f'Aluno {alunoEncontrado.nomeAluno} teve a sua matricula no curso {cursoEncontrado.nomeCurso} efetivada com sucesso!\n')
                alunoEncontrado.cursosCadastrados.append(cursoEncontrado)
            else:
                print('\nMatricula cancelada com sucesso!!! \n')


            vouFicar = sairApliativo()
            limpar_tela()

        else:
            limpar_tela()
            print('não há cursos ou alunos disponiveis, faça os cadastros necessarios')
            vouFicar = sairApliativo()

