package ordenarvector;

public class DatosEstadisticos{
    
    private double time;
    
    public DatosEstadisticos(){
        this.time=0;
    }
    
    public void añadeTiempo(double time){
        this.time = this.time + time;
    }
    
    public void estableceTiempo(double time){
        this.time = time;
    }
    
    public double dameTiempo(){
        return time;
    }
}