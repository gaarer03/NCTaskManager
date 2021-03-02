package mx.edu.j2se.Gaona.tasks;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayTaskList extends Task {

    int size;
    int index;
    boolean remove;
    ArrayList lista = new ArrayList();
    //Task tarea1;


    Task tarea1 = new Task();

    public void ArrayTaskList(){
        ArrayList lista = new ArrayList();
        this.lista=lista;
    }

    public void add(Task task) {
        lista.add(task);
    }




        /*if (size>0){
             int n = size;
            for(int i=0;i<=n;i++){
                ArrayList<String> lista = new ArrayList<String>(n);
                System.out.println("Porfavor ingresa el titulo de la tarea:\n");
                Scanner console = new Scanner(System.in);
                String title = console.nextLine();
                lista.add(i,title);
            }

        }
        else{
            System.out.println("La lista no contiene un tamaño definido");
        }*/

    public boolean remove(Task task) {
        lista.remove(task);
        return true;
    }

    public int size() {
        System.out.println("El número de tareas en la lista es:");
        System.out.println(lista.size());
        return 0;
    }

    public Task getTask(int index) {
        System.out.println(lista.get(index));
        return null;
    }

    @Override
    public String toString(){
        return
                "titulo" + this.title + "from" + this.monthInicial + " " + this.from + " to " + this.monthFinal +  " " + to + " every "
                + this.interval + "hours";
    }


    public ArrayTaskList incoming(String from,String to) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ")" + " " + from + " to " + " " + to +
                    " hours");
            //+ " on " + monthNoRep + " " +
              //      dayNoRep + " at " + tiempo);

        }
        return null;
    }




}
        //}

        /*System.out.println("Introduce la hora exacta: ");
        Scanner console = new Scanner(System.in);
        current = Integer.parseInt(console.nextLine());
        System.out.println("Introduce la fecha con letras en formato mes día (Por ejemplo Marzo 26): ");
        Scanner console = new Scanner(System.in);
        String date = console.nextLine();*/


