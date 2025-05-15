package com.OliMor.modelo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String complemento;
    
    
    public Endereco(){
    }

    public Endereco(String cep){
        this.setCep(cep);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String regex = "^\\d{5}-\\d{3}$";
        //String regex = "a-z";  
        Pattern pattern = Pattern.compile(regex);
        // boolean resposta = pattern.equals(cep);
        Matcher matcher = pattern.matcher(cep);

       if (matcher.find()) {
            this.cep = cep;
            System.out.println("CEP válido: " + cep);
        } else {
            System.out.println("CEP inválido: " + cep);
        }
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}
