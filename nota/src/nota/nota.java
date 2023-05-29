package nota;

import java.util.Scanner;

/**
 * @author Jose Miguel Lopez Gomez
 * @version 1.0
 * La clase Notas es un programa que clasifica una calificación numérica
 * ingresada por el usuario y la convierte en una cadena que representa su
 * valoración, utilizando el método público cali.
 */
public class nota {

public static void main1(String[] args) {
System.out.print("Introduzca el valor de una calificación: ");
}

    /**
     * El método público cali clasifica una calificación numérica en función de
     * su valor y devuelve una cadena que representa su valoración.
     * @param numero la calificación numérica a clasificar
     * @return la valoración correspondiente a la calificación
     * @deprecated Use {@link Califica#calificacion(int)} instead
     */
public static String cali(int numero) {
	return Califica.calificacion(numero);
}

	/**
	     * El método público cali clasifica una calificación numérica en función de
	     * su valor y devuelve una cadena que representa su valoración.
	     * @param num_nota la calificación numérica a clasificar
	     * @return la valoración correspondiente a la calificación
		 * @deprecated Use {@link Califica#calificacion(int)} instead
	     */
	public static String calificacion(int num_nota) {
		return Califica.calificacion(num_nota);
	}
public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
   System.out.print("Introduzca el valor de una calificación: ");
   	int n = reader.nextInt();
    String c = Califica.calificacion(n);
   System.out.println(c);
    reader.close();
    }
}
