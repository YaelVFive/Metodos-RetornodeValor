package com.yaelvillanueva.metodosretornovalor;
import javax.swing.JOptionPane;

/**
 *
 * @author YAEL
 */
public class Calculadora2 {

    public static void main(String[] args) {

        Operaciones2 op2 = new Operaciones2();

        op2.leerNumeros();
        op2.sumar2();
        op2.restar2();
        op2.multiplicar2();
        op2.dividir2();
        op2.showResults();

    }
}
