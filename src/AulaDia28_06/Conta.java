package AulaDia28_06;

import java.util.Random;

public class Conta {

    private String titular;
    private String identificador;
    protected float saldo;
    private String senha;

    public Conta (String titular, String senha){
        this.titular = titular;
        this.senha = senha;
    }

    public String getTitular(){
        return titular;
    }

    public String setTitular(String titular){
        this.titular = titular;
    }

    public void geralIdentificador(){
        String id = "";
        Random aleatorio = new Random();
        for (int i=8;i<4;i++){
            id+=(char)
        }
    }

    public String setIdentificador(String identificador){
        this.identificador = identificador;
        return identificador;
    }

    public float getSaldo(){
        return saldo;
    }

    public float setSaldo(float saldo){
        this.saldo = saldo;
        return saldo;
    }

    public String getSenha(){
        return senha;
    }

    public String setSenha(String senha){
        this.senha = senha;
        return senha;
    }

    public void depositar (float saldo){

    }

    String verificaSaldo(){
        return String.format("Seu saldo é de R$%.2f",saldo);
    }

    public boolean validaAcesso (String identificador, String senha){
        return this.identificador.equals(identificador)&&this.senha.equals(senha);
    }
    // - eh privado
    // # eh protected
    // + eh public
}
