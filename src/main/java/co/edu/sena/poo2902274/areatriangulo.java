package co.edu.sena.poo2902274;

import java.util.Scanner;

public class areatriangulo 
{
    public static void main(String[] args)
    {
        // entradas
        System.out.println("1. Calcular el area de un triangulo");
        System.out.println("2. Ingrese la base del triangulo");

        // Crear un objeto Scanner para leer entradas
        Scanner src = new Scanner(System.in);

        // Leer la base del triángulo 
        double base = src.nextDouble();

        // ingresar la altura del triángulo
        System.out.println("3. Ingrese la altura del triangulo");

        // Leer la altura del triángulo 
        double height = src.nextDouble();
        
        // Calcular el área del triángulo utilizando la fórmula
        double result = (base * height) / 2;

        // Imprimir el resultado 
        System.out.print("El area del triangulo es: " + result);

        // Cerrar el objeto Scanner 
        src.close();
    }
}
