package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author JaimeCF
 */
public class Aro {
    public static final double MINIMO = 0.0;
    
    public final double LIMITERADIO = 0.0;

    /**
     * Get the value of LIMITERADIO
     *
     * @return the value of LIMITERADIO
     */
    public double getLIMITERADIO() {
        return LIMITERADIO;
    }

    private int CoordendaX;
    private int CoordenadaY;
    private double radio;

    public Aro() {
    }

    public Aro(int valorX, int valorY, double valorRadio) {
        CoordendaX = valorX;
        CoordenadaY = valorY;
        establecerRadio(valorRadio);
    }

    public void establecerX(int valorX) {
        CoordendaX=valorX;
    }

    public int obterX() {
        return CoordendaX;
    }

    public void establecerY(int valorY) {
        CoordenadaY=valorY;
    }

    public int obterY() {
        return CoordenadaY;
    }

    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < MINIMO ? MINIMO : valorRadio);
    }

    public double obterRadio() {
        return radio;
    }

    public double obterDiametro() {
        return radio * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Centro = [" + CoordendaX + "," + CoordenadaY + "]; Radio = " + radio;
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        CoordendaX=CoordendaX + trasladarX;
        CoordenadaY=CoordenadaY + trasladarY;
    }
}