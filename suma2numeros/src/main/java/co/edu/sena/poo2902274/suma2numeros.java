package co.edu.sena.poo2902274;

import java.util.Scanner;

public class suma2numeros 
{
    //Se comienza la ejecucion del programa//
    public static void main(String[] args) 
    {
        //se da el primer mensaje y el ingreso del primer numero//
        System.out.println("1. suma de dos numeros");
        System.out.println("2. ingrese el primer numero");
        // Se crea el scanner llamado src para leer los valores ingresados//
        // Se define la primera variable con num1//
        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();
        //Se genera el segundo mensaje para el ingreso del segundo numero//
        //se define la segunda variable como num2//
        System.out.println("3. ingrese el segundo numero");
        double num2 = src.nextDouble();
        //Se calcula la suma de los dos números y almacena el resultado en la variable result.
        //Se imprime el mensaje de resultado y la variable result
        double result = num1 + num2;
        System.out.println("la suma de los dos numeros es " + result);
        //Se cierra el scanner//
        src.close();
    }
}

