package co.edu.sena.poo2902274;

import java.util.Scanner;

public class areayperimetro 
{
    public static void main( String[] args )
    {
        // entradas
        System.out.println("1. Calcular el area y perimetro de un cuadrado");
        System.out.println("2. Ingrese el valor de un lado del cuadrado");

        // Crear un objeto Scanner para leer entradas
        Scanner src = new Scanner(System.in);
        // Leer el lado del cuadrado
        double lado = src.nextDouble();

        // Calcular el área y el perimetro del cuadrado utilizando la fórmula
        double area = (lado * lado);
        double perimetro = (lado + lado + lado + lado);

        // Imprimir el resultado y agregando "/n" para hacer los saltoa de linea y queden los resulatos por separado//
        System.out.print("El area del cuadrado es: " + area + "\n");
        System.out.print("El perimetro del cuadrado es: " + perimetro + "\n");

        // Cerrar el objeto Scanner 
        src.close();
    }
}
