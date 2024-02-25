package co.edu.sena.poo2902274;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("1. Elevador de numeros al cuadrado"); 
        System.out.println("2. Ingrese un numero");

        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();
       
        //Se calcula la suma de los dos números y almacena el resultado en la variable result.
        //Se imprime el mensaje de resultado y la variable result
        double result = num1 * num1;
        System.out.println("El numero es " + result);
        //Se cierra el scanner//
        src.close();
    }
}
