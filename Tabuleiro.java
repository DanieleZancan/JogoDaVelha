public class Tabuleiro { 
    private char[][] tabuleiro; 
 
    //Iniciando o tabuleiro com o método iniciar 
    public Tabuleiro() { 
        //Criando uma matriz 3x3 para o tabuleiro 
        tabuleiro = new char[3][3]; 
        iniciar(); 
    } 
 
    //Método para preencher o tabuleiro com o simbolo '-' 
    public void iniciar() { 
        for(int l = 0; l < 3; l++) { 
            for(int c = 0; c < 3; c++) { 
                //Definindo todas as celulas como vazias 
                tabuleiro[l][c] = '-'; 
            } 
        } 
    } 
 
    //Método para exibir o tabuleiro no console 
    public void exibir() { 
        System.out.println("Tabuleiro atual:"); 
        for (int l = 0; l < 3; l++) { 
            for (int c = 0; c < 3; c++) { 
                System.out.print(tabuleiro[l][c]); 
                if (c < 2) { 
                    System.out.print(" | "); 
                } 
            } 
            System.out.println(); 
            if (l < 2) { 
                System.out.println("--+---+--"); 
            } 
        } 
    }  
 
    //Método para realizar uma jogada 
    public boolean jogar(int linha, int coluna, char simbolo) { 
        //Verificando se a posição está dentro dos limites e se a celula está vazia 
        if(linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == '-') { 
            //Atualizando a celula com o simbolo do jogador 
            tabuleiro[linha][coluna] = simbolo; 
            return true;    
        } 
        return false; 
    } 
 
    //Método para verificar se um jogador venceu 
    public boolean verificarVitoria(char simbolo) { 
        //Verificando as linhas 
        for(int l = 0; l < 3; l++) { 
            if(tabuleiro[l][0] == simbolo && tabuleiro[l][1] == simbolo && tabuleiro[l][2] == simbolo) { 
                return true; 
            } 
        } 
 
        //Verificando as colunas 
        for(int c = 0; c < 3; c++) { 
            if(tabuleiro[0][c] == simbolo && tabuleiro[1][c] == simbolo && tabuleiro[2][c] == simbolo) { 
                return true; 
            } 
        } 
 
        //Verificando as diagonais 
        if(tabuleiro[0][0] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][2] == simbolo) { 
            return true; 
        }  
        if(tabuleiro[0][2] == simbolo && tabuleiro[1][1] == simbolo && tabuleiro[2][0] == simbolo) { 
            return true; 
        } 
        return false; //Nenhuma vitória encontrada 
    } 
 
    //Método para verificar se há empate ou se o jogo terminou  
    public boolean verificarEmpate() { 
        for(char[] linha : tabuleiro) { 
            for(char celula : linha) { 
                if(celula == '-') { 
                    return false; //Ainda há celulas vazias, não há empate 
                } 
            } 
        } 
        return true; //Todas as celulas preenchidas, houve empate 
    } 
} 