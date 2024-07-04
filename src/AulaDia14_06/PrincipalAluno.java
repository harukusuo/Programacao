package AulaDia14_06;

import java.util.Random;
import java.util.Scanner;

public class PrincipalAluno {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        //Aluno a1 = new Aluno();
        System.out.println("Nome: ");
        String nome = ler.next();
        System.out.println("Sobrenome: ");
        String sobrenome = ler.next();
        Aluno a1 = new Aluno(nome, sobrenome);
        System.out.println("Email: ");
        a1.email = ler.next();
        a1.codigo = new Random().nextInt(1000,10000);
        System.out.println("Aluno "+a1.nome+" cadastrado com o código "+a1.codigo+".");
        System.out.println("Qual é a primeira nota do aluno "+a1.nome+"; ");
        a1.n1 = ler.nextFloat();
        System.out.println("Qual é a segunda nota do aluno "+a1.nome+": ");
        a1.n2 = ler.nextFloat();
        System.out.println("O aluno "+a1.nome+" tem média "+a1.calculaMedia());
        System.out.println("e está "+a1.obterStatus());


        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno("João");
        Aluno a4 = new Aluno ("Jonas","Silva");
    }
}
