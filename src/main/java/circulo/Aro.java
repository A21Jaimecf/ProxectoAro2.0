package circulo;

/**
 * Probas de refactorización en NetBeans coa clase Aro
 * @author JaimeCF
 */
public class Aro {
      /**
     * Crear contante MINIMO
     */
    public static final double MINIMO = 0.0;
    /**
     * Crear constante LIMITERADIO
     */
    public static final double LIMITERADIO = 0.0;

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

     /**
     * creación do método ARO 
     */
    public Aro() {
    }
     /**
     * Inicializacion do método ARO 
     * @param valorX the CoordenadaX
     * @param valorY the CoordenadaY
     * @param valorRadio the setRadio
     */
    public Aro(int valorX, int valorY, double valorRadio) {
        CoordendaX = valorX;
        CoordenadaY = valorY;
        setRadio(valorRadio);
    }
/**
     * @return the Radio
     */
  public double obterDiametro() {
        return getRadio() * 2;
    }
/**
     * @return the Circunferencia
     */
    public double obterCircunferencia() {
        return Math.PI * obterDiametro();
    }
/**
     * @return the Superficie
     */
    public double obterSuperficie() {
        return Math.PI * getRadio() * getRadio();
    }
/**
     * @return the String posicion del centro
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordendaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }
  /**
     * @param trasladarX the trasladarX
     * @param trasladarY the trasladarY
     */
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