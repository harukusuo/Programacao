package AulaDia14_06;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Qual o nome: ");
        p1.nome = ler.next();
        System.out.println("Qual o sobrenome do "+p1.nome+": ");
        p1.sobrenome = ler.next();
        System.out.println("Qual a idade do "+p1.nome+": ");
        p1.idade = ler.nextInt();
        System.out.println("Qual a altura do "+p1.nome+": ");
        p1.altura = ler.nextInt();
        System.out.println(p1.obterDados());


        p1.falar();
        p1.correr();
        p1.parar();
    }
}
