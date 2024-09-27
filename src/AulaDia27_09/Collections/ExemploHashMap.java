package AulaDia27_09.Collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[]args){
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS","Porto Alegre");
        capitais.put("SC","Florianopolis");
        capitais.put("MG","Belo Horizonte");
        capitais.put("RJ","Rio de Janeiro");
        capitais.put("RS","Rio Grande"); //substitui POA por isso, ou seja, nao repetir sigla, pode repetir cidade
        System.out.println(capitais);
        for(String estado: capitais.keySet())
            System.out.println(estado+" ");
        System.out.println();
        for(String cidade: capitais.values())
            System.out.println(cidade+" ");

        System.out.println("\nA lista contém uma chave 'RS'? "+capitais.containsKey("RS"));
        System.out.println("A lista contém 'Porto Alegre'? "+capitais.containsValue("Porto Alegre"));
    }
}
