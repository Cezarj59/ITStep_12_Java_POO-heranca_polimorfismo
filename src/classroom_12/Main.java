package classroom_12;

import java.util.Scanner;

public class Main {
    static ContaPJ [] contasPj = new ContaPJ[10];
    static ContaPF [] contasPf = new ContaPF[10];
    static ContaPF_Kids [] contasPf_Kids = new ContaPF_Kids[10];    
    static int qtdCPf = 0;
    static int qtdCPj = 0;
    static int qtdCPk = 0;
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        while (0==0){
            System.out.println("\n\n######## Sistema Bancário ##########");
            System.out.println("====================================");
            System.out.println("(0)||SAIR||");
            System.out.println("(1) Cadastros");
            System.out.println("(2) Consultas");
            System.out.print("Escolha uma opção: ");
            int opcao = read.nextInt();

            switch (opcao){
                case 1:
                    menuCadastro();
                    break;
                case 2:
                    menuConsulta();
                    break;
                default:
                    System.out.println("\n\nErrou, tenta outra vez!!!\n\n");
            }
        }
    }
    public static void menuCadastro(){
        System.out.println("\n\n######## CADASTROS ##########");
        System.out.println("====================================");
        System.out.println("(1) Conta PF");
        System.out.println("(2) Conta PJ");
         System.out.println("(3) Conta PFKids");
        System.out.print("Escolha uma opção: ");
        int opcao = read.nextInt();

        switch (opcao){
            case 1:
                ContaPF.cadastraPF(contasPf,qtdCPf);
                break;
            case 2:
                ContaPJ.cadastraPJ(contasPj,qtdCPj);
                break;
                 case 3:
                ContaPF_Kids.cadastraPF_Kids(contasPf_Kids,qtdCPk);
                break;
            default:
                System.out.println("\n\nErrou! Tente Novamente!!\n\n");
        }
    }

    public static void menuConsulta(){
        System.out.println("\n\n######## CONSULTAS ##########");
        System.out.println("====================================");
        System.out.println("(1) Conta PF");
        System.out.println("(2) Conta PJ");
         System.out.println("(3) Conta PFKids");
        System.out.print("Escolha uma opção: ");
        int opcao = read.nextInt();

        switch (opcao){
            case 1:
                consultaPF();
                break;
            case 2:
                consultaPJ();
                break;
                 case 3:
                consultaPF_Kids();
                break;
            default:
                System.out.println("\n\nErrou! Tente Novamente!!\n\n");
        }
    }

    public static void consultaPJ(){

        System.out.println("\n\n==============Relatório de Contas PJ==============");
        if(contasPj[0] == null){
            System.out.println("\n ## Não há contas Cadastradas! ##\n\n");
        }else{
            for(int i = 0; i< contasPj.length; i++){
                if(contasPj[i] == null) break;
                System.out.println("Agência: " + contasPj[i].getAgencia());
                System.out.println("Conta: " + contasPj[i].getNumero());
                System.out.println("Razão Social: " + contasPj[i].getRazaoSocial());
                System.out.println("CNPJ: " + contasPj[i].getCnpj());
                System.out.println("Saldo Atual: " + contasPj[i].getSaldo());
                System.out.println("---------------------------------------------\n");
            }
        }
    }

    public static void consultaPF(){

        System.out.println("\n\n==============Relatório de Contas PF==============");
        if(contasPf[0] == null){
            System.out.println("\n ## Não há contas Cadastradas! ##\n\n");
        }else{
            for(int i = 0; i< contasPf.length; i++){
                if(contasPf[i] == null) break;
                System.out.println("Agência: " + contasPf[i].getAgencia());
                System.out.println("Conta: " + contasPf[i].getNumero());
                System.out.println("Nome: " + contasPf[i].getNome());
                System.out.println("CPF: " + contasPf[i].getCpf());
                System.out.println("Saldo Atual: " + contasPf[i].getSaldo());
                System.out.println("---------------------------------------------\n");
            }
        }
    }
         public static void consultaPF_Kids(){

        System.out.println("\n\n==============Relatório de Contas PF_Kids==============");
        if(contasPf_Kids[0] == null){
            System.out.println("\n ## Não há contas Cadastradas! ##\n\n");
        }else{
            for(int i = 0; i< contasPf_Kids.length; i++){
                if(contasPf_Kids[i] == null) break;
                System.out.println("Agência: " + contasPf_Kids[i].getAgencia());
                System.out.println("Conta: " + contasPf_Kids[i].getNumero());
                System.out.println("Nome: " + contasPf_Kids[i].getNome());
                System.out.println("CPF: " + contasPf_Kids[i].getCpf());
                System.out.println("Saldo Atual: " + contasPf_Kids[i].getSaldo());
                System.out.println("---------------------------------------------\n");
            }
        }
    }
}

