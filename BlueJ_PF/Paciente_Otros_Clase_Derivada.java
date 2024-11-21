 

public class Paciente_Otros_Clase_Derivada extends Super_Paciente {

    private String medicamento_Pediatrico = "Pase a pediatria \n";
    private String medicamento_Mayor60 = "Pase con el medico \n";
    private String medicamento_parametros_atlerados = "Pase a urgencias \n";

    public Paciente_Otros_Clase_Derivada() {
    }

    public Paciente_Otros_Clase_Derivada(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS, int presionArterialD, float temperatura) {
        super(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
    }

    public void setMedicamento() {
        if (this.frecuenciaC<60 || this.frecuenciaC>100 || this.frecuenciaR < 10 || this.frecuenciaR>20 || this.presionArterialS<90 || this.presionArterialS>150 || this.presionArterialD<60 || this.presionArterialD >110 || this.temperatura<28 || this.temperatura>39.5){
            this.medicamento = medicamento_parametros_atlerados;
            return;
        }
        if (this.edad < 18) {
            this.medicamento = medicamento_Pediatrico;
            return;
        }
        if (this.edad > 60) {
            this.medicamento = medicamento_Mayor60;
            return;
        }
        this.medicamento = medicamento_Mayor60;

    }

}
