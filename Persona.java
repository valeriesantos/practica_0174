
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombrePersona;
    private boolean hombre;
    private int peso;
    private int estatura;
    private int edad;
    private int caloriasIngeridas;
    private int metabolismoBasalHombre;
    private int metabolismoBasalMujer;
    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombrePersona, boolean hombre, int peso, int estatura, int edad)
    {
        this.nombrePersona =  nombrePersona;
        this.hombre = hombre;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.caloriasIngeridas = 0;
    }

    /**
     * Metodo que permite dar de comer, permite como parametro un tipo 
     * de comida. Devuelve un entero(calorias ingeridas), o -1 en caso
     * de que no coma.
     */

    public int comer(Comida comida)
    {
        int caloriasComidas = -1;

        if (hombre == true){
            //Hombres = (10 x peso en kg) + (6 × altura en cm) - (5C × edad en años) + 5
            metabolismoBasalHombre=(10*peso)+(6*estatura+(5*edad)+5);
            if (metabolismoBasalHombre>=caloriasIngeridas){
                caloriasComidas=comida.getCaloriasDeLaComida();
                caloriasIngeridas= caloriasIngeridas+comida.getCaloriasDeLaComida();
            }

        }
        else{
            metabolismoBasalMujer= (10*peso) + (6*estatura + (5*edad) -161);
            if(metabolismoBasalMujer >= caloriasIngeridas){
                caloriasComidas=comida.getCaloriasDeLaComida();
                caloriasIngeridas= caloriasIngeridas+comida.getCaloriasDeLaComida();

            }
        }
        return caloriasComidas;
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }
}