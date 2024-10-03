package AulaDia27_09.ExercicioHospital;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

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

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
        String retorno = "Nome: "+nome+" "+sobrenome+"\n";
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formatoBr.format(this.dataNascimento);
        retorno += "Data de nascimento: "+data+"\n";
        retorno += "Idade: "+getidade();
        return retorno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(nome, paciente.nome) && Objects.equals(sobrenome, paciente.sobrenome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, sobrenome);
    }
}
