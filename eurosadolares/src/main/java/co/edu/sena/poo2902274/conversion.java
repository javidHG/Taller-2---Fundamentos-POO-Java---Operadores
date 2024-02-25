package co.edu.sena.poo2902274;

import java.util.Scanner;

public class conversion
{   
    public static void main(String[] args)
    {  
        System.out.println("1. Conversión de euros a dólares");
        System.out.println("2. Ingrese la cantidad de euros");

        Scanner src = new Scanner(System.in);
        double euros = src.nextDouble();

        //Se coloca la tasa de cambio del dia como fija para un resultado mas exacto//
        double tasaDeCambio = 0.92;
        //se coloca el resultado multiplicando los dolares por la tasa de cambio//
        double dolares = euros * tasaDeCambio;
        System.out.println("La conversión es de " + dolares + " dólares");

        src.close();
    }
}
