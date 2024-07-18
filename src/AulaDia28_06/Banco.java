package AulaDia28_06;

import java.util.Scanner;

public class Banco {

    private static ContaCorrente[] listaCC = new ContaCorrente[20];
    private static ContaPoupanca[] listaCP = new ContaPoupanca[20];
    private static int contCC = 0;
    private static int contCP = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opc;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("cc - Cadastrar conta corrente");
            System.out.println("cp - Cadastrar conta poupança");
            System.out.println("acc - Acessar conta corrente");
            System.out.println("acp - Acessar conta poupança");;
            opc = scanner.next();

            switch (opc) {
                case "cc":
                    cadastrarContaCorrente();
                    break;
                case "cp":
                    cadastrarContaPoupanca();
                    break;
                case "acc":
                    acessarContaCorrente();
                    break;
                case "acp":
                    acessarContaPoupanca();
                    break;
            }
        } while (!opc.equals("0"));

        scanner.close();
    }

    public static void cadastrarContaCorrente() {
        String titular = leString("Nome do titular");
        String senha = leString("Senha");
        float limite = leFloat("Limite");
        listaCC[contCC++] = new ContaCorrente(titular, senha, limite);
        System.out.println("Conta corrente cadastrada com sucesso!");
    }

    public static void cadastrarContaPoupanca() {
        String titular = leString("Nome do titular");
        String senha = leString("Senha");
        float deposito = leFloat("Depósito inicial");
        listaCP[contCP++] = new ContaPoupanca(titular, senha, deposito);
        System.out.println("Conta poupança cadastrada com sucesso!");
    }

    public static void acessarContaCorrente() {
        String identificador = leString("Identificador");
        String senha = leString("Senha");

        for (int i = 0; i < contCC; i++) {
            if (listaCC[i].validaAcesso(identificador, senha)) {
                System.out.println("Acesso concedido à conta corrente.");
                return;
            }
        }
        System.out.println("Conta corrente não encontrada ou dados inválidos.");
    }

    public static void acessarContaPoupanca() {
        String identificador = leString("Identificador");
        String senha = leString("Senha");

        for (int i = 0; i < contCP; i++) {
            if (listaCP[i].validaAcesso(identificador, senha)) {
                System.out.println("Acesso concedido à conta poupança.");
                return;
            }
        }
        System.out.println("Conta poupança não encontrada ou dados inválidos.");
    }

    public static String leString(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem + ": ");
        return ler.next();
    }

    public static float leFloat(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem + ": ");
        return ler.nextFloat();
    }
}