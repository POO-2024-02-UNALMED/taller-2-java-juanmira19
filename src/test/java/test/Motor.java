package test;

public class Motor {

    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int num){
        this.registro=num;

    }
    void asignarTipo(String tip){
        switch (tip) {
            case "gasolina":
                this.tipo="gasolina";
                break;
            case "electrico":
                this.tipo="electrico";
                break;
            default:
                break;
        }

    } 
}
