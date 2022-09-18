import java.util.Scanner;

public class GeraCampoIncrementado {
    public static void main(String[] args) {

        String[][] campo = new String[9][9]; // Variavel matriz do campo
        Scanner entrada = new Scanner(System.in); // Variavel usada para leitura do arquivo
        int valoPos; // Variavel usada no loop de iteração do campo

        // Leitura do arquivo e armazenamento na matriz
        int x = 0;
        while (entrada.hasNext()) {
            String linha = entrada.nextLine();
            for (int y = 0; y < 9; y++) {
                campo[x][y] = linha.substring(y, y + 1);
            }
            x++;
        }

        // Mudando a matriz de "." para "0"
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (campo[i][j].contains(".")) {
                    campo[i][j] = "0";
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (campo[i][j].contains("*")) {
                    /*
                     * Caso encontre uma mina
                     * Verifica as posições envolta e incrementa
                     * Se for uma posição valida
                     * Se não for uma mina na posição
                     */
                    if (((i - 1) >= 0 && (j - 1) >= 0) && !campo[i - 1][j - 1].contains("*")) {

                        valoPos = Integer.parseInt(campo[i - 1][j - 1]);
                        valoPos++;
                        campo[i - 1][j - 1] = Integer.toString(valoPos);

                    }
                    if (((i - 1) >= 0) && !campo[i - 1][j].contains("*")) {

                        valoPos = Integer.parseInt(campo[i - 1][j]);
                        valoPos++;
                        campo[i - 1][j] = Integer.toString(valoPos);

                    }
                    if (((i - 1) >= 0 && (j + 1) <= 8) && !campo[i - 1][j + 1].contains("*")) {

                        valoPos = Integer.parseInt(campo[i - 1][j + 1]);
                        valoPos++;
                        campo[i - 1][j + 1] = Integer.toString(valoPos);

                    }
                    if (((j - 1) >= 0) && !campo[i][j - 1].contains("*")) {

                        valoPos = Integer.parseInt(campo[i][j - 1]);
                        valoPos++;
                        campo[i][j - 1] = Integer.toString(valoPos);

                    }
                    if (((j + 1) <= 8) && !campo[i][j + 1].contains("*")) {

                        valoPos = Integer.parseInt(campo[i][j + 1]);
                        valoPos++;
                        campo[i][j + 1] = Integer.toString(valoPos);

                    }
                    if (((i + 1) <= 8 && (j - 1) >= 0) && !campo[i + 1][j - 1].contains("*")) {

                        valoPos = Integer.parseInt(campo[i + 1][j - 1]);
                        valoPos++;
                        campo[i + 1][j - 1] = Integer.toString(valoPos);

                    }
                    if (((i + 1) <= 8) && !campo[i + 1][j].contains("*")) {

                        valoPos = Integer.parseInt(campo[i + 1][j]);
                        valoPos++;
                        campo[i + 1][j] = Integer.toString(valoPos);

                    }
                    if (((i + 1) <= 8 && (j + 1) <= 8) && !campo[i + 1][j + 1].contains("*")) {

                        valoPos = Integer.parseInt(campo[i + 1][j + 1]);
                        valoPos++;
                        campo[i + 1][j + 1] = Integer.toString(valoPos);

                    }
                }
            }
        }

        // Para os valores não incrementados , voltam a ser "."
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (campo[i][j].contains("0")) {
                    campo[i][j] = ".";
                }
            }
        }

        // Printa o campo
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(campo[i][j]);
            }
            System.out.println();
        }

    }
}
