package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class Relogio {

    public static final int MAX_AREA = 600;
    public static final int MIN_AREA = 0;

    String nome;
    int utc;

    int x;
    int y;


    public Relogio(String nome, int utc, int x, int y) {
        this.setNome(nome);

        if (this.setY(y) || this.setX(x)) setUtc(utc);
        else setUtc(0);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUtc(int utc) {
        this.utc = utc;
    }

    public boolean setX(int x) {

        if (x >= MIN_AREA && x <= MAX_AREA) {
            this.x = x;
            return true;
        } else {
            this.x = MAX_AREA / 2;
            return false;
        }
    }

    public boolean setY(int y) {
        if (y >= MIN_AREA && y <= MAX_AREA) {
            this.y = y;
            return true;
        } else {
            this.y = MAX_AREA / 2;
            return false;
        }
    }

    public void desenhaRelogio(Draw d, int horas, int minutos, int segundos) {
        d.clear(d.LIGHT_GRAY);
        d.text(0.7, 0.75, "Ctrl C");
        d.text(0.7, 0.55, "Ctrl V");
        d.setPenColor(d.WHITE);
        d.filledCircle(0.3, 0.3, 0.2);
        d.setPenColor(d.BLACK);
        double r2 = 0.08;
        double r3 = 0.05;
        double r4 = 0.17;
        double r5 = 0.19;
        d.setPenRadius(0.01);
        for (int i = 0; i < 12; i++) {
            double theta = Math.toRadians(30 * i);
            //https://brasilescola.uol.com.br/matematica/simetria-no-circulo-trigonometrico.htm
            d.line(0.3 + r5 * Math.sin(theta), 0.3 + r5 * Math.cos(theta), 0.3 + r4 * Math.sin(theta), 0.3 + r4 * Math.cos(theta));
        }

        double h = Math.toRadians(30 * horas);
        double m = Math.toRadians(6 * minutos);
        double s = Math.toRadians(6 * segundos);
        //360 graus / 12 horas = 30 graus
        d.line(0.3, 0.3, 0.3 + r3 * Math.sin(h), 0.3 + r3 * Math.cos(h));
        //360 graus / 60 minutos = 6 graus
        d.line(0.3, 0.3, 0.3 + r3 * 2 * Math.sin(m), 0.3 + r3 * 2 * Math.cos(m));
        d.setPenColor(d.RED);
        d.setPenRadius(0.005);
        d.line(0.3, 0.3, 0.3 + r2 * 2 * Math.sin(s), 0.3 + r2 * 2 * Math.cos(s));
    }

}
