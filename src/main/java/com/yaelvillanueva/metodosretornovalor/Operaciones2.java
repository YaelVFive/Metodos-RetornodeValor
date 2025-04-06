package com.yaelvillanueva.metodosretornovalor;

import javax.swing.JOptionPane;

/**
 *
 * @author YAEL
 */
public class Operaciones2 {

    //Atributos
    int num1, num2, adicion, diferencia, producto, cociente;

    //Metodos
    public void leerNumeros() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Coloca el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Coloca el segundo numero"));
    }

    //Metodo de suma
    public void sumar2() {
        adicion = num1 + num2;
    }

    public void restar2() {
        diferencia = num1 - num2;
    }

    public void multiplicar2() {
        producto = num1 * num2;
    }

    public void dividir2() {
        cociente = num1 / num2;
    }

    public void showResults() {
        System.out.println("La suma es " + adicion);
        System.out.println("La resta es: " + diferencia);
        System.out.println("La multiplicacion es: " + producto);
        System.out.println("La division es: " + cociente);
    }

    public static void main(String[] args) {
    }
}
