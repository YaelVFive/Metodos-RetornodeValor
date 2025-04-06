package com.yaelvillanueva.metodosretornovalor;
import javax.swing.JOptionPane;
/**
 *
 * @author YAEL
 */

public class Operaciones {

    public int sumar(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public int dividir(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }

    public void mostrarResultados(int suma, int resta, int multiplicacion, int division) {
        System.out.println("La suma es: " + suma);
        System.out.println("La diferencia es: " + resta);
        System.out.println("El producto es: " + multiplicacion);
        System.out.println("El cociente es: " + division);
    }

    public static void main(String[] args) {

    }
}
