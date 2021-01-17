/*
Crea un programa en el que tendrás una función que se encargará de pedir edades 
al usuario y de calcular la edad media. 
La función recibirá un parámetro: el nº de personas a las que pedir la edad. 
La media de las edades introducidas deberá ser el valor devuelto por la función (return).
 */
package funciones_ex7_edades;

import java.util.Scanner;

/**
 * Programa para obtener el promedio de edades de ciertas cantidades personas introducidas por consola.
 * @author Williams
 * @since 17/01/2021
 */
public class FUNCIONES_EX7_EDADES {

    /**
     * Método que imprimirá por consola el promedio de las edades de n usuarios.
     * @param args 
     */
    
    public static void main(String[] args) {

        int personasUsuario;

        System.out.println("Introduzca el numero de personas que desea conocer su edad: ");

        do {

            personasUsuario = new Scanner(System.in).nextInt();
            if (personasUsuario < 0) {
                System.out.println("Número Incorrecto. Introduzca nuevamente la cantidad de personas: ");
            }

        } while (personasUsuario < 0);

        System.out.println("El Promedio de edades es: " + promediarEdad(personasUsuario) + " años");

    }

    /**
     *Método que me sirve para obtener el promedio de edades de cierta cantidad depersonas
     * @param numPersona recibe la cantidad de personas a evaluar. 
     * @return la media de las edades un tipo de dato float.
     */
    public static float promediarEdad(int numPersona) {

        int edades;
        float promedioEdades = 0;
        float sumaEdades = 0;

        for (int i = 1; i <= numPersona; i++) {
            System.out.println("Introduce la edad de la persona " + i);

            do {

                edades = new Scanner(System.in).nextInt();
                sumaEdades = sumaEdades + edades;

                if (edades < 0) {
                    System.out.println("Número de edad Incorrecto. Vuelva a intentar");
                }

            } while (edades < 0);

        }
        promedioEdades = (float) sumaEdades / (float) numPersona;

        return promedioEdades;
    }

}
