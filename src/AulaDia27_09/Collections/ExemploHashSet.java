package AulaDia27_09.Collections;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[]args){
        HashSet<String> lista = new HashSet<>();
        lista.add("Arroz");
        lista.add("Feijão");
        lista.add("Tomates");
        lista.add("Arroz");
        System.out.println(lista);
    }
}
