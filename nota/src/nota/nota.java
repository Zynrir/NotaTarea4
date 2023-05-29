package nota;
import java.util.Scanner;

public class nota {

public static void main(String[] args) {
Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
int numero = 0;
String nota = "";
System.out.print("Introduzca el valor de una calificación: ");
numero = reader.nextInt();

if (numero >= 0 && numero < 5)
nota = "Suspenso";
else if (numero >= 5 && numero < 7)
nota = "Aprobado";
else if (numero >= 7 && numero <9)
nota = "Notable";
else if (numero >= 9 && numero <= 10)
nota = "Sobresaliente";
else
nota = "El valor de la calificación introducida no es correcta";

System.out.println(nota);
reader.close();
}
}
