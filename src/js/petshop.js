
document.getElementById("petshopForm").addEventListener("submit", function(event) {
    event.preventDefault();
  
    const nome = document.getElementById("nome").value.trim();
    const email = document.getElementById("email").value.trim();
    const telefone = document.getElementById("telefone").value.trim();
    const cnpj = document.getElementById("cnpj").value.trim();
    const mensagem = document.getElementById("mensagem");
  
    if (!nome || !email || !telefone || !cnpj) {
      mensagem.style.color = "red";
      mensagem.textContent = "Por favor, preencha todos os campos corretamente.";
      return;
    }
  
    mensagem.style.color = "green";
    mensagem.textContent = "Cadastro realizado com sucesso!";
    this.reset();
  });
  