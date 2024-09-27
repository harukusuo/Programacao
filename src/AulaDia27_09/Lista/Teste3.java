package AulaDia27_09.Lista;

public class Teste3 {
    public static void main(String[]args){
        Vetor vetor = new Vetor(3);
        vetor.adiciona("Elemento 1");
        vetor.adiciona("Elemento 2");
        vetor.adiciona("Elemento 3");
        String elemento = vetor.obterElemento(2);
        System.out.println(elemento);
    }
}
