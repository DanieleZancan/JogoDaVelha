public class Jogador { 
    //Atributo para armazenar o simbolo do jogador 
    private char simbolo; 
 
    //Construtor que inicializa o jogador com o simbolo fornecido  
    public Jogador(char simbolo) { 
        this.simbolo = simbolo; 
    } 
 
    //Método para acessar o simbolo do jogador 
    public char getSimbolo() { 
        return simbolo; 
    } 
}