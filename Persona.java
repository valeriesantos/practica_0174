import java.util.Scanner;
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
    private int metabolismoBasal;

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
        getMetabolismo();
    }

    /**
     * Metodo que permite dar de comer, permite como parametro un tipo 
     * de comida. Devuelve un entero(calorias ingeridas), o -1 en caso
     * de que no coma.
     */

    public int comer(Comida comida)
    {
        int caloriasComidas = -1;

        if (metabolismoBasal>=caloriasIngeridas){
            caloriasComidas=comida.getCaloriasDeLaComida();
            caloriasIngeridas= caloriasIngeridas+comida.getCaloriasDeLaComida();
        }

        return caloriasComidas;
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }

    /**
     * Metodo que obtiene el metabolismo de mujer y hombre.
     */
    public void getMetabolismo(){
        if (hombre == true){
            //Hombres = (10 x peso en kg) + (6 × altura en cm) - (5C × edad en años) + 5
            metabolismoBasal=(10 * peso)+(6 * estatura + (5*edad) +5);

        }
        else{
            metabolismoBasal= (10 * peso) + (6 * estatura + (5 * edad) -161);

        }

    }

    /**
     * Metodo que devuelve SI o NO, dependiendo de si su metabolismo basal es
     * mayor que las calorias ingeridas. Si ("texto" / 3) la respuesta es si. 
     * En caso contrario devuelve no. Tambien comprueba si el texto contiene
     * el nombre de la persona, en ese caso nos devuelve la propia pregunta en MAYUS.
     */
    public String contestar(String texto){
        String responde = "";
        if (metabolismoBasal >= caloriasIngeridas ){
            if(texto.length()%3 == 0){
                responde = "SI";

            }
            else{
                responde = "NO";

            }
        }

        if(metabolismoBasal<caloriasIngeridas || texto.contains(nombrePersona)){
            responde = texto.toUpperCase();
        }
        System.out.println(responde);
        return responde;
    }
}
