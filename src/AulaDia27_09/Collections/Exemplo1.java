package AulaDia27_09.Collections;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    public static void main(String[]args){
        List<String> Lista = new ArrayList<>();

        Lista.add("B");
        Lista.add("D");
        Lista.add("E");
        System.out.println(Lista);
        Lista.add(2,"C");
        System.out.println(Lista);
        Lista.add("G");
        Lista.add("F");
        Lista.add("D");
        Lista.add("E");
        System.out.println(Lista);
        Lista.sort(null);
        System.out.println(Lista);
    }
}
