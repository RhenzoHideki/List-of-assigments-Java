import java.util.Arrays;
import java.util.Random;

public class GeraCampoMinado {

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
        String[][] campo = new String[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                campo[i][j] = ".";
            }
        }
        randomCampo(campo);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(campo[i][j]);
            }
            System.out.println();
        }

    }
}
