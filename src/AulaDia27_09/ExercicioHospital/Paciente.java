package AulaDia27_09.ExercicioHospital;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private ArrayList<Atendimento> atendimentos;

    public Paciente(){
        atendimentos = new ArrayList<Atendimento>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void adicionarConsulta(Atendimento atendimento){
        atendimentos.add(atendimento);
    }

    public int getidade(){
        LocalDate dataAtual = LocalDate.now();
        //Calcula a diferença entre as datas
        Period periodo = Period.between(dataNascimento,dataAtual);
        //Obtém a idade da pessoa
        return periodo.getYears();
    }
    @Override
    public String toString(){
        String retorno = "Nome: "+nome+" "+sobrenome;
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formatoBr.format(this.dataNascimento);
        retorno += "Data de nascimrnto: "+data;
        retorno += "Idade: "+getidade();
        return retorno;
    }
}
