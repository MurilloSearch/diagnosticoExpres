
import java.text.DecimalFormat;
import java.io.*;
import static java.lang.System.out;

public class Paciente_Controlador
{
    
    public static BufferedReader leer_Teclado = new BufferedReader(new InputStreamReader(System.in));

    public static DecimalFormat Decf = new DecimalFormat("#,##0.00");
    
    public static void main(String[] args) throws java.io.IOException{

        while(true){
             out.println("\n");
             out.println("------------------------------------------");
            out.println("            Diagnostico Express            ");
            out.println("------------ Ingrese sus datos-------------");
             out.println("------------------------------------------");
            out.println("<<<<<<<<<<<<<<<<<< Menu >>>>>>>>>>>>>>>>>>");
            
            GenerarReceta();
            
         }
    }
    
    public static int Leer_Numero(String TxtMsg,int min, int max) throws java.io.IOException{
        
        String dato_Leido;
        int dato_Real;
        
        do{
            out.print(TxtMsg+": ");
            dato_Leido = leer_Teclado.readLine();
            if(dato_Leido.equalsIgnoreCase("Exit")){
                System.exit(0);
            }
            
            try{
                dato_Real=Integer.parseInt(dato_Leido);
                  if(dato_Real<min){
                      out.println("....................................");
                      out.println("No Pueden Introducirse Numeros Menores A "+min);
                      out.println("...................................."); 
                      continue;
                  }
                  if(dato_Real>max){
                      out.println("....................................");
                      out.println("No Pueden Introducirse Numeros Menores O Iguales A "+max);
                      out.println("...................................."); 
                      continue;
                  }
                  return dato_Real;
            }
            catch(NumberFormatException e){
                out.println("....................................");
                out.println("Solamente Puedes Introducir Numeros");
                out.println("....................................");
            }
        }while(true);
     }
     
