package AulaDia14_05;

public class Aluno {
    String nome;
    String sobrenome;
    String email;
    int codigo;
    float n1;
    float n2;

    public Aluno (){

    }

    public Aluno(String nome){
        this.nome = nome;
    }

    public Aluno(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    void AlterarnNome(String nome){
        this.nome = nome;
    }

    float calculaMedia(){
        return (n1+n2)/2;
    }
    String obterStatus(){
        float media = calculaMedia();
        if (media>=8)
            return "aprovado";
        else if(media>=5)
            return "em recuperação";
        else
            return "reprovado";
    }
}
