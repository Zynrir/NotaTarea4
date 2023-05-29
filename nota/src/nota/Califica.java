package nota;

public class Califica {

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

}
