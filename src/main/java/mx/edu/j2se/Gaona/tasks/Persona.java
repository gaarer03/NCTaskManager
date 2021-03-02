package mx.edu.j2se.Gaona.tasks;

public class Persona {
    String nombre;
    int edad;
    String sexo;
    Float altura;
    String nacionalidad;

    //Metodo constructor
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    /**
     * @return String
     */
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String loDejanEntrarAlBar() {
        if (this.edad >= 18) {
            return "Bienvenido al Bar";

        }
        else {
            return "Sigue participando :(";

        }
    }
}


