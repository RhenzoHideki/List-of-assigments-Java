import java.util.Arrays;
import java.util.Random;

public class GeraCampoMinado {

    /*
     * Gera um campo randomizado
     * Utilizando 2 posições randomizadas e um decrementador
     */
    public static void randomCampo(String[][] campo) {
        int i = 10;
        Random r = new Random();

        while (i > 0) {
            int x = r.nextInt(9);
            int y = r.nextInt(9);

            if (campo[x][y] != "*") {
                campo[x][y] = "*";
                i--;
            }
        }
        return;
    }

    public static void main(String[] args) {
        // Inicializa a matriz 9x9
        String[][] campo = new String[9][9];

        // Coloca toda matriz com a variavel "."
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                campo[i][j] = ".";
            }
        }

        // Randomiza as posições das minas
        randomCampo(campo);

        // Printa o campo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(campo[i][j]);
            }
            System.out.println();
        }

    }
}
