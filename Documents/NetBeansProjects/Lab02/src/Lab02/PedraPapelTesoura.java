
package Lab02;

/**
 *GRUPO:
 *  - Felipe da Silva Gouveia
 *  - 
 *  - 
 **/
import java.util.Scanner;

public class PedraPapelTesoura {
    static Scanner s = new Scanner(System.in);
    public static void main (String []args){
        final int NUMERO_SIMBOLOS = 3;
        int jogador1, jogador2;
        jogador1 = lerOpcaoJogador1(NUMERO_SIMBOLOS);
        jogador2 = lerOpcaoJogador2(NUMERO_SIMBOLOS);
        System.out.println(opcao1(jogador1) + " - " + opcao2(jogador2));
        declararVencedor(jogador1, jogador2, NUMERO_SIMBOLOS);
    }
    
    private static void declararVencedor(int jogador1, int jogador2, int NUMERO_SIMBOLOS){
        double vencedor;
        vencedor = Math.abs(jogador1 - jogador2);
        if(vencedor == 0){
            System.out.println("Enpate!");
        }else if(vencedor <= NUMERO_SIMBOLOS/2){
            System.out.println("Jogador 1 Ganhou!");
        }else System.out.println("Jogador 2 Ganhou!");
    }

    private static int lerOpcaoJogador1(int NUMERO_SIMBOLOS) {
        System.out.printf("Digite o número correspondente a opção de jogador 1.\nPedra (1), Papel (2), Tesoura (3)? ");
        int jogador1 = s.nextInt();
        while(jogador1 < 1 || jogador1 > 3){
            System.out.println("Opção invalida, por favor digite uma opção entre 1 e 3.");
            jogador1 = s.nextInt();
        }
        return jogador1;
    }

    private static int lerOpcaoJogador2(int NUMERO_SIMBOLOS) {
        System.out.printf("Digite o número correspondente a opção de jogador 1.\nPedra (1), Papel (2), Tesoura (3)? ");
        int jogador2 = s.nextInt();
        while(jogador2 < 1 || jogador2 > 3){
            System.out.println("Opção invalida, por favor digite uma opção entre 1 e 3.");
            jogador2 = s.nextInt();
        }
        return jogador2;
    }
    
    private static String opcao1(int jogador1) {
        switch(jogador1){
            case 1: return "PEDRA";
            case 2: return "PAPEL";
            case 3: return "TESOURA";
        }
        return "0";
    }

    private static String opcao2(int jogador2) {
        switch(jogador2){
            case 1: return "PEDRA";
            case 2: return "PAPEL";
            case 3: return "TESOURA";
        }
        return "0";
    }
}
