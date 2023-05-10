import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * @author Felipe, Catherine, Camila
 */

public class Cadastrar extends Controle{
    private int qtdPessoas = 0;
    private int qtdVacinas = 0;
    private int qtdPessoasVacinadas = 0;
    private String nome;
    private ArrayList<Vacina> vacinas;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Pessoa> pessoasV;

    //construtores
    public Cadastrar(String nome){
        this.nome = nome;
    }

    public Cadastrar(int qtdPessoas){
        vacinas = new ArrayList<Vacina>();
        pessoas = new ArrayList<Pessoa>();
        pessoasV = new ArrayList<Pessoa>();
        this.qtdPessoas = qtdPessoas;
    }

    //métodos Vacina
    public void addVacina(Vacina vacina){
        vacinas.add(vacina);
        setQtdVacinas(getQtdVacinas() + 1);
        JOptionPane.showMessageDialog(null, "A vacina da " + vacina.getNome() + " foi cadastrada com sucesso!","Cadastro bem sucedido", JOptionPane.INFORMATION_MESSAGE);
    }

    public void editarVacina(int index, Vacina vacina){
        index--;
        JOptionPane.showMessageDialog(null, "A vacina da " + vacina.getNome() + " foi editada com sucesso.");
        vacinas.set(index, vacina);
    }

    public void excluirVacina(int index) {
		index--;
        JOptionPane.showMessageDialog(null, "A vacina da " + vacinas.get(index).getNome() + " foi excluida.");
		vacinas.remove(index);
        setQtdVacinas(getQtdVacinas() - 1);
	}

    public Object retornaIdVacina(int index) {
        index--;
        return vacinas.get(index);
    }

    public int calculaQtdVacinas() {
        int resp  = 0;
        for (Vacina vacina : vacinas) 
			if(vacina instanceof Vacina) {
				resp += ((Vacina) vacina).getQtdVacinas();
			}
        return resp;
    }

    //métodos Pessoa
    public void addPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
		setQtdPessoas(getQtdPessoas() + 1);
        JOptionPane.showMessageDialog(null, pessoa.getNome() + " foi cadastrado(a) com sucesso!","Cadastro bem sucedido", JOptionPane.INFORMATION_MESSAGE);
	}

    public void editarPessoa(int index, Pessoa pessoa) {
		index--;
        JOptionPane.showMessageDialog(null, pessoas.get(index).getNome() + " foi editado.");
		pessoas.set(index, pessoa);
	}

    public void excluirPessoa(int index) {
		index--;
        JOptionPane.showMessageDialog(null, pessoas.get(index).getNome() + " foi excluido.");
		pessoas.remove(index);
        setQtdPessoas(getQtdPessoas() - 1);
	}

    public Object retornaIdPessoa(int index) {
        index--;
        return pessoas.get(index);
    }

    //métodos listar
    public void listarVacinas() {
        String texto = "\n=> " + vacinas.size() + " tipos de vacina\n";
		int v = 1;
		for (Vacina vacina : vacinas) 
			if(vacina instanceof Vacina) {
				texto += "id: " + v + ((Vacina) vacina).toString();
				v++;
			}
        JOptionPane.showMessageDialog(null, texto);
	}

    public void listarPessoas() {
        String texto = "\n=> " + pessoas.size() + " Pessoas (Quantidade)\n";
		int p = 1;
		for (Pessoa pessoa : pessoas)
			if(pessoa instanceof Pessoa) {
				texto += "id: " + p + ((Pessoa) pessoa).toString();
				p++;
			}
		JOptionPane.showMessageDialog(null, texto);
	}

    public String listarPessoasV() {
        String texto = "\n=> Lista Pessoas Vacinadas: " + pessoasV.size() + " Pessoas (Quantidade)\n";
		int p = 1;
		for (Pessoa pessoa : pessoasV)
			if(pessoa instanceof Pessoa) {
				texto += "id: " + p + " \t| Nome: " + ((Pessoa) pessoa).getNome() + " \t| CPF: " + ((Pessoa) pessoa).getCpf() + " \t| Idade: " + ((Pessoa) pessoa).getIdade() + " anos \t| Endereço: " + ((Pessoa) pessoa).getEndereco() + "\n";
				p++;
			}
		return texto;
	}

    //getters e setters
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public int getQtdVacinas() {
        return qtdVacinas;
    }

    public void setQtdVacinas(int qtdVacinas) {
        this.qtdVacinas = qtdVacinas;
    }

    public int getQtdPessoasVacinadas() {
        return qtdPessoasVacinadas;
    }

    public void setQtdPessoasVacinadas(int qtdPessoasVacinadas) {
        this.qtdPessoasVacinadas = qtdPessoasVacinadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //método Vacinar
    public void vacinar(int indexPessoa, int indexVacina){
        indexPessoa--;
        indexVacina--;
        //condição para verificar se a pessoa já foi vacinada
        if (pessoasV.indexOf(pessoas.get(indexPessoa)) == -1) {
            if (pessoas.get(indexPessoa).getIdade() >= vacinas.get(indexVacina).getFaixaEtariaI() && pessoas.get(indexPessoa).getIdade() <= vacinas.get(indexVacina).getFaixaEtariaF()){
                //condição para verificar se existem vacinas disponíveis
                if (vacinas.get(indexVacina).getQtdVacinas() >= 1){
                    //aumenta qtd de pessoas vacinadas com esse tipo de vacina (método da classe Vacina)
                    vacinas.get(indexVacina).setPessoasVacinadas(vacinas.get(indexVacina).getPessoasVacinadas() + 1);
                    //decrementa qtd de vacinas desse tipo (método da classe Vacina)
                    vacinas.get(indexVacina).setQtdVacinas(vacinas.get(indexVacina).getQtdVacinas() - 1);

                    //aumenta qtd de pessoas vacinadas (método da classe Cadastrar)
                    setQtdPessoasVacinadas(getQtdPessoasVacinadas() + 1);
                    //adiciona a pessoa no array de pessoas vacinadas
                    pessoasV.add(pessoas.get(indexPessoa));

                    JOptionPane.showMessageDialog(null, pessoas.get(indexPessoa).getNome() + " de "+ pessoas.get(indexPessoa).getIdade() +" anos, foi vacinado com a " + vacinas.get(indexVacina).getNome() + ".");
                } else {
                    JOptionPane.showMessageDialog(null, "Vacina indisponível, não foi possível vacinar " + pessoas.get(indexPessoa).getNome() + ".");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível vacinar, a idade de " + pessoas.get(indexPessoa).getNome() + " não se encaixa dentro da faixa etária!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível vacinar! " + pessoas.get(indexPessoa).getNome() + " já está vacinado.");
        }
    }

    //toString
    @Override
    public String toString() {
        return "=> Dados Gerais:" +
               "\nPessoas Cadastradas: " + qtdPessoas + " \t| Pessoas Vacinadas: " + qtdPessoasVacinadas +
               "\nVacinas Cadastradas: " + qtdVacinas + " \t| Qtd de Vacinas: " + calculaQtdVacinas() +
               "\n" + listarPessoasV();
    }
}