package medico1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Medico1 {
public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
final int anio_actual = 2026;
final int mes_actual = 9;
final int dia_actual = 22;
final int sueldo_base = 2925000;
String nombre, especialidad, numero;
double sueldo=0, descuento=0, abono=0,sueldopagar=0;
int pacientes;
int anionac,mesnac,dianac;


System.out.println("INGRESE SU NOMBRE ");
nombre = teclado.nextLine();

System.out.println("INGRESE EL AÑO DE NACIMIENTO");
anionac = teclado.nextInt();

System.out.println("INGRESE EL MES DE NACIMIENTO");
mesnac = teclado.nextInt();

System.out.println("INGRESA EL DIA DE NACIMIENTO");
dianac = teclado.nextInt();

teclado.nextLine();

System.out.println("INGRESE LA ESPECIALIDAD");
especialidad = teclado.nextLine();

System.out.println ("INGRESE SU NUMERO TELEFONICO");
numero = teclado.nextLine();

System.out.println("INGRESE EL NUMERO DE PACIENTES ATENDIDOS");
pacientes = teclado.nextInt();
sueldo = sueldo_base;

if (pacientes >=1 && pacientes <=6) {
    descuento = (sueldo) * (0.0125);
}
if (pacientes > 6 && pacientes <=8) {
    descuento = (sueldo) * (0.0114);
}

if (pacientes > 8) {
    abono = (sueldo) * (0.02);
    
}

  sueldopagar = (sueldo) - (descuento) + (abono);
  
  
  
  
  
LocalDate fecha = LocalDate.now();
LocalTime hora = LocalTime.now();
int edad = (anio_actual) - (anionac);
if (mes_actual < mesnac){
    edad = edad - 1;
}
 
if (mes_actual == mesnac && dia_actual < dianac){
    edad = edad -1;
}

System.out.println ("***DATOS DEL REGISTRO***");
System.out.println ("EL NOMBRE INGRESADO ES: " + nombre);
System.out.println ("EL AÑO DE NACIMIENTO INGRESADO ES  " + anionac);
System.out.println ("EL MES DE NACIMIENTO INGRESADO ES  " + mesnac);
System.out.println ("EL DIA DE NACIMIENTO INGRESADO ES  " + dianac);
System.out.println ("LA EDAD ES:  " + edad + "AÑOS");
System.out.println ("LA ESPECIALIDAD REGISTRADA ES:  " + especialidad);
System.out.println ("EL NUMERO TELEFONICO INGRESADO ES:  " + numero);
System.out.println ("LOS PACIENTES ATENDIDOS SON:   " +pacientes);
System.out.println ("EL SUELDO TOTAL ES:  "  +sueldo);
System.out.println ("EL DESCUENTO TOTAL ES:    " +descuento);
System.out.println ("EL ABONO TOTAL ES:    " +abono);
System.out.println ("EL SUELDO A PAGAR ES:    " +sueldopagar);


try {
 
FileWriter fw = new FileWriter ("C:\\Users\\Janus\\OneDrive\\Desktop\\PAGODELMEDICO8.txt");
BufferedWriter bw = new BufferedWriter (fw);
bw.write ("Nombre:   " + nombre + "\n");
bw.write ("Fecha captura:   " + fecha +"\n");
bw.write ("Hora capturada:    " +hora +"\n");
bw.write ("Año de nacimiento capturado:   " +anionac + "\n");
bw.write ("Mes de nacimiento capturado:    " +mesnac + "\n");
bw.write ("Dia de nacimiento capturado:   "  +dianac + "\n");
bw.write ("Edad en años capturada:   " +edad + "\n");
bw.write ("Especialidad capturada:   " +especialidad + "\n");
bw.write ("Pacientes atendidos:    " +pacientes + "\n");
bw.write ("Sueldo capturado:   " +sueldo + "\n");
bw.write ("Descuento capturado:    " +descuento + "\n");
bw.write ("Abono capturado:   " +abono + "\n");
bw.write ("El sueldo a pagar:   " +sueldopagar + "\n");
bw.close();
fw.close();
}

catch (IOException error) {
System.out.println ("ALERTA VERIFICAR RESPALDO" + error.getMessage());    
teclado.close();
}
}
} 