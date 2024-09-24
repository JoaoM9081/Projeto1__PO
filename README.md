# Projeto de Banco em Java

Este projeto é uma implementação de um sistema bancário simples utilizando os princípios de Programação Orientada a Objetos (POO). O sistema permite a criação de contas bancárias, realização de depósitos, saques e aplicação de rendimento em contas poupança.

## Integrantes do Projeto

1. João Marcos Azevedo Cruz.
2. João Pedro Tavares Teixeira.
3. João Victor Martins Albernaz.
4. Felipe Farias Marinho.

## Estrutura do Projeto

O código está organizado na pasta `src`, seguindo a estrutura padrão de projetos Java. O projeto contém dois pacotes:

- **main**: Contém a classe `Main.java`, que executa as operações do sistema bancário.
- **Banco**: Contém as classes responsáveis pela lógica do sistema bancário:
  - `ContaBancaria.java`: Classe base que representa uma conta bancária genérica.
  - `ContaCorrente.java`: Classe que estende `ContaBancaria` e implementa funcionalidades específicas para contas correntes, como saques utilizando crédito ou débito.
  - `ContaPoupanca.java`: Classe que estende `ContaBancaria` e permite a aplicação de rendimento sobre o saldo da conta poupança.

## Funcionalidades

- **Conta Bancária**: Representa uma conta com titular, saldo e número da conta.
- **Conta Corrente**: Permite saques com escolha entre crédito ou débito e gerencia o limite de crédito.
- **Conta Poupança**: Permite aplicar rendimento sobre o saldo.

## Como Clonar e Executar o Código

Para clonar e executar este projeto, siga os passos abaixo:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/JoaoM9081/Projeto1__PO.git

2. Certifique-se de que você tem o JDK instalado. Navegue até a pasta src e localize o arquivo `Main.java` dentro da pasta main.

3. Execute o arquivo `Main.java`.