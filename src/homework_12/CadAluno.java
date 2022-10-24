package homework_12;

import java.util.Scanner;

public class CadAluno extends CadastroDePessoas {

    static Scanner read = new Scanner(System.in);
    static CadAluno[] cadA = new CadAluno[10];
    static int qtdA = 0;

    private String turma, turno;

    public CadAluno(String turma, String turno, String nome, String dataNasc, String cpf) {
        super(nome, dataNasc, cpf);
        this.turma = turma;
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public static void cadastroAluno() {
        System.out.println("\n---------------------------");
        System.out.println("\n---CADASTRO DE ALUNOS---\n");
        System.out.print("Digite o nome: ");
        String nome = read.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String dataNasc = read.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = read.nextLine();

        System.out.print("Digite a turma: ");
        String turma = read.nextLine();

        System.out.print("Digite o turno: ");
        String turno = read.nextLine();

        cadA[qtdA] = new CadAluno(turma, turno, nome, dataNasc, cpf);
        qtdA++;

        System.out.println("\nCadastro efetuado com sucesso!!!\n");
    }

    public static void exibeAluno() {

        System.out.println("\n\n==============Relatório de Cadastro de Alunos==============");

        if (cadA[0] == null) {
            System.out.println("\n ## Não há alunos Cadastrados! ##\n\n");
        } else {

            for (int i = 0; i < cadA.length; i++) {

                if (cadA[i] != null) {
                    System.out.println("\n------ Cadastro: " + (i + 1) + " ------");
                    System.out.println("\nNome: " + cadA[i].getNome()
                            + "\nData de Nascimento: " + cadA[i].getDataNasc()
                            + "\nCPF: " + cadA[i].getCpf()
                            + "\nMatérias: " + cadA[i].getTurma()
                            + "\nTurnos: " + cadA[i].getTurno()
                    );

                } else {
                    break;
                }

            }

        }
    }

}
