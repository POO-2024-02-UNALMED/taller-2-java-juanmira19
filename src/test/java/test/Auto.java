package test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    int cantidadAsientos(){
        int cont = 0;

        for(Asiento as : asientos){
            if (as instanceof Asiento){
                ++cont;
            }
        
        }
        return cont;
    }
    
    String verificarIntegridad(){
        for (Asiento as : asientos){
            if ((as instanceof Asiento)&&((as.registro!=motor.registro)|(motor.registro!=registro))){
                return "Las piezas no son originales";
            }
        return "Auto original";
        }


        return "hola";
    }
    



    
}
