 

public class Paciente_Estomacal_Clase_Derivada extends Super_Paciente {

    private int diarrea =0, vomito=0, colico=0;
    private String medicamentoDiarrea = "\nTreda.- 1 tableta cada 8 horas por 3 días Via Oral \n";
    private String medicamentoVomito = "\nMetoclopramida 10mg .- 1 tableta cada 12 horas por 3 días Via Oral \n";
    private String medicamentoColico = "\nButilhioscina 20 mg .- 1 tableta cada 8 horas por 3 días Via Oral\n";

    public Paciente_Estomacal_Clase_Derivada() {
    }

    public Paciente_Estomacal_Clase_Derivada(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS, int presionArterialD, float temperatura, int Diarrea, int Vomito, int Colico) {
        super(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
        this.diarrea = Diarrea;
        this.vomito = Vomito;
        this.colico = Colico;
    }

    public void setMedicamento() {
        if (this.diarrea == 1) {
            this.medicamento += medicamentoDiarrea;
        }

        if (this.vomito == 1) {
            this.medicamento += medicamentoVomito;
        }

        if (this.colico == 1) {
            this.medicamento += medicamentoColico;
        }
    }

    public int getDiarrea() {
        return this.diarrea;
    }

    public int getVomito() {
        return this.vomito;
    }

    public int getColico() {
        return this.colico;
    }

}
