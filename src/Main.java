import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean seguirCalculando = true;
        boolean programa = true;

        //Michael Steeven Sanchez Fernandez
        //Ejercicio de ley de Ohm y Definitiva de notas
        //31/08/2024

        while (programa) {
            System.out.println("---------------------------------");
            System.out.println("Ejercicios...");
            System.out.println("Bienvenido Usuario, por favor seleccione el ejercicio a ejecutar...");
            int ejercicio;
            System.out.println("Por favor digite el ejercicio: ");
            System.out.println("1. Ley de Ohm");
            System.out.println("2. Promedio Notas");
            System.out.println("3. Salir");
            System.out.println("Selección de ejercicio: ");
            ejercicio = teclado.nextInt();

            switch (ejercicio) {
                case 1:
                    while (seguirCalculando) {
                        System.out.println("---------------------------------");
                        System.out.println("Ley de Ohm...");
                        System.out.println("Bienvenido Usuario, por favor digite la opción a calcular: ");
                        System.out.println("1. Voltaje");
                        System.out.println("2. Intensidad o Corriente");
                        System.out.println("3. Resistencia");
                        System.out.println("4. Salir");
                        int opcion;
                        double voltaje, intensidad, resistencia;
                        System.out.println("Por favor digite la opción: ");
                        opcion = teclado.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("Por favor digite la Intensidad...");
                                intensidad = teclado.nextDouble();
                                System.out.println("Por favor digite la Resistencia...");
                                resistencia = teclado.nextDouble();
                                voltaje = intensidad * resistencia;
                                System.out.println("Calculando el voltaje...");
                                System.out.println("El valor del voltaje es de: " + voltaje + " Voltios");
                                break;

                            case 2:
                                System.out.println("Por favor digite el voltaje...");
                                voltaje = teclado.nextDouble();
                                System.out.println("Por favor digite la Resistencia...");
                                resistencia = teclado.nextDouble();
                                while (resistencia == 0) {
                                    System.out.println("La resistencia no puede ser cero...");
                                    System.out.print("Por favor digite una resistencia válida: ");
                                    resistencia = teclado.nextDouble();
                                }
                                intensidad = voltaje / resistencia;
                                System.out.println("Calculando la intensidad...");
                                System.out.println("El valor de la intensidad es de: " + intensidad + " Amperios");
                                break;

                            case 3:
                                System.out.println("Por favor digite el voltaje...");
                                voltaje = teclado.nextDouble();
                                System.out.println("Por favor digite la intensidad...");
                                intensidad = teclado.nextDouble();
                                while (intensidad == 0) {
                                    System.out.println("La intensidad no puede ser cero...");
                                    System.out.print("Por favor digite una intensidad válida: ");
                                    intensidad = teclado.nextDouble();
                                }
                                resistencia = voltaje / intensidad;
                                System.out.println("Calculando la resistencia...");
                                System.out.println("El valor de la resistencia es de: " + resistencia + " Ohmnios");
                                break;

                            case 4:
                                System.out.println("Saliendo del programa...");
                                seguirCalculando = false;
                                break;

                            default:
                                System.out.println("Función no válida, por favor vuelva a digitar una opción válida...");
                                break;
                        }
                    }
                    break;

                case 2:
                    DecimalFormat df = new DecimalFormat("0.00");
                    double tarea1, quiz1, parcial1;
                    double tarea2, quiz2, parcial2;
                    double tarea3, quiz3, parcial3;
                    double def1, def2, def3, definitiva;

                    System.out.println("Bienvenido profesor, por favor digite las notas del estudiante por cortes...");
                    System.out.println("Corte1...");
                    System.out.println("Nota de tarea: ");
                    tarea1 = teclado.nextDouble();
                    while (tarea1 < 0 || tarea1 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        tarea1 = teclado.nextDouble();
                    }
                    System.out.println("Nota de quiz: ");
                    quiz1 = teclado.nextDouble();
                    while (quiz1 < 0 || quiz1 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        quiz1 = teclado.nextDouble();
                    }
                    System.out.println("Nota de parcial: ");
                    parcial1 = teclado.nextDouble();
                    while (parcial1 < 0 || parcial1 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        parcial1 = teclado.nextDouble();
                    }
                    def1 = (tarea1 + quiz1 + parcial1) / 3;

                    System.out.println("Corte2...");
                    System.out.println("Nota de tarea: ");
                    tarea2 = teclado.nextDouble();
                    while (tarea2 < 0 || tarea2 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        tarea2 = teclado.nextDouble();
                    }
                    System.out.println("Nota de quiz: ");
                    quiz2 = teclado.nextDouble();
                    while (quiz2 < 0 || quiz2 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        quiz2 = teclado.nextDouble();
                    }
                    System.out.println("Nota de parcial: ");
                    parcial2 = teclado.nextDouble();
                    while (parcial2 < 0 || parcial2 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        parcial2 = teclado.nextDouble();
                    }
                    def2 = (tarea2 + quiz2 + parcial2) / 3;

                    System.out.println("Corte3...");
                    System.out.println("Nota de tarea: ");
                    tarea3 = teclado.nextDouble();
                    while (tarea3 < 0 || tarea3 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        tarea3 = teclado.nextDouble();
                    }
                    System.out.println("Nota de quiz: ");
                    quiz3 = teclado.nextDouble();
                    while (quiz3 < 0 || quiz3 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        quiz3 = teclado.nextDouble();
                    }
                    System.out.println("Nota de parcial: ");
                    parcial3 = teclado.nextDouble();
                    while (parcial3 < 0 || parcial3 > 5) {
                        System.out.print("Por favor digite una nota válida: ");
                        parcial3 = teclado.nextDouble();
                    }
                    def3 = (tarea3 + quiz3 + parcial3) / 3;

                    System.out.println("Calculando resultados...");
                    def1 = def1 * 0.35;
                    def2 = def2 * 0.35;
                    def3 = def3 * 0.30;
                    definitiva = def1 + def2 + def3;

                    if (definitiva >= 3 && definitiva <= 5) {
                        System.out.println("El estudiante fue aprobado, su nota es de: " + df.format(definitiva));
                    } else if (definitiva >= 1.9 && definitiva < 3) {
                        System.out.println("El estudiante habilita, su nota es de: " + df.format(definitiva));
                    } else if (definitiva >= 0 && definitiva <= 1.9) {
                        System.out.println("El estudiante reprueba, su nota es de: " + df.format(definitiva));
                    } else {
                        System.out.println("Error en las notas ingresadas");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    programa = false;
                    break;

                default:
                    System.out.println("Opción no válida, por favor seleccione una opción válida.");
                    break;
            }
        }
    }
}