    public static void GenerarReceta() throws IOException {
        // Variables Datos del Paciente
        String nombre, apellidoPat, apellidoMat;
        int edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, Opcion;
        float temperatura;

        // Variables para Tipo de Enfermedad
        int Estomacal;
        int Respiratorio;
        int Urinario;

        // Variables de Sintomas
        int Diarrea = 0, Vomito = 0, Colico = 0;
        int DolorGarganta = 0, EscurrimientoNasal = 0, Tos = 0;
        int DolorOrinar = 0, Fiebre = 0, DolorIntenso = 0;

        out.println("....................................");
                out.println("  Introduzca el nombre");
                out.println("....................................");
        nombre = leer_Teclado.readLine();
        if(nombre.equalsIgnoreCase("Exit")){
                System.exit(0);
            }
            
        if (nombre.length() > 18) {
            out.println("....................................");
                out.println("  Introduzca un nombre valido");
                out.println("....................................");
            return;
        }
        
        out.println("....................................");
                out.println("  Introduzca apellido paterno");
                out.println("....................................");
            apellidoPat = leer_Teclado.readLine();
            
            if(apellidoPat.equalsIgnoreCase("Exit")){
                System.exit(0);
            }
            
            if (apellidoPat.length() > 12) {
            out.println("....................................");
                out.println("  Introduzca un apellido valido");
                out.println("....................................");
            return;
        }
        
        out.println("....................................");
                out.println("  Introduzca apellido materno");
                out.println("....................................");
                
            apellidoMat = leer_Teclado.readLine();
            if(apellidoMat.equalsIgnoreCase("Exit")){
                System.exit(0);
            }
            
            if (apellidoMat.length() > 12) {
            out.println("....................................");
                out.println("  Introduzca un apellido valido");
                out.println("....................................");
            return;
        }
            
        // Edad
            edad = Leer_Numero("Edad",0,99);
        // Frecuencia Cardíaca
            frecuenciaC = Leer_Numero("Frecuencia Cardiaca", 30, 300);
        // Frecuencia Respiratoria
            frecuenciaR = Leer_Numero("Frecuencia Respiratoria", 10, 40);
        // Presión Arterial S
            presionArterialS = Leer_Numero("Presion Sistolica", 50, 300);
        // Presión Arterial D
            presionArterialD = Leer_Numero("Presion Diastolica", 30, 200);
        // Temperatura
            temperatura = Leer_Numero("Temperatura", 20, 45);
        
        // Cálculo
        
        if (edad < 18 || edad > 60 || frecuenciaC < 60 || frecuenciaC > 100 || frecuenciaR < 10 || frecuenciaR > 20 || presionArterialS < 90 || presionArterialS > 140 || presionArterialD < 60 || presionArterialD > 110 || temperatura < 28 || temperatura > 39.5) {
            Paciente_Otros_Clase_Derivada Obj_Otros = new Paciente_Otros_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
            Paciente_Otros(Obj_Otros);
            return;
        }
                    
            out.println("\tElige tipo de Enfermedad");
            out.println("\t1) Enfermedad respiratoria");
            out.println("\t2) Enfermedad estomacal");
            out.println("\t3) Enfermedad urinaria");
            out.println("\t4) Otros sintomas");
            out.println("\t5) Salir");
            Opcion = Leer_Numero( "", 1, 5);
            out.println("\n");
            
            int Sintomas = 0;
            
            switch(Opcion){
                case 1:
                    while(Sintomas !=4){
                    out.println("Elige los sintomas del paciente");    
                    out.println("\t1) Tos");
                    out.println("\t2) Escurrimiento Nasal");
                    out.println("\t3) Dolor de garganta");
                    out.println("\t4) Continuar");
                    Sintomas = Leer_Numero(":", 1, 4);
                    if(Sintomas == 1){
                        Tos =1;
                    }
                    if(Sintomas == 2){
                        EscurrimientoNasal =1;
                    }
                    if(Sintomas == 1){
                        DolorGarganta =1;
                    }
                }
                
                    
                    Paciente_Respiratorio_Clase_Derivada Obj_Respiratorio = new Paciente_Respiratorio_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura, EscurrimientoNasal, Tos, DolorGarganta);
                    Paciente_Respiratorio(Obj_Respiratorio);
                    break;
                    
                case 2:
                    while(Sintomas !=4){
                    out.println("Elige los sintomas del paciente");    
                    out.println("\t1) Diarrea");
                    out.println("\t2) Vomito");
                    out.println("\t3) Colico");
                    out.println("\t4) Continuar");
                    Sintomas = Leer_Numero(":", 1, 4);
                    if(Sintomas == 1){
                        Diarrea =1;
                    }
                    if(Sintomas == 2){
                        Vomito =1;
                    }
                    if(Sintomas == 1){
                        Colico =1;
                    }
                }
                
                    Paciente_Estomacal_Clase_Derivada Obj_Estomacal = new Paciente_Estomacal_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura, Diarrea, Vomito, Colico);
                    Paciente_Estomacal(Obj_Estomacal);
                    break;
                    
                case 3:
                    
                    while(Sintomas !=4){
                    out.println("Elige los sintomas del paciente");
                    out.println("\t1) Dolor al Orinar");
                    out.println("\t2) Fiebre");
                    out.println("\t3) Dolor Intenso");
                    out.println("\t4) Continuar");
                    Sintomas = Leer_Numero(":", 1, 4);
                    if(Sintomas == 1){
                        DolorOrinar =1;
                    }
                    if(Sintomas == 2){
                        Fiebre =1;
                    }
                    if(Sintomas == 1){
                        DolorIntenso =1;
                    }
                }
                    
