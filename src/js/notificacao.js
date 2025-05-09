document.getElementById('compromisso-form').addEventListener('submit', function(event) {
    event.preventDefault();

    // Obter os valores do formulário
    const compromissoTipo = document.getElementById('compromisso').value;
    const data = document.getElementById('data').value;
    const antecedencia = document.getElementById('antecedencia').value;
    const unidade = document.getElementById('unidade').value;
    const importancia = document.getElementById('importancia').value;

    // Converter a data para formato Date
    const dataCompromisso = new Date(data);

    // Calcular o tempo de antecedência
    let antecedenciaMs;
    if (unidade === 'dias') {
        antecedenciaMs = antecedencia * 24 * 60 * 60 * 1000;
    } else if (unidade === 'horas') {
        antecedenciaMs = antecedencia * 60 * 60 * 1000;
    } else if (unidade === 'meses') {
        antecedenciaMs = antecedencia * 30 * 24 * 60 * 60 * 1000;
    }

    // Calcular a data da notificação
    const dataNotificacao = new Date(dataCompromisso.getTime() - antecedenciaMs);

    // Criar o item de compromisso
    const compromissoItem = document.createElement('div');
    compromissoItem.classList.add('compromisso-item', importancia);

    compromissoItem.innerHTML = `
        <p><strong>${compromissoTipo}</strong>: ${dataCompromisso.toLocaleString()}<br>Notificação em: ${dataNotificacao.toLocaleString()}</p>
        <button class="remover">Remover</button>
    `;

    // Adicionar o compromisso à lista
    document.getElementById('lista-compromissos').appendChild(compromissoItem);

    // Limpar o formulário
    document.getElementById('compromisso-form').reset();

    // Adicionar funcionalidade de remover compromisso
    compromissoItem.querySelector('.remover').addEventListener('click', function() {
        compromissoItem.remove();
    });

    // Notificar o usuário com antecedência (simulando com alertas para simplificação)
    const tempoParaNotificar = dataNotificacao.getTime() - Date.now();
    if (tempoParaNotificar > 0) {
        setTimeout(() => {
            alert(`Lembrete: ${compromissoTipo} para o seu pet!`);
        }, tempoParaNotificar);
    } else {
        alert('Data já passou!');
    }
});