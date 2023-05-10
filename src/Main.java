import javax.swing.JOptionPane;

/**
 * @author Felipe, Catherine, Camila
 */

public class Main {
    public static void main(String[] args) throws Exception {
        //inicialização das variáveis
        String nome, cpf, endereco;
        int esc, idade, qtdVacinas, faixaEtariaI, faixaEtariaF, idp, idv;

        //inicialização do objeto de Controle app instanciado como Cadastrar, recebe como parametro qtd de pessoas que inicialmente será = 0
		Controle app = new Cadastrar(0);
        
        //do while para manter o usuário no menu
        do{
            //try catch para capturar erros nas entradas de dados
            try{
                //variável de escolha do switch
                esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n" +
                                                                    "1 - Cadastrar\n" +
                                                                    "2 - Editar Cadastro\n" +
                                                                    "3 - Excluir Cadastro\n" +
                                                                    "4 - Listar Pessoas\n" +
                                                                    "5 - Listar Vacinas\n" +
                                                                    "6 - Vacinar\n" +
                                                                    "7 - Dados\n\n" +
                                                                    "0 - Encerrar programa\n\n"));
                
                switch(esc){
                    case 0:
                        //encerrar programa
                        System.exit(esc);
                    case 1:
                        //cadastrar pessoas e vacinas
                        switch(Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n" +
                                                                            "1 - Cadastrar Pessoa\n" +
                                                                            "2 - Cadastrar Vacina\n\n" +
                                                                            "0 - Voltar pro Menu\n\n"))){
                            
                            case 0:
                                //voltar pro menu
                                break;
                            case 1:
                                //cadastra pessoa
                                nome = JOptionPane.showInputDialog("Digite o nome da Pessoa:");
                                cpf = JOptionPane.showInputDialog("Digite o CPF da Pessoa:");
                                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da Pessoa:"));
                                endereco = JOptionPane.showInputDialog("Digite o endereço da Pessoa:");

                                ((Cadastrar)app).addPessoa(new Pessoa(nome, cpf, idade, endereco));
                                break;
                            case 2:
                                //cadastra vacina
                                nome = JOptionPane.showInputDialog("Digite o nome da Vacina:");
                                qtdVacinas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Vacinas:"));
                                faixaEtariaI = Integer.parseInt(JOptionPane.showInputDialog("Digite a faixa etária inicial da Vacina:"));
                                faixaEtariaF = Integer.parseInt(JOptionPane.showInputDialog("Digite a faixa etária final da Vacina:"));

                                ((Cadastrar)app).addVacina(new Vacina(nome, qtdVacinas, faixaEtariaI, faixaEtariaF));
                                break;
                            default:
                                //default
                                erro();
                        }
                        break;
                    case 2:
                        //editar pessoas e vacinas
                        switch(Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n" +
                                                                            "1 - Editar Pessoa\n" +
                                                                            "2 - Editar Vacina\n\n" +
                                                                            "0 - Voltar pro Menu\n\n"))){

                            case 0:
                                //voltar pro menu
                                break;
                            case 1:
                                //editar pessoa
                                idp = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Pessoa que deseja editar:"));
                                nome = JOptionPane.showInputDialog("Edite o nome da Pessoa:",((Cadastrar) ((Cadastrar)app).retornaIdPessoa(idp)).getNome());
                                cpf = JOptionPane.showInputDialog("Edite o CPF da Pessoa:",((Pessoa) ((Cadastrar)app).retornaIdPessoa(idp)).getCpf());
                                idade = Integer.parseInt(JOptionPane.showInputDialog("Edite a idade da Pessoa:",((Pessoa) ((Cadastrar)app).retornaIdPessoa(idp)).getIdade()));
                                endereco = JOptionPane.showInputDialog("Edite o endereço da Pessoa:",((Pessoa) ((Cadastrar)app).retornaIdPessoa(idp)).getEndereco());

                                Pessoa pe = new Pessoa(nome,cpf,idade,endereco);
                                ((Cadastrar)app).editarPessoa(idp,pe);
                                break;
                            case 2:
                                //editar vacina
                                idv = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Vacina que deseja editar:"));
                                nome = JOptionPane.showInputDialog("Edite o nome da Vacina:",((Cadastrar) ((Cadastrar)app).retornaIdVacina(idv)).getNome());
                                qtdVacinas = Integer.parseInt(JOptionPane.showInputDialog("Edite a quantidade de Vacinas:",((Vacina) ((Cadastrar)app).retornaIdVacina(idv)).getQtdVacinas()));
                                faixaEtariaI = Integer.parseInt(JOptionPane.showInputDialog("Edite a faixa etária inicial da Vacina:",((Vacina) ((Cadastrar)app).retornaIdVacina(idv)).getFaixaEtariaI()));
                                faixaEtariaF = Integer.parseInt(JOptionPane.showInputDialog("Edite a faixa etária final da Vacina:",((Vacina) ((Cadastrar)app).retornaIdVacina(idv)).getFaixaEtariaF()));

                                Vacina ve = new Vacina(nome,qtdVacinas,faixaEtariaI,faixaEtariaF);
                                ve.setPessoasVacinadas(((Vacina) ((Cadastrar)app).retornaIdVacina(idv)).getPessoasVacinadas());
                                ((Cadastrar)app).editarVacina(idv,ve);
                                break;
                            default:
                                //default
                                erro();
                        }
                        break;
                    case 3:
                        //excluir pessoas e vacinas
                        switch(Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n\n" +
                                                                            "1 - Excluir Pessoa\n" +
                                                                            "2 - Excluir Vacina\n\n" +
                                                                            "0 - Voltar pro Menu\n\n"))){

                            case 0:
                                //voltar pro menu
                                break;
                            case 1:
                                //excluir pessoa
                                idp = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Pessoa que deseja excluir:"));

                                ((Cadastrar)app).excluirPessoa(idp);
                                break;
                            case 2:
                                //excluir vacina
                                idv = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Vacina que deseja excluir:"));

                                ((Cadastrar)app).excluirVacina(idv);
                                break;
                            default:
                                //default
                                erro();
                        }
                        break;
                    case 4:
                        //listar pessoas
                        ((Cadastrar)app).listarPessoas();
                        break;
                    case 5:
                        //listar vacinas
                        ((Cadastrar)app).listarVacinas();
                        break;
                    case 6:
                        //vacinar
                        idp = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Pessoa que deseja vacinar:"));
                        idv = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da Vacina que deseja utilizar:"));

                        ((Cadastrar)app).vacinar(idp, idv);
                        break;
                    case 7:
                        //dados gerais
                        JOptionPane.showMessageDialog(null, app.toString());
                        break;
                    default:
                        //default
                        erro();
                }
            }catch(Exception Erro){
                //mensagem de erro do try catch
                JOptionPane.showMessageDialog(null,"Informações em branco ou digitadas incorretamente! Tente novamente!","Erro",JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
    }

    //método que retorna mensagem de erro
    public static void erro(){
        JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente!","Erro",JOptionPane.ERROR_MESSAGE);
    }
}