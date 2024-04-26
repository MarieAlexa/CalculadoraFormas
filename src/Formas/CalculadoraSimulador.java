package Formas;

import java.util.Scanner;
import Formas.modelo.Operacion;
import Formas.modelo.Forma;
import Formas.modelo.circulo;
import Formas.modelo.cuadrado;
import Formas.modelo.triangulo;
import Formas.modelo.rectangulo;
import Formas.modelo.pentagono;

public class CalculadoraSimulador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionFigura;
        do {
            System.out.println("Elija la figura geométrica:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.print("Opción: ");
            opcionFigura = scanner.nextInt();
        } while (opcionFigura < 1 || opcionFigura > 5);

        int opcionOperacion;
        do {
            System.out.println("\nElija la operación:");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Calcular potencia");
            System.out.print("Opción: ");
            opcionOperacion = scanner.nextInt();
        } while (opcionOperacion < 1 || opcionOperacion > 3);

        Forma forma = null;

        switch (opcionFigura) {
            case 1:
                System.out.print("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                forma = new circulo(radio);
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                forma = new cuadrado(lado);
                break;
            case 3:
                System.out.print("Ingrese la base del triangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                double altura = scanner.nextDouble();
                System.out.print("Ingrese el lado 1 del triangulo: ");
                double lado1 = scanner.nextDouble();
                System.out.print("Ingrese el lado 2 del triangulo: ");
                double lado2 = scanner.nextDouble();
                forma = new triangulo(base, altura, lado1, lado2);
                break;
            case 4:
                System.out.print("Ingrese la base del rectangulo: ");
                double baseRctangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectangulo: ");
                double alturaRectangulo = scanner.nextDouble();
                forma = new rectangulo(baseRctangulo, alturaRectangulo);
                break;
            case 5:
                System.out.print("Ingrese el lado del pentagono: ");
                double ladoPentagono = scanner.nextDouble();
                System.out.print("Ingrese el apotema del pentagono: ");
                double apotema = scanner.nextDouble();
                forma = new pentagono(ladoPentagono, apotema);
                break;
            default:
                System.out.println("Opcion invalida....intente de nuevo");
        }


                if (forma != null){
                double resultado = 0;
                    switch (opcionOperacion) {
                        case 1:
                            resultado = forma.calcularArea();
                            System.out.println("Area: " + resultado );
                            break;
                        case 2:
                            resultado = forma.calcularPerimetro();
                            System.out.println("Perimetro: " + resultado);
                            break;
                        case 3:
                            System.out.print("Base: ");
                            double basePotencia = scanner.nextDouble();
                            System.out.print("Exponente: ");
                            int exponente = scanner.nextInt();
                            resultado = forma.calcularPotencia(basePotencia, exponente );
                            System.out.println("Potencia: " + resultado );
                            break;
                        default:
                            System.out.println("Opcion invalida....intente de nuevo");
                    }


                }


        }


    }
