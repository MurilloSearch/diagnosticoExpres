package Clases_Modelo;

public class Paciente_Urinario_Clase_Derivada extends Super_Paciente {

    private int dolorOrinarBox;
    private int fiebreBox;
    private int dolorIntensoBox;

    public Paciente_Urinario_Clase_Derivada() {
    }

    public Paciente_Urinario_Clase_Derivada(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS, int presionArterialD, float temperatura, int dolorAlOrinar, int fiebre, int dolorIntenso) {
        super(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);

        this.dolorOrinarBox = dolorAlOrinar;
        this.fiebreBox = fiebre;
        this.dolorIntensoBox = dolorIntenso;
    }

    public void setDolorOrinar(int DolorOrinarBox) {
        this.dolorOrinarBox = DolorOrinarBox;
    }

    public void setFiebre(int FiebreBox) {
        this.fiebreBox = FiebreBox;
    }

    public void setDolorIntenso(int DolorIntensoBox) {
        this.dolorIntensoBox = DolorIntensoBox;
    }

    public void setMedicamento() {

        String medicamentOrinar = "Nitrofurantoina 100 mg.- 1 tableta cada 12 horas por 5 días Via Oral \n";
        String medicamentoFiebre = "Paracetamol 500 mg.- 1 tableta cada 8 horas por 5 días Via Oral \n";
        String medicamentoIntenso = "Tramadol 50 mg .- 1 tableta cada 8 horas a necesidad Via Oral \n";

        if (dolorOrinarBox == 1) {
            this.medicamento += medicamentOrinar;
        }
        if (fiebreBox == 1) {
            this.medicamento += medicamentoFiebre;
        }
        if (dolorIntensoBox == 1) {
            this.medicamento += medicamentoIntenso;
        }
    }
}
