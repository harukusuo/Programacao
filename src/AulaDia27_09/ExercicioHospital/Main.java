package AulaDia27_09.ExercicioHospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Paciente> pacientes;
    private Scanner ler;

    public Main() {
        pacientes = new ArrayList<>();
        ler = new Scanner(System.in);
    }

    // opcao 1
    public void incluirPaciente() {
        System.out.println("Informe o nome do paciente:");
        String nome = ler.nextLine();
        System.out.println("Informe o sobrenome do paciente:");
        String sobrenome = ler.nextLine();
        System.out.println("Informe a data de nascimento (dd/MM/yyyy):");
        String dataNascStr = ler.nextLine();
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNasc = LocalDate.parse(dataNascStr, formatoBr);

        Paciente novoPaciente = new Paciente();
        novoPaciente.setNome(nome);
        novoPaciente.setSobrenome(sobrenome); // Aqui
        novoPaciente.setDataNascimento(dataNasc);
        pacientes.add(novoPaciente);
        System.out.println("Paciente cadastrado com sucesso.");
    }

    // auxiliar da opcao 5
    public Paciente buscarPacientePorNome(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equalsIgnoreCase(nome)) {
                return paciente;
            }
        }
        return null;
    }

    // opcao 2
    public void alterarPaciente() {
        System.out.println("Informe o nome do paciente para alteração:");
        String nome = ler.nextLine();
        Paciente paciente = buscarPacientePorNome(nome);
        if (paciente != null) {
            System.out.println("Informe o novo nome do paciente:");
            paciente.setNome(ler.nextLine());
            System.out.println("Paciente alterado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // opcao 3
    public void realizarAtendimento() {
        System.out.println("Informe o nome do paciente:");
        String nome = ler.nextLine();
        Paciente paciente = buscarPacientePorNome(nome);
        if (paciente != null) {
            System.out.println("Informe a descrição do atendimento:");
            String descricao = ler.nextLine();
            Atendimento atendimento = new Atendimento(LocalDate.now(), descricao); // Passa a data atual corretamente
            paciente.adicionarConsulta(atendimento);
            System.out.println("Atendimento registrado com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }


    // opcao 4
    public void listarPacientes() {
        if (pacientes==null || pacientes.isEmpty()) {
            System.out.println("Sem pacientes.");
            return;
        }
        for (Paciente paciente : pacientes) {
            System.out.println(paciente);
        }
    }

    // opcao 5
    public void mostrarPaciente() {
        System.out.println("Informe o nome do paciente:");
        String nome = ler.nextLine();
        Paciente paciente = buscarPacientePorNome(nome);
        if (paciente != null) {
            System.out.println(paciente);
            ArrayList<Atendimento> atendimentos = paciente.getAtendimentos();
            if(atendimentos!=null && !atendimentos.isEmpty()) {
                System.out.println("Atendimentos:");
                for (int i = 0; i < atendimentos.size(); i++) {
                    System.out.println(atendimentos.get(i));
                    if ((i + 1) % 5 == 0) {
                        System.out.println("Pressione Enter para continuar...");
                        ler.nextLine();
                    }
                }
            }
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // opcao 6
    public void apagarPaciente() {
        System.out.println("Informe o nome do paciente a ser removido:");
        String nome = ler.nextLine();
        Paciente paciente = buscarPacientePorNome(nome);
        if (paciente != null) {
            pacientes.remove(paciente);
            System.out.println("Paciente removido com sucesso.");
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    // main
    public static void main(String[] args) {
        Main sistema = new Main();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("\n1. Incluir Paciente\n2. Alterar Paciente\n3. Realizar Atendimento\n4. Listar Pacientes\n5. Mostrar Paciente\n6. Apagar Paciente\n7. Sair");
            System.out.println("Escolha uma opção:");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    sistema.incluirPaciente();
                    break;
                case 2:
                    sistema.alterarPaciente();
                    break;
                case 3:
                    sistema.realizarAtendimento();
                    break;
                case 4:
                    sistema.listarPacientes();
                    break;
                case 5:
                    sistema.mostrarPaciente();
                    break;
                case 6:
                    sistema.apagarPaciente();
                    break;
                case 7:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
