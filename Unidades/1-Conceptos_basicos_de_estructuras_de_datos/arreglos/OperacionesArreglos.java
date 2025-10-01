package mx.edu.uttt.arreglos;
import javax.swing.*;
import java.util.Scanner;
import java.util.Arrays;


public class OperacionesArreglos {

    private double[] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos() {
        this.vector = new double[TAMANIO];

    }

    public OperacionesArreglos(int tamanio) {
        this.vector = new double[tamanio];
    }

    public OperacionesArreglos(double[] vector) {
        this.vector = new double[vector.length];

    }

    public void llenarArreglo(double[] vector) {//inicio llenado arreglo
        int i = 0;
        while (i < this.vector.length) {
            this.vector[i] = vector[i];
            i++;
        }
    }

    public void llenarArreglo() { //in.llenar
        int i = 0;
        do {
            this.vector[i] = Double.parseDouble
                    (JOptionPane.showInputDialog("Introduce el valor decimal: "));
            i++;
        } while (i < this.vector.length);
    } //fin.llenar arreglo solicitando al usuario

    public double sumarValores() {//in.SumaV
        double suma = 0.0;
        for (int i = 0; i < this.vector.length; i++) {
            suma += this.vector[i]; //acumunlando
        }
        return suma;
    } //finSum.valores

    public double obtenerValorMaximo() {//in.ObteV.Maxim
        double maximo = 0.0;

        int i = 0;
        while (i < this.vector.length) {
            if (maximo < this.vector[i])
                maximo = this.vector[i];
            i++;
        }
        return maximo;
    }

    public double obtenerValorMinimo() {//in.Obte.VMin
        double vmin = this.vector[0];
        for (double valor : this.vector) {
            if (valor < vmin) {
                vmin = valor;
            }
        }
        return vmin;
    }

    public boolean compararArreglos(double[] vector) {//ini.CompArreglo
        boolean isEquals = true;
        if (vector.length != this.vector.length) {
            isEquals = false;
        } else {
            for (int i = 0; i < this.vector.length && isEquals; i++) {
                if (this.vector[i] != vector[i])
                    isEquals = false;
            }
        }
        return isEquals;
    }//finCompArreglo

    public void cambiarTamanio(int tamanio) {
        double temp[] = new double[tamanio];
        for (int i = 0; i < this.vector.length; i++) {
            temp[i] = this.vector[i];
        }
        this.vector = temp;
        temp = null; //vector de tipo objeto siempre es NULL

    }//finCamTam

    public void buscarValor(double valor) {//creacion de sentinel o sentinela --esta es una busqueda secuencial,existe la binaria
        String salida = "";
        boolean sentinel = false;
        for (int i = 0; i < this.vector.length; i++) {
            if (valor == this.vector[i]) {
                sentinel = true;
                salida = "El valor" + valor + "  está en la posición" + i;
                break;
            }
        }
        if (!sentinel)
            salida = "El valor no se encontro en el arreglo";


    }


    public void imprimir(){//se debe imprimir la variable de instancia CON FOREACH
        //foreach

        }

    }
