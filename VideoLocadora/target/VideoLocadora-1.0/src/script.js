// Função para editar nome
function editarNome(button) {
    var row = button.parentNode.parentNode;
    var cells = row.getElementsByTagName("td");

    var currentId = cells[0].innerHTML.trim();  // ID do ator
    var currentValue = cells[1].innerHTML.trim();  // Nome atual do ator

    // Salvar o valor original como um atributo data
    cells[1].setAttribute('data-original', currentValue);

    // Adicionar o campo de edição para o nome
    cells[1].innerHTML = '<input type="text" id="novo" class="edit-input form-control" value="' + currentValue + '">';

    // Adicionar o botão de salvar e cancelar
    cells[2].innerHTML =
            '<form method="post" action="cadastrarAtor" onsubmit="this.nome.value = document.getElementById(\'novo\').value" style="display:inline;">' +
            '<input type="hidden" name="id" value="' + currentId + '">' +
            '<input type="hidden" name="nome">' + // O valor será atualizado na submissão
            '<input type="hidden" name="hid" value="1">' +
            '<button class="btn btn-warning">Salvar</button>' +
            ' </form>' +
            '<button class="btn btn-danger" onclick="cancelarEdicao(this)">Cancelar</button>';
}

// Função para cancelar edição
function cancelarEdicao(button) {
    var row = button.parentNode.parentNode;
    var cells = row.getElementsByTagName("td");

    // Restaurar o valor original do nome
    var originalValue = cells[1].getAttribute('data-original');
    cells[1].innerHTML = originalValue;

    // Restaurar os botões originais (Editar e Excluir)
    cells[2].innerHTML =
            '<button class="btn btn-primary" onclick="editarNome(this)">Editar</button> ' +
            '<form method="post" action="cadastrarAtor" style="display:inline;">' +
            '<input type="hidden" name="id" value="' + cells[0].innerHTML.trim() + '">' + // ID do ator
            '<input type="hidden" name="hid" value="2">' + // Valor de hid para exclusão
            '<button class="btn btn-danger">Excluir</button>' +
            '</form>';
}



