/**
 * @author Felipe, Catherine, Camila
 */

public class Vacina extends Cadastrar {
    private int qtdVacinas = 0;
    private int faixaEtariaI = 0;
    private int faixaEtariaF = 0;
    private int pessoasVacinadas = 0;

    //construtor
    public Vacina(String nome, int qtdVacinas, int faixaEtariaI, int faixaEtariaF) {
        super(nome);
        this.qtdVacinas = qtdVacinas;
        this.faixaEtariaI = faixaEtariaI;
        this.faixaEtariaF = faixaEtariaF;
    }

    //getters e setters
    public int getQtdVacinas() {
        return qtdVacinas;
    }

    public void setQtdVacinas(int qtdVacinas) {
        this.qtdVacinas = qtdVacinas;
    }

    public int getFaixaEtariaI() {
        return faixaEtariaI;
    }

    public void setFaixaEtariaI(int faixaEtariaI) {
        this.faixaEtariaI = faixaEtariaI;
    }

    public int getFaixaEtariaF() {
        return faixaEtariaF;
    }

    public void setFaixaEtariaF(int faixaEtariaF) {
        this.faixaEtariaF = faixaEtariaF;
    }

    public int getPessoasVacinadas() {
        return pessoasVacinadas;
    }

    public void setPessoasVacinadas(int pessoasVacinadas) {
        this.pessoasVacinadas = pessoasVacinadas;
    }

    //toString
    @Override
    public String toString() {
        return " \t| Nome: " + getNome() + " \t| Quantidade: " + getQtdVacinas() + " \t| Faixa Etária: " + getFaixaEtariaI() + " ~ " + getFaixaEtariaF() + " \t| Qtd Pessoas Vacinadas: " + getPessoasVacinadas() +"\n";
    }
}