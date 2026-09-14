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
        self.notas_por_curso = {}  # {idCurso: [nota1, nota2, nota3]}

class Curso:
    def __init__(self, idCurso, nomeCurso, profCurso, cargaHorariaCurso):
        self.idCurso = idCurso
        self.nomeCurso = nomeCurso
        self.profCurso = profCurso
        self.cargaHorariaCurso = cargaHorariaCurso

alunos = []
cursos = []
vouFicar = 'ficar'

def limpar_tela():
    os.system('cls' if os.name == 'nt' else 'clear')

def sairApliativo():
    while True:
        permanercer = input('Deseja continuar? [S/N] ').strip().upper()
        if permanercer == 'S':
            return 'ficar'
        elif permanercer == 'N':
            return 'não ficar'
        print('Opção inválida! Digite S ou N.')

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

def validarNota(mensagem):
    while True:
        try:
            nota = float(input(mensagem))
            if 0 <= nota <= 10:
                return nota
            print('inválida. A nota deve estar entre 0 e 10.')
        except ValueError:
            print('inválida. Digite um número válido.')

def listarAlunos():
    if alunos:
        for aluno in alunos:
            print(f"ID: {aluno.idAluno}")
            print(f"Nome: {aluno.nomeAluno}")
            print(f"Idade: {aluno.idadeAluno}")
            print(f"Email: {aluno.emailAluno}")
            print('-' * 50)
    else:
        print('Nenhum aluno cadastrado.\nCadastre um aluno primeiro.\n')

def listarCursos():
    if cursos: 
        for curso in cursos:
            print(f"ID: {curso.idCurso}")
            print(f"Nome do curso: {curso.nomeCurso}")
            print(f"Professor(a): {curso.profCurso}")
            print(f"Carga Horária: {curso.cargaHorariaCurso} horas")
            print('-' * 50)
    else:
        print('Nenhum curso cadastrado.\nCadastre um curso primeiro.\n')

def digiteIDaluno():
    while True:
        pesquisarID_aluno = str(validarHorario('Digite o ID do aluno: ', 'idAluno'))
        for aluno in alunos:
            if pesquisarID_aluno == aluno.idAluno:
                return aluno
        print('Esse ID não existe, digite novamente.\n')

