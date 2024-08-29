package AulaDia05_07.Polimorfismo;

public class Operacoes {

    //acho q isso é um exemplo de polimorfismo estilo overload

    //vai chamar esse qnd tivee 2 ints
    public float soma (int n1, int n2){
        return n1+n2;
    }

    //vai chamar esse qnd tiver 3 ints
    public float soma (int n1, int n2, int n3){
        return n1+n2+n3;
    }

    //vai chamar esse qnd tiver 2 strings
    public String soma (String s1, String s2){
        return s1+" "+s2;
    }
}
