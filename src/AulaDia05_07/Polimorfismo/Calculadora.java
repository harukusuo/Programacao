package AulaDia05_07.Polimorfismo;

public class Calculadora {
    public static void main (String[] args){
        Operacoes op = new Operacoes();
        System.out.println("Somando dois números: "+op.soma(5,6));
        System.out.println("Somando três números: "+op.soma(5,6,8));
        System.out.println("Somando duas strings: "+op.soma("Palavra","casa"));
    }
}
