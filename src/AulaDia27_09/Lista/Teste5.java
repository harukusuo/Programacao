package AulaDia27_09.Lista;

public class Teste5 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.adiciona("A");
        vetor.adiciona("C");
        vetor.adiciona("D");
        vetor.adiciona("F");
        vetor.adiciona("G");
        System.out.println(vetor);
        vetor.adiciona(1, "B");
        System.out.println(vetor);
        vetor.adiciona(4, "E");
        System.out.println(vetor);
    }
}
