package co.edu.sena.poo2902274;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class cilindro 
{
    public static void main( String[] args )
    {
    
      Scanner scanner = new Scanner(System.in);

        // se pide el ingreso del radio de la base//
        System.out.println("1. Ingrese el radio de la base del cilindro:");
        double radio = scanner.nextDouble();

        // se pide la altura del cilindro//
        System.out.println("2. Ingrese la altura del cilindro:");
        double altura = scanner.nextDouble();

        // se calcula el area de la base del cilindro con las variables match.pi que significa el valor de pi//
        // y match.pow que calcula el radio al cuadrado, necesario para la formula de la base del cilindro//
        double areaBase = Math.PI * Math.pow(radio, 2);

        // se calcula el área lateral del cilindro
        double areaLateral = 2 * Math.PI * radio * altura;

        // se calcula el área total del cilindro
        double areaTotal = areaBase + areaLateral;

        // se calcula el volumen del cilindro
        double volumen = areaBase * altura;

        // se imprimen los resultados con saltos de linea 
        System.out.println("El área total del cilindro es: " + areaTotal);
        System.out.println("El volumen total del cilindro es: " + volumen);

        scanner.close();

    }
}
