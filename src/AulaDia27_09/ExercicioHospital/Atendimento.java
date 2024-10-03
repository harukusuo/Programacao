package AulaDia27_09.ExercicioHospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atendimento {
    private LocalDate data;
    private String descricao;

    // Construtor que inicializa a data e a descrição
    public Atendimento(LocalDate data, String descricao) {
        this.data = data;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatoBr.format(this.data);  // Agora a data é formatada corretamente
        String retorno = "Data: " + dataFormatada;
        retorno += "\nInformações: " + descricao;
        return retorno;
    }
}
