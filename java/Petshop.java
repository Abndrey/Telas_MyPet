public class Petshop {

    private String nome;
    private String email;
    private String telefone;
    private String cnpj;

    @Deprecated
    public Petshop() {
    }

    public Petshop(String nome){
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == "Petz") {
            System.out.println("Já existe um petshop com esse nome");
        } else{
            this.nome = nome;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone == "998452668") {
            System.out.println("Este telefone já está sendo utilizado");
        } else{
            this.telefone = telefone;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Petshop [nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", cnpj=" + cnpj + "]";
    }

    public void imprimir(){

        System.out.println(this.toString());
        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Petshop other = (Petshop) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

   
