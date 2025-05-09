document.getElementById('formAgendamento').addEventListener('submit', function(e) {
    e.preventDefault();
  
    const nomeTutor = document.getElementById('nomeTutor').value;
    const telefone = document.getElementById('telefone').value;
    const nomePet = document.getElementById('nomePet').value;
    const especie = document.getElementById('especie').value;
    const servico = document.getElementById('servico').value;
    const dataHora = document.getElementById('dataHora').value;
  
    const resultado = document.getElementById('resultado');
    resultado.style.display = 'block';
    resultado.innerHTML = `
      <strong>Agendamento Confirmado!</strong><br>
      Tutor: ${nomeTutor}<br>
      Telefone: ${telefone}<br>
      Pet: ${nomePet} (${especie})<br>
      Serviço: ${servico}<br>
      Data e Hora: ${new Date(dataHora).toLocaleString()}
    `;
  
    this.reset();
  });
  