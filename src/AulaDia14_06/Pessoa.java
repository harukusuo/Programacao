package AulaDia14_06;

public class Pessoa {
    String nome;
    String sobrenome;
    int idade;
    int altura;


    void correr(){
        System.out.println(nome+" "+sobrenome+" está correndo...");
    }


    void falar(){
        System.out.println(nome+" "+sobrenome+" está falando...");
    }


    void parar(){
        System.out.println(nome+" "+sobrenome+" está parado...");
    }
    String obterDados(){
        return "Nome: "+nome+" "+sobrenome+"\nIdade: "+idade+"\nAltura: "+altura;
    }
}
