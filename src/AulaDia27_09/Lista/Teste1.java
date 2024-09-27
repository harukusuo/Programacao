package AulaDia27_09.Lista;

public class Teste1 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(3);
        boolean resposta = vetor.adiciona("A");
        if(resposta) {
            System.out.println("O elemento A foi adicionado ao vetor");
        }
        else{
            System.out.println("O elemento A não pode ser adicionado ao vetor");
        }
    }
}