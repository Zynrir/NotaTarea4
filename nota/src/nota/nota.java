package nota;

import java.util.Scanner;

/**
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
     * @deprecated Use {@link #calificacion(int)} instead
     */
public static String cali(int numero) {
	return calificacion(numero);
}

	/**
     * El método público cali clasifica una calificación numérica en función de
     * su valor y devuelve una cadena que representa su valoración.
     * @param num_nota la calificación numérica a clasificar
     * @return la valoración correspondiente a la calificación
     */
public static String calificacion(int num_nota) {
  if (num_nota < 0 || num_nota > 10) {
    return "El valor de la calificación introducida no es correcto";
} else if (num_nota < 5) {
    return "Suspenso";
} else if (num_nota < 7) {
    return "Aprobado";
} else if (num_nota < 9) {
    return "Notable";
} else {
    return "Sobresaliente";
   	}
}
public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
   System.out.print("Introduzca el valor de una calificación: ");
   	int n = reader.nextInt();
    String c = calificacion(n);
   System.out.println(c);
    reader.close();
    }
}
