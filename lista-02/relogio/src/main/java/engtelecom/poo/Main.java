package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

import java.time.LocalTime;

public class Main {

    public static final int MAX_AREA = 600;
    public static final int MIN_AREA = 0;

    private static final int VETOR_SIZE = 3;
    private Draw desenho;

    Relogio[] vetorRelogio;


    public Main() {
        this.desenho = new Draw();
        // definindo a área de desenho -- https://introcs.cs.princeton.edu/java/stdlib/javadoc/Draw.html
        this.desenho.setCanvasSize(MAX_AREA,MAX_AREA);
        // definindo a escala da área de desenho -- leia mais na documentação da classe
        this.desenho.setXscale(MIN_AREA, MAX_AREA);
        this.desenho.setYscale(MIN_AREA, MAX_AREA);

    }

    public boolean adicionarRelogio(Relogio[] vetorRelogio){
        return vetorRelogio.length > VETOR_SIZE;
    };
    public void desenharRelogios(Relogio[] vetorRelogio , Draw d){
        for (int i = 0; i < 3 ; i++) {
            LocalTime now = LocalTime.now();
            vetorRelogio[i].desenhaRelogio(d,now.getHour(),now.getMinute(),now.getSecond());
        }
    };

    public static void main(String[] args) {
        Main m = new Main();

    }
}