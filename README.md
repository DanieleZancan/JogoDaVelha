# Jogo da Velha (Tic-Tac-Toe) em Java

## Descrição

Este é um simples jogo de **Jogo da Velha** (também conhecido como **Tic-Tac-Toe**) implementado em **Java**. O jogo permite que dois jogadores se alternem para fazer jogadas no tabuleiro 3x3. O objetivo é ser o primeiro a alinhar três símbolos consecutivos, seja na horizontal, vertical ou diagonal.

O jogo ocorre na linha de comando e inclui todas as funcionalidades essenciais, como verificação de vitória, empate e jogadas inválidas.

## Funcionalidades

- **Tabuleiro 3x3:** Representação do jogo com uma matriz bidimensional.
- **Jogo para dois jogadores:** Jogadores se alternam para fazer jogadas.
- **Verificação de vitória:** O jogo verifica se um jogador venceu após cada jogada.
- **Verificação de empate:** O jogo verifica se houve empate, caso o tabuleiro esteja cheio sem vencedor.
- **Tratamento de entradas inválidas:** O jogo solicita que o jogador forneça entradas válidas (linhas e colunas dentro do intervalo 0-2 e células não ocupadas).
- **Reinício do jogo:** Após o término de uma partida, os jogadores podem optar por jogar novamente.

## Tecnologias

- **Java 8+**
- **Linha de comando (console)**

## Estrutura do Projeto

O projeto é dividido em três classes principais:

### 1. **JogoDaVelha** (Classe principal)
   - Responsável pela execução do jogo.
   - Controla o fluxo do jogo, incluindo a troca de turnos, coleta de entradas do jogador e verificação de vitórias/empate.
   - Exibe o tabuleiro e mensagens para o usuário.

### 2. **Tabuleiro**
   - Representa o tabuleiro do jogo como uma matriz 3x3 de caracteres.
   - Contém métodos para iniciar o tabuleiro, exibir o tabuleiro, fazer jogadas e verificar vitória ou empate.

### 3. **Jogador**
   - Representa um jogador, com um símbolo associado (X ou O).
   - Possui um método para acessar o símbolo do jogador.

## Como Jogar

1. Compile e execute o programa em um terminal ou IDE de sua escolha.
2. O jogo exibirá o tabuleiro inicial vazio.
3. Os jogadores se alternam para fazer jogadas, inserindo o número da linha e da coluna (0, 1 ou 2).
4. Após cada jogada, o tabuleiro será exibido novamente.
5. O jogo termina quando um jogador vence ou quando há um empate.
6. Após o término da partida, você pode optar por jogar novamente.
