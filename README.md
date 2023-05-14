# <div align="center"><a href="/README.md">Português</a> | <a href="/README_EN.md">Inglês</a></div>
<br><br>
# Programação Orientada a Objetos - Sistema de Controle de Vacinação
Este repositório contém um sistema de controle de vacinação implementado em Java utilizando Programação Orientada a Objetos. O sistema permite o cadastro, edição, listagem e exclusão de pessoas e vacinas, conta com uma função que permite vacinar uma pessoa (selecionando um cadastro válido de pessoa e vacina) e um recurso que exibe ao usuário dados gerais do sistema, como por exemplo uma lista de pessoas vacinadas, quantidade de pessoas/vacinas cadastradas e quantidade geral de doses disponíveis.

### Autores
* Felipe Pinto da Silva
* Catherine Ferreira Honorato
* Camila Ferreira de Sousa

### Funcionalidades
#### Classe Controle
A classe Controle é nossa única classe abstrata da aplicação, ela foi integrada seguindo alguns requisitos iniciais do nosso projeto. Nossa aplicação deveria possuir uma classe abstrata, e durante o desenvolvimento deveriamos aplicar os conceitos de Polimorfismo e Casting. Dito isso a classe Controle representa o controle de vacinação e possui somente um método abstrato:

##### Método:
* toString(): Definindo esse método abstrato dentro da nossa classe abstrata, temos que todas as subclasses da nossa aplicação deverão implementar esse método utilizando o @Override.

#### Classe Cadastrar (extends Controle)
A classe Cadastrar é uma extensão da classe Controle e representa o cadastro e a manipulação de pessoas e vacinas. Ela possui os seguintes atributos e métodos:

##### Atributos:
* qtdPessoas: Armazena a quantidade total de pessoas cadastradas.
* qtdVacinas: Armazena a quantidade total de vacinas cadastradas.
* qtdPessoasVacinadas: Armazena a quantidade total de pessoas vacinadas.
* nome: Armazena o nome da instância de Cadastrar.
* vacinas: Uma lista de objetos Vacina, responsável por armazenar as vacinas cadastradas.
* pessoas: Uma lista de objetos Pessoa, responsável por armazenar as pessoas cadastradas.
* pessoasV: Uma lista de objetos Pessoa, responsável por armazenar as pessoas que foram vacinadas.

##### Métodos:
* Cadastrar(nome): Construtor que será utilizado pelas classes Pessoa e Vacina para herdar o atributo "nome".
* Cadastrar(qtdPessoas): Construtor que recebe a quantidade inicial de pessoas a serem cadastradas. Durante o código ele será instanciado com um objeto da classe Controle, será o objeto responsável por realizar o controle da nossa aplicação.
* addVacina(vacina): Adiciona uma vacina à lista de vacinas e atualiza a quantidade de vacinas cadastradas.
* editarVacina(index, vacina): Edita uma vacina existente na lista de vacinas pelo índice especificado.
* excluirVacina(index): Exclui uma vacina da lista de vacinas pelo índice especificado e atualiza a quantidade de vacinas cadastradas.
* retornaIdVacina(index): Retorna o objeto Vacina da lista de vacinas pelo índice especificado.
* calculaQtdVacinas(): Calcula a quantidade total de vacinas cadastradas.
* addPessoa(pessoa): Adiciona uma pessoa à lista de pessoas e atualiza a quantidade de pessoas cadastradas.
* editarPessoa(index, pessoa): Edita uma pessoa existente na lista de pessoas pelo índice especificado.
* excluirPessoa(index): Exclui uma pessoa da lista de pessoas pelo índice especificado e atualiza a quantidade de pessoas cadastradas.
* retornaIdPessoa(index): Retorna o objeto Pessoa da lista de pessoas pelo índice especificado.
* listarVacinas(): Exibe uma mensagem com a quantidade de vacinas cadastradas e lista todas as vacinas cadastradas.
* listarPessoas(): Exibe uma mensagem com a quantidade de pessoas cadastradas e lista todas as pessoas cadastradas.
* listarPessoasV(): Retorna uma string com a quantidade de pessoas vacinadas e lista todas as pessoas vacinadas.
* getQtdPessoas(): Obtém a quantidade de pessoas cadastradas.
* setQtdPessoas(qtdPessoas): Define a quantidade de pessoas cadastradas.
* getQtdVacinas(): Obtém a quantidade de vacinas cadastradas.
* setQtdVacinas(qtdVacinas): Define a quantidade de vacinas cadastradas.
* getQtdPessoasVacinadas(): Obtém a quantidade de pessoas vacinadas.
* setQtdPessoasVacinadas(qtdPessoasVacinadas): Obtém a quantidade de pessoas vacinadas.
* getNome(): Obtém o nome de uma pessoa ou vacina.
* setNome(): Define o nome de uma pessoa ou vacina.
* vacinar(indexPessoa, indexVacina): Realiza a vacinação de uma pessoa (registro).
* toString(): Retorna uma representação em formato de string dos dados gerais da aplicação.

