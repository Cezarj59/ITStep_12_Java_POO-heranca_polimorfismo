
package homework_12;


public class CadastroDePessoas {

    private String nome, dataNasc, cpf;

    public CadastroDePessoas(String nome, String dataNasc, String cpf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
