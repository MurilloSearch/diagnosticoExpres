 

public class Paciente_Urinario_Clase_Derivada extends Super_Paciente{
    
    private String medicamentOrinar = "Nitrofurantoina 100 mg.- 1 tableta cada 12 horas por 5 días Via Oral \n";
    private String medicamentoFiebre = "Paracetamol 500 mg.- 1 tableta cada 8 horas por 5 días Via Oral \n";
    private String medicamentoIntenso = "Tramadol 50 mg .- 1 tableta cada 8 horas a necesidad Via Oral \n";
    private int dolorOrinarBox =0;
    private int fiebreBox=0;
    private int dolorIntensoBox=0;
    
    public Paciente_Urinario_Clase_Derivada() { }
    
    public Paciente_Urinario_Clase_Derivada(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS,int presionArterialD, float temperatura, int dolorAlOrinar, int fiebre, int dolorIntenso) {
        super(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS,presionArterialD, temperatura);
       
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
    
    public void setMedicamento(){
        if(dolorOrinarBox==1){
            this.medicamento += this.medicamentOrinar;
        }
        if(fiebreBox==1){
            this.medicamento += this.medicamentoFiebre;
        }
        if(dolorIntensoBox==1){
            this.medicamento += this.medicamentoIntenso;
        }
    }
}
