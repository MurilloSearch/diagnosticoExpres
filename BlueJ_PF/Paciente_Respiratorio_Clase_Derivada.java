 

public class Paciente_Respiratorio_Clase_Derivada extends Super_Paciente {
    private int escurrimientoNasal =0 , tos=0, dolorGarganta=0;
    private String medicamentoTos = "Histiacil.- 5 ml cada 8 horas por 3 días Via Oral\n" ;
    private String medicamentoNasal = "Loratadina 10 mg.- 1 tableta cada 12 horas por 3 días Via Oral\n";
    private String medicamentoGarganta = "Graneodin .- 1 tableta a necesidad Via Oral\n";
    
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
        if(this.tos == 1) {
            this.medicamento += this.medicamentoTos;
        }
        
        if(this.escurrimientoNasal == 1) {
            this.medicamento += this.medicamentoNasal;
        }
        
        if(this.dolorGarganta == 1) {
            this.medicamento += this.medicamentoGarganta;
        }
    }
}
