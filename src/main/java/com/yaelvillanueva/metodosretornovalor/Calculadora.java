package com.yaelvillanueva.metodosretornovalor;

import javax.swing.JOptionPane;

/**
 *
 * @author YAEL
 */
public class Calculadora {

    public static void main(String[] args) {

        //Calculadora con retorno de valor
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));

        Operaciones op = new Operaciones();

        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division = op.dividir(n1, n2);
        op.mostrarResultados(suma, resta, multiplicacion, division);

        //Mostrar los resultados de forma directa
        System.out.println("\n");
        op.mostrarResultados(op.sumar(n1, n2), op.restar(n1, n2), op.multiplicar(n1, n2), op.dividir(n1, n2));

    }
}
