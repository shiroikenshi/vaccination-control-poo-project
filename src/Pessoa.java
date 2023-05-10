/**
 * @author Felipe, Catherine, Camila
 */

public class Pessoa extends Cadastrar {
    private String cpf;
    private int idade;
    private String endereco;

    //construtor
    public Pessoa(String nome, String cpf, int idade, String endereco) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco;
    }

    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //toString
    @Override
    public String toString() {
        return  " \t| Nome: " + getNome() + " \t| CPF: " + getCpf() + " \t| Idade: " + getIdade() + " anos \t| Endereço: " + getEndereco() + "\n";
    }
}