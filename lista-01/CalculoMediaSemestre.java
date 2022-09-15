
public class CalculoMediaSemestre {
    public static void main(String[] args) {
        if (args.length < 7) {
            System.out.println("Faltam argumentos");
        }

        double mediaProjetos = 0, mediaAtividades = 1;
        double w = 0;

        // Primeiro Loop para calcular os Somatorios dos projetos
        for (int i = 1; i <= 2; i++) {
            int projeto = Integer.parseInt(args[i - 1]);
            mediaProjetos = projeto * (i * 2) + mediaProjetos;
            w = w + (i * 2);
        }
        mediaProjetos = (mediaProjetos / w) * 0.9;

        // Segundo loop para calcular o Produtorio das atividades
        for (int i = 3; i <= 7; i++) {
            int atividade = Integer.parseInt(args[i - 1]);
            mediaAtividades = mediaAtividades *
                    atividade;
        }
        mediaAtividades = Math.pow(mediaAtividades, 0.2) * 0.1;

        double mediaTotal = mediaAtividades + mediaProjetos;
        mediaTotal = Math.round(mediaTotal);

        if (mediaTotal >= 6) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

    }
}
