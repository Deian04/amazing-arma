public class Compania{
   
    public String nombreCompania;
    public int codigoCompania;
    
    public Compania(String nombreDeCompania, int codigoDeCompania)
    {
        nombreCompania = nombreDeCompania;
        codigoCompania = codigoDeCompania;
    }

    public String getNombreCompania(){
        return nombreCompania;
    }
    
    public int getCodigoCompania(){
        return codigoCompania;
    }
    
    public void setCambiarCompania(String nuevaCompania){
        nombreCompania = nuevaCompania;
    }
    
    public void setCambiarCodigo(int nuevoCodigo){
        codigoCompania = nuevoCodigo;
    }
}
