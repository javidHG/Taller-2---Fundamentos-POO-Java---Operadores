package co.edu.sena.poo2902274;

import java.util.Scanner;

public class radioylongitud 
{
    public static void main( String[] args )
    {
        //se crea un objeto Scanner para leer el radio de la circunferencia//
        Scanner scanner = new Scanner(System.in);

        //se pide el ingreso del radio y se lee 
        System.out.println("1. Ingrese el radio de la circunferencia:");
        double radio = scanner.nextDouble();

        //se  calcula la longitud de la circunferencia utilizando la variable de pi
        double longitudCircunferencia = 2 * Math.PI * radio;

        //se calcura el area del circulo
        double areaCirculoInscrito = Math.PI * Math.pow(radio, 2);

        // salidas
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
        System.out.println("El área del círculo inscrito es: " + areaCirculoInscrito);

       
        scanner.close();
       
    }
}
