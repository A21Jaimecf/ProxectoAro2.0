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
        setRadio(valorRadio);
    }

  public double obterDiametro() {
        return getRadio() * 2;
    }

    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }

    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }

    @Override
    public String toString() {
        return "Centro = [" + getCoordendaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordendaX(getCoordendaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * @return the CoordendaX
     */
    public int getCoordendaX() {
        return CoordendaX;
    }

    /**
     * @param CoordendaX the CoordendaX to set
     */
    public void setCoordendaX(int CoordendaX) {
        this.CoordendaX = CoordendaX;
    }

    /**
     * @return the CoordenadaY
     */
    public int getCoordenadaY() {
        return CoordenadaY;
    }

    /**
     * @param CoordenadaY the CoordenadaY to set
     */
    public void setCoordenadaY(int CoordenadaY) {
        this.CoordenadaY = CoordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio < MINIMO ? MINIMO : radio;
    }
}