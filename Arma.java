

public class Arma{
    private int capacidadCargador;
    private String calibre;
    private Compania companiaQueFabrica;
    
    public Arma(int capacidadDe,String calibreDe, Compania companiaDelArma)
    {
        capacidadCargador = capacidadDe;
        calibre = calibreDe;
        companiaQueFabrica = companiaDelArma;
    }
    
    public void setCambiarCalibre(String nuevoCalibre){
        calibre = nuevoCalibre;
    }
    
    public void setCambiarCapacidadCargador(int nuevaCapacidadCargador){
        capacidadCargador = nuevaCapacidadCargador;
    }
    
    public void setNuevaCompania(Compania nuevaCompaniaQueFabrica){
        companiaQueFabrica = nuevaCompaniaQueFabrica;
    }
    
    public String getCalibre(){
        return calibre;
    }
    
    public int getCapacidadCargador(){
        return capacidadCargador;
    }
    
    public Compania getCompaniaQueFabrica(){
        return companiaQueFabrica;
    }
}
