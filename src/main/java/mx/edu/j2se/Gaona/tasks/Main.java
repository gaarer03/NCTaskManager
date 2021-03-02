package mx.edu.j2se.Gaona.tasks;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/**
		 * A continuación se desplega el menú principal que nos permite crear una nueva tarea o salir.
		 * Está implementada por un do{}while() con su respectiva bandera "aaron". El menú funciona a través
		 * de un switch(){case :}. Los demás menús son bastante intuitivos y funcionan con la misma lógica que el
		 * primero
		 */
		int aaron=0;
		do {
			System.out.println("\t\t BIENVENIDO A GAONAS TASKS \n 1)Crear una nueva tarea \n 2)" +
					"Salir\n 3)Crear un ArrayList \n");
			System.out.println("Porfavor escoja un número de la lista: ");
			Scanner console = new Scanner(System.in);
			int eleccion = Integer.parseInt(console.nextLine());
			switch (eleccion) {
				case 1:
					System.out.println("Escriba el nombre de su tarea: ");
					console = new Scanner(System.in);
					String titulo = console.nextLine();
					Task NuevaTarea = new Task();
					NuevaTarea.setTitle(titulo);
					System.out.println("El nombre de su tarea es: " + NuevaTarea.getTitle());
					System.out.println("Escoja que tipo de tarea requiere: \n a)Repetitivo \n b) No Repetitivo \n");
					console = new Scanner(System.in);
					String letra = console.nextLine();

					switch (letra) {
						case "a":
							System.out.println("Introduce el tiempo de inicio: ");
							console = new Scanner(System.in);
							int start = Integer.parseInt(console.nextLine());
							System.out.println("Introduce el tiempo de finalizacion: ");
							console = new Scanner(System.in);
							int end = Integer.parseInt(console.nextLine());
							System.out.println("Introduce el intervalo: ");
							console = new Scanner(System.in);
							int interval = Integer.parseInt(console.nextLine());
							NuevaTarea.setTime(start, end, interval);
							int aaron2 = 0;
							do {
								System.out.println("¿Qué deseas hacer con tu nueva tarea? \n 1)Mostrar el título de" +
										"la tarea \n 2)Mostrar el tiempo de comienzo de la tarea \n 3)Mostrat el" +
										"tiempo de finalización de la tarea \n 4)Mostrar el intervalo \n 5)Cambiar las" +
										"variables de la tarea \n 6)Verificar que tipo de tarea es \n 7)Mostrar el tiempo" +
										"de inicio de la siguiente repetición \n 8)Activar la tarea \n" +
										" 9)Regresar al menú anterior \n");
								console = new Scanner(System.in);
								int eleccion2 = Integer.parseInt(console.nextLine());
								switch (eleccion2) {
									case 1:
										System.out.println("El título de tu tarea es: " + NuevaTarea.getTitle());
										break;
									case 2:
										System.out.println("La tarea comienza: " + NuevaTarea.getStartTime());
										System.out.println("La tarea comienza: " + NuevaTarea.getTime());
										break;
									case 3:
										System.out.println("La tarea termina: " + NuevaTarea.getEndTime());
										break;
									case 4:
										System.out.println("El intervalo es de: " + NuevaTarea.getRepeatInterval());
										break;
									case 5:
										System.out.println("Introduce el nuevo tiempo de inicio: ");
										console = new Scanner(System.in);
										int start1 = Integer.parseInt(console.nextLine());
										System.out.println("Introduce el nuevo tiempo de finalización: ");
										console = new Scanner(System.in);
										int end1 = Integer.parseInt(console.nextLine());
										System.out.println("Introduce el nuevo intervalo: ");
										console = new Scanner(System.in);
										int interval1 = Integer.parseInt(console.nextLine());
										NuevaTarea.setTime(start1, end1, interval1);
										break;
									case 6:
										System.out.println(NuevaTarea.isRepeated());
										break;
									case 7:
										System.out.println("Introduzca el tiempo actual: ");
										console = new Scanner(System.in);
										int actual = Integer.parseInt(console.nextLine());
										NuevaTarea.nextTimeAfter(actual);
										break;
									case 8:
										System.out.println("Su tarea esta siendo realizada");
										NuevaTarea.setActive(NuevaTarea.isActive());
										break;
									case 9:
										System.out.println("Regresando al menú anterior...");
										aaron2 = 1;
										break;
									/**
									 * Se busca con los defaults un manejo de excepciones
									 */
									default:
										System.out.println("Introduzca un valor correcto ");

								}

							} while (aaron2 == 0);
							break;
						case "b":
							System.out.println("Introduce el tiempo de ejecución: ");
							console = new Scanner(System.in);
							int ejecucion = Integer.parseInt(console.nextLine());
							NuevaTarea.setTime(ejecucion);
							int aaron3 = 0;
							do {
								System.out.println("¿Qué desea hacer con su tarea? \n a)Mostrar el título de la tarea \n" +
										" b)Mostrar el tiempo de inicio de la tarea \n c)Establecer nuevo tiempo de " +
										"inicio de la tarea \n d)Activar la tarea \n e)Verificar que tipo de tarea es \n" +
										"f)Regresar al menú anterior\n");
								console = new Scanner(System.in);
								String letra2 = console.nextLine();
								switch (letra2) {
									case "a":
										System.out.println("El título de tu tarea es: " + NuevaTarea.getTitle());
										break;
									case "b":
										System.out.println("La tarea comienza: " + NuevaTarea.getStartTime());
										System.out.println("La tarea comienza: " + NuevaTarea.getTime());
										break;
									case "c":
										System.out.println("Introduce el nuevo tiempo de ejecución: ");
										console = new Scanner(System.in);
										int ejecucion2 = Integer.parseInt(console.nextLine());
										NuevaTarea.setTime(ejecucion2);
										break;
									case "d":
										System.out.println("Su tarea esta siendo realizada");
										NuevaTarea.setActive(NuevaTarea.isActive());
										break;
									case "e":
										System.out.println(NuevaTarea.isRepeated());
										break;
									case "f":
										System.out.println("Regresando al menú anterior...");
										aaron3 = 1;
										break;
									default:
										System.out.println("Introduzca un valor correcto ");

								}
							} while (aaron3 == 0);


							break;
						default:
							System.out.println("Introduza un valor válido");
					}

					break;
				case 2:
					System.out.println("Hasta Pronto!!");
					aaron = 1;
					break;
				case 3:
					ArrayTaskList lista = new ArrayTaskList();
					NuevaTarea = new Task();
					int ernesto = 0;
					do {
						System.out.println("¿La tarea se repetirá? \n 1)Sí \n 2) No \n 3)Regresar al menú anterior");
						console = new Scanner(System.in);
						int opc = Integer.parseInt(console.nextLine());
						switch (opc) {
							case 1:
								//System.out.println("Introduce el título de la tarea: ");
								//console = new Scanner(System.in);
								//titulo = console.nextLine();
								//NuevaTarea.setTitle(titulo);
								//System.out.println("Introduce el mes de inicio de la tarea: ");
								//console = new Scanner(System.in);
								//String monthInicial = console.nextLine();
								System.out.println("Introduce titulo, Mes y día de inicio de la tarea: ");
								console = new Scanner(System.in);
								String dayInicial = console.nextLine();
								//System.out.println("Introduce el mes de finalización de la tarea: ");
								//console = new Scanner(System.in);
								//String monthFinal = console.nextLine();
								System.out.println("Introduce el mes, día de finalización de la tarea e intervalo: ");
								console = new Scanner(System.in);
								String dayFinal = console.nextLine();
								//System.out.println("Introduce el intervalo de la tarea: ");
								//console = new Scanner(System.in);
								//int interval = Integer.parseInt(console.nextLine());
								NuevaTarea.setTarea(dayInicial,dayFinal);
								lista.add(NuevaTarea);
								int ernesto1 = 0;
								int nuevaVariable;
								do{
								System.out.println("Que deseas hacer con tu lista: \n 1)Tamaño de la lista \n 2)Remover tarea" +
										" de la lista\n 3)Añadir nueva tarea \n 4)Desplegar todas las tareas \n 5)Desplegar" +
										" una tarea");
								console = new Scanner(System.in);
								nuevaVariable = Integer.parseInt(console.nextLine());
									switch (nuevaVariable) {
										case 1:
											lista.size();
											break;
										case 2:
											System.out.println("Introduce el nombre del objeto que deseas remover: ");
											console = new Scanner(System.in);
											Task remover = new Task();
											remover.title = console.nextLine();
											lista.remove(remover);
											break;
										case 3:
											ernesto1 = 1;
											//ernesto = 1;

											break;
										case 4:

											lista.incoming(NuevaTarea.dayInicial, NuevaTarea.dayFinal);
											break;

										case 5:
											System.out.println("Introduzca la dirección: ");
											console = new Scanner(System.in);
											int direccion = Integer.parseInt(console.nextLine());
											lista.getTask(direccion);
											break;

										case 6:
											ernesto = 1;
											ernesto1 = 1;
											System.out.println("Regresando al menú principal");
											break;
									}
								}while(ernesto1==0);
								break;


							case 2:
								System.out.println("Introduce el título de la tarea: ");
								console = new Scanner(System.in);
								titulo = console.nextLine();
								NuevaTarea.setTitle(titulo);
								System.out.println("Introduce el mes de inicio de la tarea: ");
								console = new Scanner(System.in);
								String monthNoRep = console.nextLine();
								System.out.println("Introduce el día de inicio de la tarea: ");
								console = new Scanner(System.in);
								int dayNoRep = Integer.parseInt(console.nextLine());
								System.out.println("Introduce la hora de inicio de la tarea: ");
								console = new Scanner(System.in);
								int tiempo = Integer.parseInt(console.nextLine());
								NuevaTarea.setTarea(titulo, monthNoRep, dayNoRep, tiempo);
								lista.add(NuevaTarea);
								break;

							case 3:
								System.out.println("Regresando al menú anterior... ");
								ernesto = 1;
								break;
						}



					}while(ernesto==0);


			}


			//Pruebas de SetTime
		/*System.out.println("PRUEBAS DE SETTIME");
		System.out.println("setTime(int time)");
		Task prueba1 = new Task();
		prueba1.setTime(700);
		int pruebaTime = prueba1.time;
		System.out.println("Time = " + pruebaTime);


		System.out.println("Convertimos de tarea no-repetitiva a reptitiva");
		prueba1.setTime(400,600,700);
		int pruebaStart = prueba1.start;
		int pruebaEnd = prueba1.end;
		int pruebaInterval = prueba1.interval;
		System.out.println("Interval = " + pruebaInterval + " Start = " + pruebaStart + " End = " + pruebaEnd);

		//Pruebas de SetTime
		System.out.println("\n\nPRUEBAS DE SETTIME");
		System.out.println("setTime(int start, int end, int interval)");
		Task prueba2 = new Task();
		prueba2.setTime(400,600,700);
		int pruebaStart1 = prueba2.start;
		int pruebaEnd1 = prueba2.end;
		int pruebaInterval1 = prueba2.interval;
		System.out.println("Interval = " + pruebaInterval1 + "Start = " + pruebaStart1 + "End = " + pruebaEnd1);

		System.out.println("Convertimos de tarea repetitiva a no-repetitiva");
		prueba2.setTime(700);
		int pruebaTime1 = prueba1.time;
		System.out.println("Time = " + pruebaTime1);*/
			/*

			//Pruebas ArrayTaskList
			Task tarea = new Task();
			Task tareaa = new Task();
			//Task tarea = new Task();
			ArrayTaskList milista = new ArrayTaskList();
			milista.add(tarea);
			milista.add(tareaa);
			milista.size();
			//milista.getTask(0);
			//milista.getTask(1);
			milista.incoming(milista.dayInicial, milista.dayFinal);*/
		}while (aaron == 0) ;
	}
}

