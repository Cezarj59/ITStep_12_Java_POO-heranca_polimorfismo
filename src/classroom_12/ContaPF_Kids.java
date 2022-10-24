package classroom_12;

import java.util.Scanner;

public class ContaPF_Kids extends Conta {

    private String nomeResponsavel, cpfResponsavel, nome, cpf;

     public ContaPF_Kids(String nomeResponsavel, String cpfResponsavel, String nome, String cpf, String numero, String agencia, double saldo) {
        super(numero, agencia, saldo);
        this.nomeResponsavel = nomeResponsavel;
        this.cpfResponsavel = cpfResponsavel;
        this.nome = nome;
        this.cpf = cpf;
    }


  
    
    
    
    
    
    
    
   
 public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getCpfResponsavel() {
        return cpfResponsavel;
    }

    public void setCpfResponsavel(String cpfResponsavel) {
        this.cpfResponsavel = cpfResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   

    public static void cadastraPF_Kids(ContaPF_Kids[] array, int qtd) {
        Scanner read = new Scanner(System.in);
        read.nextLine();

        System.out.print("Qual o número da Conta? ");
        String numeroPK = read.nextLine();

        System.out.print("Qual número da Agência? ");
        String agenciaPk = read.nextLine();

        System.out.print("Qual depósito inicial? ");
        double saldoPK = read.nextDouble();
        
        read.nextLine();
        System.out.print("Qual o nome do Responsavel? ");
        String nomeR = read.nextLine();

        System.out.print("Qual o CPF do Responsavel? ");
        String cpfR = read.nextLine();

        System.out.print("Qual o nome? ");
        String nomeK = read.nextLine();

        System.out.print("Qual o CPF? ");
        String cpfK = read.nextLine();

        array[qtd] = new ContaPF_Kids(nomeR,cpfR,nomeK,cpfK,numeroPK,  agenciaPk, saldoPK);
        qtd++;
    }

   

}
