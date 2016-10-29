package ordenarvector;



public class Principal {
    public static void main(String[] args) {
        Ordenar1Vector ordenacion = new Ordenar1Vector();
        DatosEstadisticos estadisticosDesordenados = new DatosEstadisticos();
        DatosEstadisticos estadisticosInverso = new DatosEstadisticos();
        DatosEstadisticos estadisticoUno = new DatosEstadisticos();
        

        //primer caso
        System.out.println("----------------Primer caso----------------");
        System.out.println("Característica: vector desordenado");
        int v1[] = GeneraCaso.generaVector(100000, true);
        CompruebaCaso.compruebaVector(v1, 100000);
        
        ordenacion.ordena(v1,estadisticosDesordenados);
        System.out.println("El tiempo que ha tardado en finalizar la ordenación es " +(estadisticosDesordenados.dameTiempo()) + " segundos.");
        
        CompruebaCaso.compruebaVector(v1, 100000);
       
        
        //segundo caso
        System.out.println("--------------Segundo caso------------------");
        System.out.println("Característica: vector en orden inverso");
        int v2[] = GeneraCaso.generaVector(100000, false);
        CompruebaCaso.compruebaVector(v2, 100000);
        
        ordenacion.ordena(v2,estadisticosInverso);
        System.out.println("El tiempo que ha tardado en finalizar la ordenación es " +(estadisticosInverso.dameTiempo()) + " segundos.");
        
        CompruebaCaso.compruebaVector(v2, 100000);
        
        //tercer caso
        System.out.println("--------------Tercer caso------------------");
        System.out.println("Característica: vector de un solo elemento");
        int v3[] = GeneraCaso.generaVector(1, false);
        CompruebaCaso.compruebaVector(v3, 1);
        
        ordenacion.ordena(v3,estadisticoUno);
        System.out.println("El tiempo que ha tardado en finalizar la ordenación es " +(estadisticoUno.dameTiempo()) + " segundos.");
        
        CompruebaCaso.compruebaVector(v3, 1);
        
    }
}