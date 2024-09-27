package AulaDia27_09.Lista;

public class Teste4 {
    public static void main(String[]args){
        Vetor vetor = new Vetor(4);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        vetor.adiciona("elemento 4");
        int posicao = vetor.buscaElemento("elemento 2");
        if(posicao>=0)
            System.out.println("O elemento elemeto 2 está na posição "+posicao);
        else
            System.out.println("O elemento não foi encontrado");
    }
}
