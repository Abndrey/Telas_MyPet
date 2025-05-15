package java;

public class ReponsavelMoreno {
    private String nome;
    private String email;  
    private String telefone; 
    private String cpf; 
    private String senha;

@Deprecated
    public ReponsavelMoreno() {
    }

    

    public ReponsavelMoreno(String nome) {
        setNome(nome);
    }
    

//geters




    public String getNome() {
        return nome;
    }


    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }



    public String getCpf() {
        return cpf;
    }



    public String getSenha() {
        return senha;
    }



//seters


    public void setNome(String nome) {
        if(nome.equals("Donoud Trump")) {
            System.out.println("Este nome é invalido");
        } else {
            this.nome = nome;
        }
    }

    public void setEmail(String email) {
        if(email.equals("capetinhaDoGrau@remail.")) {
            System.out.println("Este email é invalido");
        } else {
            this.email = email;
        }
    }

    public void setTelefone(String telefone) {
        if(telefone.length() < 8) {
            System.out.println("Este telefone é invalido");
        } else {
            this.telefone = telefone;
        }
    }

    public void setCpf(String cpf) {
        if(cpf.length() > 14) {
            System.out.println("Ultrapassou seus caracteres");
        } else {
            this.cpf = cpf;
        }
    }

    public void setSenha(String senha) {
        if(senha.length() < 5) {
            System.out.println("A senha deve ter mais caracteres");
        } else {
            this.senha = senha;
        }
    }

    @Override
    public String toString() {
        return "Reponsavel " + nome + ", email=" + email + ", telefone=" + telefone + ", cpf=" + cpf + ", senha=" + senha;
    }



    
    public void imprimir(){
        System.out.println(this.toString());
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReponsavelMoreno other = (ReponsavelMoreno) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (senha == null) {
            if (other.senha != null)
                return false;
        } else if (!senha.equals(other.senha))
            return false;
        return true;
    }


    

}
