package org.example;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                //Declarando variables clientes tuya

                String nombre;
                String apelledidos;
                Integer edad;
                Integer numeroUsosTarjeta;
                Double comprasAseo;
                Double comprasAlimentos;
                Double comprasOtros;
                Integer puntajeCredito;

                //Inicializando variables para ingreso datos por teclado


                System.out.print("Por favor ingrese nombre : ");
                nombre = teclado.nextLine();

                System.out.print("Por favor digite sus apellidos : ");
                apelledidos = teclado.nextLine();

                System.out.print("Por favor ingrese su edad:");
                edad = teclado.nextInt();

                System.out.print("Por favor ingrese la cantidad de usos de su tarjeta este mes :");
                numeroUsosTarjeta = teclado.nextInt();

                System.out.print("Por favor ingrese total compras aseo: ");
                comprasAseo = teclado.nextDouble();

                System.out.print("Por favor ingrese total compras alimentos: ");
                comprasAlimentos = teclado.nextDouble();

                System.out.print("Por favor ingrese total otras compras: ");
                comprasOtros = teclado.nextDouble();

                System.out.print("Ingrese su puntaje:");
                puntajeCredito = teclado.nextInt();


                //salida de datos al usuario......

                Double totalDeuda = comprasAseo + comprasAlimentos + comprasOtros;
                System.out.print("Total a pagar de su deuda es: " + totalDeuda);

                if (puntajeCredito == 1) {
                        Double totalDescuento = totalDeuda - (totalDeuda * 0.25);
                        System.out.print("Usted aplica descuento del 25% su total a pagar es  : " + totalDescuento);

                } else if (puntajeCredito == 2) {
                        Double totalDescuento = totalDeuda - (totalDeuda * 0.2);
                        System.out.print("Usted aplica descuento del 20% su total a pagar es : " + totalDescuento);
                } else if (puntajeCredito == 3) {
                        Double totalDescuento = totalDeuda - (totalDeuda * 0.15);
                        System.out.print("Usted aplica descuento del 15% su total a pagar es  : " + totalDescuento);
                } else if (puntajeCredito == 4) {
                        Double totalDescuento = totalDeuda - (totalDeuda * 0.1);
                        System.out.println("Usted aplica descuento del 10% su total a pagar es  : " + totalDescuento);
                } else if (puntajeCredito == 5 || puntajeCredito == 6 || puntajeCredito == 7 || puntajeCredito == 8 || puntajeCredito == 9) {
                        System.out.print("Usted no aplica para ningun beneficio:");
                } else {
                        System.out.print("sin comentarios:");
                }


        }
}
