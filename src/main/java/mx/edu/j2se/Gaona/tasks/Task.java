package mx.edu.j2se.Gaona.tasks;
import java.util.Scanner;

/**
 * Clase Task
 *
 * Contiene informacion de cada tarea
 *
 * @author Aarón Gaona
 * @versión 1.0
 */
public class Task {

    //Atributos

    /**
     * Titulo de la tarea
     */
    String title;
    /**
     * Tiempo de inicio de tarea no-repetitivo
     */
    int time;
    /**
     * Tiempo de inicio de tarea repetitiva
     */
    int start;
    /**
     * Tiempo final de tarea repetitiva
     */
    int end;
    /**
     * Tiempo de intervalo entre una tarea y otra
     */
    int interval;
    /**
     * Variable de tipo booleano que mmuestra si una tarea esta activa
     */
    boolean active;
    /**
     * Variable tipo condicional para el método nextTimeAfter (verifica que la tarea esté en ejecución)
     */
    int current;
    /**
     * Variable tipo condicional que escribe el usuario en el método nextTimeAfter para verificar cuantas
     * repeticiones le quedan a una tarea
     */
    int veces;

    /**
     * Constructor de tarea no-repetitiva
     * @param title
     * @param time
     */
    public void Task(String title, int time){
        this.title = title;
        this.time = time;
    }

    /**
     * Constructor de tarea reptitiva
     * @param title
     * @param start
     * @param end
     * @param interval
     * @param veces
     */
    public void Task(String title, int start, int end, int interval,int veces){
        this.title = title;
        this.start = start;
        this.end = end;
        this.interval = interval;
        this.veces = veces;
    }

    /**
     * Get de la variable title
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set de la variable title
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Activa una tarea
     * @return
     */
    public boolean isActive(){
        return true;
    }

    /**
     * Set de la variable active
     * @param active
     */
    public void setActive(boolean active){
        this.active = active;
    }

    /**
     * Condicional, si la tarea es repetitiva regresa la variable start, si es no-repetitiva regresala variable time
     * @return
     */
    public int getTime() {
        if (time == 0){
            return start;
        }
        else{
            return time;
        }

    }

    /**
     * Condicional, si la tarea es repetitiva, la convierte en no-repetitiva al preguntar por la variable time y
     * establecerla como nuevo parámetro
     * @param time
     */
    public void setTime(int time) {
        if (time == 0){
            System.out.println("Introduce el comienzo de tu tarea: ");
            Scanner console = new Scanner(System.in);
            //this.time = time;
            time = Integer.parseInt(console.nextLine());
        }
        else{
            this.time = time;
            System.out.println("time = " + time);

        }
    }

    /**
     * Condicional, si la tarea es no-reptitiva regresa la variable time, si la tarea es repetitiva regresa la variable
     * start
     * @return
     */
    public int getStartTime(){
        if(time > 0){
            return time;
        }
        else{
            return start;
        }
    }

    /**
     * Condicional, si la tarea es no-reptitiva regresa la variable time, si la tarea es repetitiva regresa la variable
     * end
     * @return
     */
    public int getEndTime(){
        if(time > 0){
            return time;
        }
        else{
            return end;
        }

    }

    /**
     * Condicional, si la tarea es no-reptitiva regresa la variable interval, si la tarea es
     * repetitiva regresa 0
     * @return
     */
    public int getRepeatInterval(){
        if (time > 0){
            return 0;
        }
        else{
            return interval;
        }
    }
    /**
     * Condicional, si la tarea es no-repetitiva, la convierte en repetitiva al preguntar por las variables
     * start,end,interval y establecerla como nuevo parámetro
     * @param start
     * @param end
     * @param interval
     */
    public void setTime(int start, int end, int interval){
        if (time > 0){
            //time = start;
            System.out.println("Introduce el tiempo de inicio: ");
            Scanner console = new Scanner(System.in);
            //this.start = start;
            start = Integer.parseInt(console.nextLine());
            System.out.println("Introduce el tiempo de finalización: ");
            console = new Scanner(System.in);
            //this.end = end;
            end = Integer.parseInt(console.nextLine());
            System.out.println("Introduce el intervalo entre cada actividad: ");
            console = new Scanner(System.in);
            //this.interval = interval;
            interval = Integer.parseInt(console.nextLine());

        }
        else{
            //time=start;
            this.start = start;
            this.end = end;
            this.interval = interval;

        }

    }

    /**
     * método para visualizar si una tarea es repetitiva o no
     * @return
     */
    public boolean isRepeated(){
        if(time == 0){
            System.out.println("Su tarea es repetitiva");
            return true;
        }
        else{
            System.out.println("Su tarea no es repetitiva");
            return false;
        }
    }

    /**
     * Método que utiliza condiciones anidadas para verificar si la tarea es repetitiva y si la variable
     * current, que especifica en que tiempo nos encontramos, verifique que la tarea esté en operación.
     * Una vez que se verifica ambas condiciones entramos a una nueva condicionante basada en una pregunta
     * al usuario, en donde se plantea el número de repeticiones faltantes. Si la repetición es mayor a 0 se calcula
     * el tiempo que falta para la siguiente repetición y dependiendo si se pasa del formato 2400 se ajusta con una
     * resta. Por el otro lado si el número de veces es igual a 0, el método regresa un -1.
     * @param current
     * @return
     */
    public int nextTimeAfter(int current){
        this.current = current;
        if (time == 0) {
            if (current > start && current < end){
                System.out.println("Cuantas repeticiones faltan: ");
                Scanner console = new Scanner(System.in);
                veces = Integer.parseInt(console.nextLine());
                if (veces > 0) {
                    current = start + interval;
                    if (current > 2400) {
                        current = current - interval;
                        System.out.println("La actividad empezará a las: " + current);

                    }
                    else {
                        System.out.println("La actividad empezará a las: " + current);
                    }
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }

        }
        else{
            return 0;
        }
        return 0;
    }
}




