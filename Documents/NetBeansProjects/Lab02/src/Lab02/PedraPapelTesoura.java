
package Lab02;

/**
 *
 * 
 */
import java.util.Scanner;
import java.lang.Math;

public class PedraPapelTesoura {
    public static void main (String []args){
        final int NUMERO_SIMBOLOS = 3, NUMERO_DE_JOGADORES = 2, PEDRA = 1, PAPEL = 2, TESOURA = 3;
        int jogador1, jogador2, vencedor;
        Scanner s = new Scanner(System.in);
        System.out.printf("Digite o número correspondente a opção de jogador 1.\nPedra (1), Papel (2), Tesoura (3)? ");
        jogador1 = s.nextInt();
        System.out.printf("Digite o número correspondente a opção de jogador 2.\nPedra (1), Papel (2), Tesoura (3)? ");
        jogador2 = s.nextInt();
        vencedor = compararSimbolos( jogador1, jogador2, NUMERO_SIMBOLOS);

    }
    private static int compararSimbolos(int jogador1, int jogador2, int NUMERO_SIMBOLOS){
        return Math.abs(NUMERO_SIMBOLOS + jogador1 - jogador2);
    }
}
