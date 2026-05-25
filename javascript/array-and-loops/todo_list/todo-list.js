const todolist = []; // Agora armazena objetos {tarefa, data}

renderizarListaTarefas();

function renderizarListaTarefas(){
    let todolistHTML = '';

    for (let i = 0; i < todolist.length; i++){
        const item = todolist[i]; // Renomeado para item (mais claro)
        const html = `<p>
            ${item.tarefa} 
            <span style="color: #666; font-size: 0.9em;">(${item.data})</span>
            <button onclick = "
                todolist.splice(${i}, 1);
                renderizarListaTarefas();
            ">Deletar</button>
        </p>`;
        todolistHTML += html;
    }

    console.log(todolistHTML);

    document.querySelector('#resposta')
        .innerHTML = todolistHTML;
}

function AddTarefa(){
    const tarefaInput = document.querySelector('#tarefaInput');
    const dataInput = document.querySelector('#dataInput');
    
    const novaTarefa = tarefaInput.value.trim();
    const novaData = dataInput.value || 'Sem data';

    if (novaTarefa) {
        todolist.push({
            tarefa: novaTarefa,
            data: novaData
        });
        console.log(todolist);
        
        tarefaInput.value = '';
        dataInput.value = '';
        renderizarListaTarefas();
    }
}