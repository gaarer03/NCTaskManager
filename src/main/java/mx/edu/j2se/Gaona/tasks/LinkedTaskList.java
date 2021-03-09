package mx.edu.j2se.Gaona.tasks;

import java.util.Arrays;

public class LinkedTaskList {
    //Atributos
    private int index = 0;
    Task[] listaTareas = new Task[0];
    //Constructores

    //Clases

    /**
     * En el método de abajo simulamos el proceso interno de un LinkList para incrementar su capacidad al crear una
     * copia de si mismo con una longitud +1.
     */
    public void add(Task task) {
        //Arrays.fill(listaTareas,task);
        listaTareas = Arrays.copyOf(listaTareas, index + 1);
        index++;
        listaTareas[index] = task;

    }

    /**
     * El método remove primero crea una variable local llamada indInicial al cual le es asignada el valor de longitud
     * de la lista antes de ser modificada. Después un for hace un barrido en nuestra lista checando cuales elementos
     * se eliminarán. Si se eliminan la lista de tareas se reduce en un espacio, sino el programa  sigue corriendo. Al
     * final se hace una comparación entre el indice que pertenece al final de la lista sumado  a 1 con la longitud
     * incial de la lista, si difieren el método regresa true, sino false.
     *
     * @param task
     * @return
     */
    public boolean remove(Task task) {
        int indInicial = listaTareas.length;
        for (Task busqueda : listaTareas) {
            if (task == busqueda) {
                task = null;
                listaTareas = Arrays.copyOf(listaTareas, index - 1);
                index--;

            } else {
                continue;

            }

        }
        if (index + 1 < indInicial) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * El método utiliza la función interna length para arrojar el tamaño de nuestra lista
     *
     * @return
     */
    public int size() {
        return listaTareas.length;
    }

    /**
     * En este caso el getTask simula el proceso de una LinkedList para encontrar una tarea, ya que
     * barre la lista de manera lineal y encuentra un elemento con la referencia de los elementos
     * que estan por delante y detrás de nuestra tarea objetivo
     * @param task
     * @return
     */
    public Task getTask(Task task){
        for(Task prueba : listaTareas){
            if(prueba==task){
                System.out.println(prueba);
            }
            else{
                continue;
            }
        }
        return null;
    }


    /**
     *
     * @param from
     * @param to
     * @return
     */
    public LinkedTaskList incoming(int from, int to){
        for(Task prueba : listaTareas){
            if(prueba.active){
                if(from<=prueba.start && to<=prueba.end && prueba.interval != 0|| from<=prueba.time && to>=prueba.time){
                    if(prueba.interval==0){
                        System.out.println("Su tarea " + prueba.title + " Se llevará a cabo a las " + prueba.time);
                    }
                    else
                    {
                        System.out.println("Su tarea " + prueba.title + " se llevara a cabo entre " + prueba.start +
                                " hasta " + prueba.end + " cada " + prueba.interval + " horas");
                    }
                }
                else{
                    System.out.println("No hay tareas entre los tiempos solicitados");
                }

            }
            else{
                System.out.println("Su tarea no se encuentra activa ");
            }
        }
        return null;
    }

}
