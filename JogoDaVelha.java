import java.util.Scanner; 
 
//Classe principal do Jogo da Velha 
public class JogoDaVelha { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        //Inicializando o tabuleiro e os jogadores 
        Tabuleiro tabuleiro = new Tabuleiro(); 
        Jogador jogadorX = new Jogador('X'); 
        Jogador jogadorO = new Jogador('O'); 
        Jogador jogadorAtual = jogadorX; 
        boolean jogando = true; 
 
        //Apresentação inicial do jogo 
        System.out.println("Bem-vindo ao Jogo da Velha! \n"); 
 
        //Loop principal do jogo 
        while (jogando) { 
            //Exibindo o tabuleiro atual 
             tabuleiro.exibir(); 
            //Solicitando a jogada do jogador atual 
            System.out.println("Jogador " + jogadorAtual.getSimbolo() + ", faça uma jogada: \n"); 
 
            //Entradas dos jogadores 
            int linha, coluna; 
            try { 
                //Entrada para a linha 
                System.out.print("Escolha uma linha: 0, 1 ou 2: \n"); 
                linha = sc.nextInt(); 
                //Entrada para a coluna 
                System.out.print("Escolha uma coluna: 0, 1 ou 2:\n"); 
                coluna = sc.nextInt(); 
            } catch (Exception e) { 
                //Exibindo uma mensagem de erro caso o jogador coloque um valor inválido 
                System.out.println("Valor inválido! Tente novamente! \n"); 
                //Limpando o buffer do scanner 
                sc.next(); 
                //Reiniciando o loop principal do jogo  
                continue; 
            }  
 
            //Verificando se a entrada é válida ou se a posição já está ocupada  
            if (!tabuleiro.jogar(linha, coluna, jogadorAtual.getSimbolo())) { 
                System.out.println("Posição inválida ou já ocupada! Tente novamente! \n"); 
                continue; 
            } 
 
            //Verificando se o jogador atual venceu 
            if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())) { 
                tabuleiro.exibir(); 
                System.out.println("Parabéns! Jogador " + jogadorAtual.getSimbolo() + " é o vitorioso! \n"); 
                jogando = false; //Termina o jogo 
            }  
 
            //Verificando se houve empate 
            else if (tabuleiro.verificarEmpate()) { 
                tabuleiro.exibir(); 
                System.out.println("Empate! Nenhum dos jogadores é o vitorioso! \n"); 
                jogando = false; //Termina o jogo 
            }  
 
            //Troca de jogador  
            else { 
                jogadorAtual = (jogadorAtual == jogadorX) ? jogadorO : jogadorX; 
            } 
        } 
 
        //Perguntando aos jogadores se eles gostariam de jogar novamente 
        System.out.println("Gostaria de jogar novamente? 'S ou N' \n"); 
        //Vericicando a resposta dos jogadores 
        char resposta = sc.next().toUpperCase().charAt(0); 
        if (resposta == 'S') { 
            //Reinicia o jogo chamando o método main novamente 
            main(null);  
        } else { 
           //Se despedindo dos jogadores 
           System.out.println("Até o próximo jogo! \n"); 
        } 

        //Fechando o scanner  
        sc.close(); 
    } 
} 
