package Clases_Modelo;

public class Paciente_Estomacal_Clase_Derivada extends Super_Paciente {

    private int diarrea, vomito, colico;

    public Paciente_Estomacal_Clase_Derivada() {
    }

    public Paciente_Estomacal_Clase_Derivada(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS, int presionArterialD, float temperatura, int Diarrea, int Vomito, int Colico) {
        super(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
        this.diarrea = Diarrea;
        this.vomito = Vomito;
        this.colico = Colico;
    }

    public void setMedicamento() {

        String medicamentoDiarrea = "Treda.- 1 tableta cada 8 horas por 3 días Via Oral \n";
        String medicamentoVomito = "Metoclopramida 10mg .- 1 tableta cada 12 horas por 3 días Via Oral \n";
        String medicamentoColico = "Butilhioscina 20 mg .- 1 tableta cada 8 horas por 3 días Via Oral\n";

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
