package AulaDia27_09.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListaPessoa {

    public static void main(String[]args){
        List<Pessoa> Lista = new ArrayList<>();
        //...
        Lista.add(new Pessoa("Ana","Silva"));
        Pessoa p1 = new Pessoa("Pedro","fones");
        Lista.add(p1);
        System.out.println(Lista);
    }
}
