package co.edu.sena.poo2902274;

import java.util.Scanner;

public class promedio 
{
    public static void main( String[] args )
    {
         // entradas
        System.out.println("1. Calcular el promedio al ingrsar 3 numeros");
        System.out.println("2. Ingrese el primer numero ");

        // Crear un objeto Scanner para leer entradas
        Scanner src = new Scanner(System.in);

        // Leer el primer numero
        double num1 = src.nextDouble();

        // ingresar el segundo numero
        System.out.println("3. Ingrese el segundo numero");

        // Leer el segundo numero 
        double num2 = src.nextDouble();

        //ingresar el ultimo numero//
        System.out.println("4. Ingrese el tercer numero");
        //leer el tercer numero//
        double num3 = src.nextDouble();

        // Calcular el promedio sumando los numeros y dividiendolos por la cantidad de datos ingresados//
        double promedio = (num1 + num2 + num3 ) / 3;

        // Imprimir el resultado 
        System.out.print("El promedio es: " + promedio);

        // Cerrar el objeto Scanner 
        src.close();
    
    }
}
