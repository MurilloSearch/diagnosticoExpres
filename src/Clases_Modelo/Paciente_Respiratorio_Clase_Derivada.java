package Clases_Modelo;

public class Paciente_Respiratorio_Clase_Derivada extends Super_Paciente {
    private int escurrimientoNasal, tos, dolorGarganta;
  
    public Paciente_Respiratorio_Clase_Derivada() { }
    
    public Paciente_Respiratorio_Clase_Derivada(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS,int presionArterialD, float temperatura, int escurrimientoNasal, int tos, int dolorGarganta) {
        super(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS,presionArterialD, temperatura);
        this.escurrimientoNasal = escurrimientoNasal;
        this.tos = tos;
        this.dolorGarganta = dolorGarganta;
    }
    
    public void setEscurrimientoNasal(int Nasal) {
        this.escurrimientoNasal = Nasal;
    }
    
    
    public void setTos(int tos) {
        this.tos = tos;
    }
    
    public void setDolorGarganta(int dolorGarganta) {
        this.dolorGarganta = dolorGarganta;
    }
    
    public void setMedicamento() {
        
        String medicamentoTos = "Histiacil.- 5 ml cada 8 horas por 3 días Via Oral\n";
        String medicamentoNasal = "Loratadina 10 mg.- 1 tableta cada 12 horas por 3 días Via Oral\n";
        String medicamentoGarganta = "Graneodin .- 1 tableta a necesidad Via Oral\n";

        
        if(this.tos == 1) {
            this.medicamento += medicamentoTos;
        }
        
        if(this.escurrimientoNasal == 1) {
            this.medicamento += medicamentoNasal;
        }
        
        if(this.dolorGarganta == 1) {
            this.medicamento += medicamentoGarganta;
        }
    }
}
