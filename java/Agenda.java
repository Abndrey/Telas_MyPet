public class Agenda {
    
    private String tosa;
    private String banho;
    private String checkUp;
    private String consultaMarcada;

    @Deprecated
    public Agenda() {
    }

    public Agenda(String tosa) {
        this.tosa = tosa;
    }

    public String getTosa() {
        return tosa;
    }

    public void setTosa(String tosa) {
        this.tosa = tosa;
    }

    public String getBanho() {
        return banho;
    }

    public void setBanho(String banho) {
        this.banho = banho;
    }

    public String getCheckUp() {
        return checkUp;
    }

    public void setCheckUp(String checkUp) {
        this.checkUp = checkUp;
    }

    public String getConsultaMarcada() {
        return consultaMarcada;
    }

    public void setConsultaMarcada(String consultaMarcada) {
        this.consultaMarcada = consultaMarcada;
    }

    @Override
    public String toString() {
        return "Agenda [tosa=" + tosa + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tosa == null) ? 0 : tosa.hashCode());
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
        Agenda other = (Agenda) obj;
        if (tosa == null) {
            if (other.tosa != null)
                return false;
        } else if (!tosa.equals(other.tosa))
            return false;
        return true;
    }

    public void imprimir(){

        System.out.println(this.toString());
        
    }


}