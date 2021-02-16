package mx.edu.j2se.Gaona.tasks;

public class Main {
	public static void main(String[] args) {
		Persona estudianteNC = new Persona(); // Crear un nuevo objeto
		estudianteNC.setEdad(18);
		estudianteNC.setNombre("Eduardo");
		int laEdad = estudianteNC.getEdad();
		//System.out.println(laEdad);
		String loDejaron = estudianteNC.loDejanEntrarAlBar();
		String loDejaron2 = loDejanEntrarAlBar(estudianteNC.getEdad());
		System.out.println(estudianteNC.getNombre() + " " + loDejaron);
		System.out.println(estudianteNC.getNombre() + " " + loDejaron2);

		Persona estudianteNC2 = new Persona(); // Crear nuevo objeto
		estudianteNC2.setNombre("Arturo");
		estudianteNC2.setEdad(12);
	}
	public static String loDejanEntrarAlBar(int laEdad) {
		if (laEdad >= 18) {
			return "Wiiiiii :D";

		}
		else {
			return "Lo siento :(";

		}
	}

}