def digiteIDcursoMatriculado(aluno):
    while True:
        pesquisarID_curso = str(validarHorario('Digite o ID do curso: ', 'idCurso'))
        for curso in aluno.cursosCadastrados:
            if pesquisarID_curso == curso.idCurso:
                return curso
        print('Curso não encontrado ou aluno não matriculado nele. Digite novamente.\n')


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
        '0  - Sair \n'
    )

    escolha = validarHorario('Digite a sua escolha: ', 'escolha')

    # 1. CADASTRO DE ALUNO
    if escolha == 1:
        nomeAlunoFormatado = validarCampo('Digite o nome do aluno: ', 'Valor inválido, digite novamente')
        idadeAluno = validarHorario('Digite a sua idade: ', 'idade')
        verificacaoEmail = False

        while not verificacaoEmail:
            emailAluno = input('Digite o email do aluno: ')
            emailValido = True

            for aluno in alunos:
                if aluno.emailAluno == emailAluno:
                    emailValido = False

            if not emailValido:
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
        print(f'Aluno {nomeAlunoFormatado} cadastrado com sucesso! ID: {idAluno}\n')

        vouFicar = sairApliativo()
        limpar_tela()

    # 2. LISTAR ALUNOS
    elif escolha == 2:
        print(f"{'='*50}\n" + "LISTAR ALUNOS".center(50) + f"\n{'='*50}\n")
        listarAlunos()
        vouFicar = sairApliativo()
        limpar_tela()

    # 3. PESQUISAR ALUNO
    elif escolha == 3:
        pesquisa = input('Digite o nome, email ou id do aluno: ').lower()
        encontrado = False

        for aluno in alunos:
            if pesquisa in aluno.idAluno or pesquisa in aluno.nomeAluno.lower() or pesquisa in aluno.emailAluno:
                print('\nAluno encontrado!!')
                print(f"ID: {aluno.idAluno}")
                print(f"Nome: {aluno.nomeAluno}")
                print(f"Email: {aluno.emailAluno}")
                print('-' * 50)
                encontrado = True

        if not encontrado:
            print('Nenhum aluno encontrado com esses dados.\n')

        vouFicar = sairApliativo()
        limpar_tela()

    # 4. CADASTRAR CURSO
    elif escolha == 4:
        nomeCurso = validarCampo('Digite o nome do curso: ', 'Valor inválido, digite novamente')
        professorCurso = validarCampo('Digite o nome do professor(a): ', 'Valor inválido, digite novamente')
        cargaHorariaCurso = validarHorario('Digite a carga horária do curso: ', 'carga horaria')
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
        limpar_tela()

    # 5. LISTAR CURSOS
    elif escolha == 5:
        print(f"{'='*50}\n" + "LISTAR CURSOS".center(50) + f"\n{'='*50}\n")
        listarCursos()
        vouFicar = sairApliativo()
        limpar_tela()

    # 6. MATRICULAR ALUNO
    elif escolha == 6:
        if len(alunos) > 0 and len(cursos) > 0: 
            print(f"{'='*50}\n" + "MATRICULAR ALUNO".center(50) + f"\n{'='*50}\n")
            print('ALUNOS DISPONÍVEIS:\n')
            listarAlunos()
            
            alunoEncontrado = digiteIDaluno()
            
            print(f'\nAluno selecionado: {alunoEncontrado.nomeAluno}\n')
            print('CURSOS DISPONÍVEIS:\n')
            listarCursos()
            
            pesquisarID_curso = str(validarHorario('Digite o ID do curso: ', 'idCurso'))
            cursoEncontrado = None
            for curso in cursos:
                if pesquisarID_curso == curso.idCurso:
                    cursoEncontrado = curso
                    break

            if not cursoEncontrado:
                print('Curso não encontrado.')
            else:
                if cursoEncontrado in alunoEncontrado.cursosCadastrados:
                    print('Você já está matriculado nesse curso!')
                else:
                    print(f"\n{'='*31}")
                    print('Confirmação'.center(31))
                    print(f"{'='*31}\n")

                    print(f'Aluno: {alunoEncontrado.nomeAluno}')
                    print(f'Curso: {cursoEncontrado.nomeCurso}')
                    print(f'Professor(a): {cursoEncontrado.profCurso}')

                    realizarMatricula = input('\nDeseja realizar a matrícula? [S/N] ').strip().upper()

                    if realizarMatricula == 'S':
                        print(f'\nAluno {alunoEncontrado.nomeAluno} teve a sua matrícula no curso {cursoEncontrado.nomeCurso} efetivada com sucesso!\n')
                        alunoEncontrado.cursosCadastrados.append(cursoEncontrado)
                    else:
                        print('\nMatrícula cancelada com sucesso!\n')

            vouFicar = sairApliativo()
            limpar_tela()

        else:
            limpar_tela()
            print('Não há cursos ou alunos disponíveis, faça os cadastros necessários.')
            vouFicar = sairApliativo()

    # 7. REGISTRAR NOTA
    elif escolha == 7:
        print(f"{'='*50}\n" + "REGISTRAR NOTA".center(50) + f"\n{'='*50}\n")

        if not alunos:
            print("Nenhum aluno cadastrado.\nCadastre um aluno primeiro.\n")
            vouFicar = sairApliativo()
            limpar_tela()

        if not cursos:
            print("Nenhum curso cadastrado.\nCadastre um curso primeiro.\n")
            vouFicar = sairApliativo()
            limpar_tela()


        print("ALUNOS:\n")
        listarAlunos()
        alunoEncontrado = digiteIDaluno()

        if not alunoEncontrado.cursosCadastrados:
            print(f"\n{alunoEncontrado.nomeAluno} não possui nenhum curso matriculado.")
            print("Não é possível registrar notas.\n")
            vouFicar = sairApliativo()
            limpar_tela()

        print(f"\nAluno selecionado: {alunoEncontrado.nomeAluno}\n")
        print("CURSOS MATRICULADOS:\n")
        for curso in alunoEncontrado.cursosCadastrados:
            print(f"ID: {curso.idCurso} - {curso.nomeCurso}")
        print()

        cursoEncontrado = digiteIDcursoMatriculado(alunoEncontrado)

        if cursoEncontrado.idCurso in alunoEncontrado.notas_por_curso:

            print(f"\n{alunoEncontrado.nomeAluno} já possui notas registradas para {cursoEncontrado.nomeCurso}.")
            substituir = input("Deseja substituir? [S/N] ").strip().upper()

            if substituir != 'S':
                print("Operação cancelada.\n")
                vouFicar = sairApliativo()
                limpar_tela()
                continue

        limpar_tela()
        print(f"{'='*50}\n" + f"{cursoEncontrado.nomeCurso.upper()}".center(50) + f"\n{'='*50}\n")
        print(f"Aluno: {alunoEncontrado.nomeAluno}")
        print(f"Professor: {cursoEncontrado.profCurso}")
        print(f"Carga horária: {cursoEncontrado.cargaHorariaCurso} horas\n")

        n1 = validarNota("Nota 1: ")
        n2 = validarNota("Nota 2: ")
        n3 = validarNota("Nota 3: ")

        alunoEncontrado.notas_por_curso[cursoEncontrado.idCurso] = [n1, n2, n3]

        media = (n1 + n2 + n3) / 3

        if media >= 7:
            situacao = "APROVADO"
        elif media >= 5:
            situacao = "RECUPERAÇÃO"
        else:
            situacao = "REPROVADO"

        print("-" * 50)
        print(f"\nMédia: {round(media, 2):.2f}")
        print(f"Situação: {situacao}\n")
        print(f"{'='*50}")
        print("NOTAS REGISTRADAS COM SUCESSO!".center(50))
        print(f"{'='*50}\n")

        vouFicar = sairApliativo()
        limpar_tela()

    elif escolha == 0:
        print('Encerrando o programa...')