#### Classe Pessoa (extends Cadastrar)
A classe Pessoa é uma extensão da classe Cadastrar e representa uma pessoa no sistema de controle de vacinação. Ela possui os seguintes atributos e métodos:

##### Atributos:
* nome: Nome da pessoa.
* cpf: CPF da pessoa.
* idade: Idade da pessoa.
* endereco: Endereço da pessoa.

##### Métodos:
* Pessoa(nome, cpf, idade, endereco): Método construtor para definir uma nova instância de Pessoa.
* getCpf(): Obtém o CPF da pessoa.
* setCpf(cpf): Define o CPF da pessoa.
* getIdade(): Obtém a idade da pessoa.
* setIdade(idade): Define a idade da pessoa.
* getEndereco(): Obtém o endereço da pessoa.
* setEndereco(endereco): Define o endereço da pessoa.
* toString(): Retorna uma representação em formato de string dos atributos da pessoa.

#### Classe Vacina (extends Cadastrar)
A classe Vacina é uma extensão da classe Cadastrar e representa uma vacina no sistema de controle de vacinação. Ela possui os seguintes atributos e métodos:

##### Atributos:
* nome: Nome da vacina.
* qtdVacinas: Quantidade de vacinas disponíveis.
* faixaEtariaI: Faixa etária inicial da vacina.
* faixaEtariaF: Faixa etária final da vacina.
* pessoasVacinadas: Lista de pessoas vacinadas com essa vacina.

##### Métodos:
* Vacina(nome, qtdVacinas, faixaEtariaI, faixaEtariaF): Método construtor para definir uma nova instância de Vacina.
* getQtdVacinas(): Obtém a quantidade disponível da vacina.
* setQtdVacinas(qtdVacinas): Define a quantidade disponível da vacina.
* getFaixaEtariaI(): Obtém a faixa etária inicial da vacina.
* setFaixaEtariaI(faixaEtariaI): Define a faixa etária inicial da vacina.
* getFaixaEtariaF(): Obtém a faixa etária final da vacina.
* setFaixaEtariaF(setFaixaEtariaF): Define a faixa etária final da vacina.
* getPessoasVacinadas(): Obtém a quantidade de pessoas vacinadas.
* setPessoasVacinadas(pessoasVacinadas): Define a quantidade de pessoas vacinadas.
* toString(): Retorna uma representação em formato de string dos atributos da Vacina.

### Utilização
#### Utilizando uma IDE (Ambiente de Desenvolvimento Integrado):

1. Clone o repositório para o seu ambiente local.
2. Certifique-se de ter o Java Development Kit (JDK) instalado em seu computador.
3. Abra a sua IDE preferida (por exemplo, VSCode, IntelliJ IDEA).
4. Abra a pasta do projeto na IDE.
5. Localize o arquivo Java "Main.java" dentro da pasta "src" no diretório do projeto e abra-o.
6. Execute o código clicando no botão "Executar" ou "Play" na IDE.
7. Um menu será exibido em uma janela de diálogo oferecendo várias opções para interagir com o sistema.
8. Utilize os números correspondentes às opções para selecionar a ação desejada.
9. Por fim, após realizar as ações desejadas digite "0" no menu inicial para encerrar a aplicação.
