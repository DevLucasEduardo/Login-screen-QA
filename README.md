# LoginScreenTest

Este projeto é composto por uma classe responsável por autenticar e criar usuários.
Para garantir o funcionamento desta, foram criados testes unitários a fim de verificar seu funcionamento com a utilização do Framework JUnit 5.

## `class LoginScreen` 

A classe `LoginScreen` é responsável por fazer a autenticação e adição de usuários. Ela possui os seguintes métodos:

### Construtor

O construtor da classe inicializa os dados em um `HashMap`.

### Método login
O método login faz a autenticação de um usuário através do nome de usuário e senha que são inseridos como argumento. Trata-se de um método booleano.

### Método addUser
O método addUser adiciona um novo usuário ao HashMap.

## `class LoginScreenTest `
A classe `LoginScreenTest` testa o método login da classe anterior com a utilização do método assertTrue presente no JUnit 5. O decorator @Test indica que o próximo método refere-se a um método de testes.

### Método testSuccessfullLogin
Verifica se o login é bem-sucedido quando inseridos valores corretos de nome de usuário e senha.

### Método testFailedLogin
Verifica se o login falha quando inseridos valores incorretos de nome de usuário e senha.

## `Javadoc` 
Foi criada a documentação Javadoc para a classe LoginScreen. Para visualizá-la  selecione o arquivo localizado em src/doc/allclasses-index.html
