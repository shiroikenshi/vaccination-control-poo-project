# <div align="center"><a href="/README.md">Português</a> | <a href="/README_EN.md">Inglês</a></div>
<br><br>
# Object-Oriented Programming - Vaccination Control System
This repository contains a vaccination control system implemented in Java using Object-Oriented Programming. The system allows for the registration, editing, listing, and deletion of individuals and vaccines. It includes a function that allows for vaccinating an individual (by selecting a valid person and vaccine registration) and a feature that displays general system data to the user, such as a list of vaccinated individuals, the total number of registered individuals/vaccines, and the overall quantity of available doses.

### Author
* Felipe Pinto da Silva

### Features
#### Controle Class
The Controle class is our only abstract class in the application. It was created based on some initial requirements of our project. Our application was supposed to have an abstract class, and during the development, we were required to apply the concepts of Polymorphism and Casting. With that said, the Controle class represents the vaccination control and has only one abstract method:

##### Method:
* toString(): By defining this abstract method within our abstract class, all subclasses of our application must implement this method using the @Override annotation.

#### Cadastrar Class (extends Controle)
The Cadastrar class is an extension of the Controle class and represents the registration and manipulation of individuals and vaccines. It has the following attributes and methods:

##### Attributes:
* qtdPessoas: Stores the total quantity of registered individuals.
* qtdVacinas: Stores the total quantity of registered vaccines.
* qtdPessoasVacinadas: Stores the total quantity of vaccinated individuals.
* nome: Stores the name of the Cadastrar instance.
* vacinas: A list of Vacina objects responsible for storing the registered vaccines.
* pessoas: A list of Pessoa objects responsible for storing the registered individuals.
* pessoasV: A list of Pessoa objects responsible for storing the vaccinated individuals.

##### Methods:
* Cadastrar(nome): Constructor that will be used by the Pessoa and Vacina classes to inherit the "nome" attribute.
* Cadastrar(qtdPessoas): Constructor that receives the initial quantity of individuals to be registered. During the code, it will be instantiated with an object of the Controle class, which will be responsible for * controlling our application.
* addVacina(vacina): Adds a vaccine to the list of vaccines and updates the quantity of registered vaccines.
* editarVacina(index, vacina): Edits an existing vaccine in the list of vaccines at the specified index.
* excluirVacina(index): Deletes a vaccine from the list of vaccines at the specified index and updates the quantity of registered vaccines.
* retornaIdVacina(index): Returns the Vacina object from the list of vaccines at the specified index.
* calculaQtdVacinas(): Calculates the total quantity of registered vaccines.
* addPessoa(pessoa): Adds an individual to the list of individuals and updates the quantity of registered individuals.
* editarPessoa(index, pessoa): Edits an existing individual in the list of individuals at the specified index.
* excluirPessoa(index): Deletes an individual from the list of individuals at the specified index and updates the quantity of registered individuals.
* retornaIdPessoa(index): Returns the Pessoa object from the list of individuals at the specified index.
* listarVacinas(): Displays a message with the quantity of registered vaccines and lists all registered vaccines.
* listarPessoas(): Displays a message with the quantity of registered individuals and lists all registered individuals.
* listarPessoasV(): Returns a string with the quantity of vaccinated individuals and lists all vaccinated individuals.
* getQtdPessoas(): Gets the quantity of registered individuals.
* setQtdPessoas(qtdPessoas): Sets the quantity of registered individuals.
* getQtdVacinas(): Gets the quantity of registered vaccines.
* setQtdVacinas(qtdVacinas): Sets the quantity of registered vaccines.
* getQtdPessoasVacinadas(): Gets the quantity of vaccinated individuals.
* setQtdPessoasVacinadas(qtdPessoasVacinadas): Sets the quantity of vaccinated individuals.
* getNome(): Gets the name of an individual or vaccine.
* setNome(): Sets the name of an individual or vaccine.
* vacinar(indexPessoa, indexVacina): Performs the vaccination of an individual (record).
* toString(): Returns a string representation of the general data of the application.

#### Pessoa Class (extends Cadastrar)
The Pessoa class is an extension of the Cadastrar class and represents an individual in the vaccination control system. It has the following attributes and methods:

##### Attributes:
* nome: Name of the individual.
* cpf: CPF (Taxpayer Identification Number) of the individual.
* idade: Age of the individual.
* endereco: Address of the individual.

##### Methods:
* Pessoa(nome, cpf, idade, endereco): Constructor method to define a new instance of Pessoa.
* getCpf(): Gets the CPF of the individual.
* setCpf(cpf): Sets the CPF of the individual.
* getIdade(): Gets the age of the individual.
* setIdade(idade): Sets the age of the individual.
* getEndereco(): Gets the address of the individual.
* setEndereco(endereco): Sets the address of the individual.
* toString(): Returns a string representation of the individual's attributes.

#### Vacina Class (extends Cadastrar)
The Vacina class is an extension of the Cadastrar class and represents a vaccine in the vaccination control system. It has the following attributes and methods:

##### Attributes:
* nome: Name of the vaccine.
* qtdVacinas: Quantity of available vaccines.
* faixaEtariaI: Initial age range for the vaccine.
* faixaEtariaF: Final age range for the vaccine.
* pessoasVacinadas: List of individuals vaccinated with this vaccine.

##### Methods:
* Vacina(nome, qtdVacinas, faixaEtariaI, faixaEtariaF): Constructor method to define a new instance of Vacina.
* getQtdVacinas(): Gets the quantity of available vaccines.
* setQtdVacinas(qtdVacinas): Sets the quantity of available vaccines.
* getFaixaEtariaI(): Gets the initial age range for the vaccine.
* setFaixaEtariaI(faixaEtariaI): Sets the initial age range for the vaccine.
* getFaixaEtariaF(): Gets the final age range for the vaccine.
* setFaixaEtariaF(setFaixaEtariaF): Sets the final age range for the vaccine.
* getPessoasVacinadas(): Gets the quantity of vaccinated individuals.
* setPessoasVacinadas(pessoasVacinadas): Sets the quantity of vaccinated individuals.
* toString(): Returns a string representation of the vaccine's attributes.

### Usage
#### Using an Integrated Development Environment (IDE):

1. Clone the repository to your local environment.
2. Make sure you have the Java Development Kit (JDK) installed on your computer.
3. Open your preferred IDE (e.g., VSCode, IntelliJ IDEA).
4. Open the project folder in the IDE.
5. Locate the Java file "Main.java" inside the "src" folder in the project directory and open it.
6. Run the code by clicking the "Run" or "Play" button in the IDE.
7. A menu will be displayed in a dialog window, offering various options to interact with the system.
8. Use the corresponding numbers for the options to select the desired action.
9. Finally, after performing the desired actions, type "0" in the initial menu to exit the application.
