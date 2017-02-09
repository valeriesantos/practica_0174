
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int caloriasDeLaComida;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombreComida, int caloriasComida)
    {
        this.nombreComida = nombreComida;
        this.caloriasDeLaComida = caloriasComida;
    }

    /**
     * Metodo que permite obtener la cantidad de calorias
     * ingeridas por una persona.
     */
    public int getCaloriasDeLaComida(){
        return caloriasDeLaComida;
    }
}
