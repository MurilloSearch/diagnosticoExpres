package Clases_Modelo;

public abstract class Super_Paciente {
    protected String nombre, apellidoPat, apellidoMat, medicamento = "";
    protected int edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD;
    protected float temperatura;
    
    public Super_Paciente () {
        
    }
    
    public Super_Paciente(String nombre, String apellidoPat, String apellidoMat, int edad, int frecuenciaC, int frecuenciaR, int presionArterialS,int presionArterialD, float temperatura) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.edad = edad;
        this.frecuenciaC = frecuenciaC;
        this.frecuenciaR = frecuenciaR;
        this.presionArterialS = presionArterialS;
        this.presionArterialD = presionArterialD;
        this.temperatura = temperatura;
    }
    
    abstract void setMedicamento();
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }
    
    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setFrecuenciaC(int frecuenciaC) {
        this.frecuenciaC = frecuenciaC;
    }
    
    public void setFrecuenciaR(int frecuenciaR) {
        this.frecuenciaR = frecuenciaR;
    }
    
    public void setPresionArterialS(int presionArterialS) {
        this.presionArterialS = presionArterialS;
    }
    
    public void setPresionArterialD(int presionArterialD) {
        this.presionArterialD = presionArterialD;
    }
    
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
    // Getters
    public String getNombre() {
        return this.nombre;
    }
    
    public String getApellidoPat() {
        return this.apellidoPat;
    }
    
    public String getApellidoMat() {
        return this.apellidoMat;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public int getFrecuenciaC() {
        return this.frecuenciaC;
    }
    
    public int getFrecuenciaR() {
        return this.frecuenciaR;
    }
    
    public int getPresionArterialS() {
        return this.presionArterialS;
    }
    
    public int getPresionArterialD() {
        return this.presionArterialD;
    }
    
    public double getTemperatura() {
        return this.temperatura;
    }
    
    public String getMedicamento() {
        return this.medicamento;
    }
}