                    Paciente_Urinario_Clase_Derivada Obj_Urinario = new Paciente_Urinario_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura, DolorOrinar, Fiebre, DolorIntenso);
                    Paciente_Urinario(Obj_Urinario);                    
                    break;
                    
                case 4:
                    
                    Paciente_Otros_Clase_Derivada Obj_Otros = new Paciente_Otros_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
                    Paciente_Otros(Obj_Otros);
                    break;
                    
                case 5:
                    System.exit(0);
                  default:
                    out.println("Opcion Incorrecta\n");
            }
            
    }
    
     public static void Paciente_Respiratorio(Paciente_Respiratorio_Clase_Derivada Obj_Respiratorio) {
        Obj_Respiratorio.setMedicamento();

        out.println("\nNombre: "+Obj_Respiratorio.getNombre() + " " + Obj_Respiratorio.getApellidoPat() + " " + Obj_Respiratorio.getApellidoMat());
        out.println("Edad: "+String.valueOf(Obj_Respiratorio.getEdad()));
        out.println("Frecuencia Cardiaca: "+String.valueOf(Obj_Respiratorio.getFrecuenciaC()));
        out.println("Frecuencia Respiratoria: "+String.valueOf(Obj_Respiratorio.getFrecuenciaR()));
        out.println("Presion Arterial Sistolica: "+String.valueOf(Obj_Respiratorio.getPresionArterialS()));
        out.println("Presion Arterial Diastolica: "+String.valueOf(Obj_Respiratorio.getPresionArterialD()));
        out.println("Temperatura: "+String.valueOf(Obj_Respiratorio.getTemperatura())+"\n");
        out.println(Obj_Respiratorio.getMedicamento());
    }

    public static void Paciente_Estomacal(Paciente_Estomacal_Clase_Derivada Obj_Estomacal) {
        Obj_Estomacal.setMedicamento();
        
        out.println("\nNombre: "+Obj_Estomacal.getNombre() + " " + Obj_Estomacal.getApellidoPat() + " " + Obj_Estomacal.getApellidoMat());
        out.println("Edad: "+String.valueOf(Obj_Estomacal.getEdad()));
        out.println("Frecuencia Cardiaca: "+String.valueOf(Obj_Estomacal.getFrecuenciaC()));
        out.println("Frecuencia Respiratoria: "+String.valueOf(Obj_Estomacal.getFrecuenciaR()));
        out.println("Presion Arterial Sistolica: "+String.valueOf(Obj_Estomacal.getPresionArterialS()));
        out.println("Presion Arterial Diastolica: "+String.valueOf(Obj_Estomacal.getPresionArterialD()));
        out.println("Temperatura: "+String.valueOf(Obj_Estomacal.getTemperatura())+"\n");
        out.println(Obj_Estomacal.getMedicamento());    
    }

    public static void Paciente_Urinario(Paciente_Urinario_Clase_Derivada Obj_Urinario) {
        Obj_Urinario.setMedicamento();

        out.println("\nNombre: "+Obj_Urinario.getNombre() + " " + Obj_Urinario.getApellidoPat() + " " + Obj_Urinario.getApellidoMat());
        out.println("Edad: "+String.valueOf(Obj_Urinario.getEdad()));
        out.println("Frecuencia Cardiaca: "+String.valueOf(Obj_Urinario.getFrecuenciaC()));
        out.println("Frecuencia Respiratoria: "+String.valueOf(Obj_Urinario.getFrecuenciaR()));
        out.println("Presion Arterial Sistolica: "+String.valueOf(Obj_Urinario.getPresionArterialS()));
        out.println("Presion Arterial Diastolica: "+String.valueOf(Obj_Urinario.getPresionArterialD()));
        out.println("Temperatura: "+String.valueOf(Obj_Urinario.getTemperatura())+"\n");
        out.println(Obj_Urinario.getMedicamento());    
    }

    public static void Paciente_Otros(Paciente_Otros_Clase_Derivada Obj_Otros) {
        Obj_Otros.setMedicamento();

        out.println("\nNombre: "+Obj_Otros.getNombre() + " " + Obj_Otros.getApellidoPat() + " " + Obj_Otros.getApellidoMat());
        out.println("Edad: "+String.valueOf(Obj_Otros.getEdad()));
        out.println("Frecuencia Cardiaca: "+String.valueOf(Obj_Otros.getFrecuenciaC()));
        out.println("Frecuencia Respiratoria: "+String.valueOf(Obj_Otros.getFrecuenciaR()));
        out.println("Presion Arterial Sistolica: "+String.valueOf(Obj_Otros.getPresionArterialS()));
        out.println("Presion Arterial Diastolica: "+String.valueOf(Obj_Otros.getPresionArterialD()));
        out.println("Temperatura: "+String.valueOf(Obj_Otros.getTemperatura())+"\n");
        out.println(Obj_Otros.getMedicamento());    
    }
}
