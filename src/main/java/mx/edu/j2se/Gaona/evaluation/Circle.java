package mx.edu.j2se.Gaona.evaluation;

public class Circle {

    private int radio;
    private int[] array;

    public Circle() {
        this.radio = radio;
    }

    public void setRadius(int radio) {
        if (radio <= 0)
            throw new IllegalArgumentException("Valor de radio inválido");
        else
            this.radio = radio;
    }

    public int getRadio(){
        return radio;
    }

    public float getArea(){
        float area = (float)Math.PI*(radio*radio);
        return area;
    }


}