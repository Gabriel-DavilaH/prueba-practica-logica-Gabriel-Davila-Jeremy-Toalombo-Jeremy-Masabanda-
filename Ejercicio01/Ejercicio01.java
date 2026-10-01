import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int aprobados = 0;
        int reprobados = 0;

        double sumaPromedios = 0;
        double mejorPromedio = 0;
        String mejorEstudiante = "";

        System.out.print("Ingrese la cantidad de estudiantes: ");
        N = sc.nextInt();

        while (N <= 0) {
            System.out.print("N debe ser mayor a 0. Ingrese nuevamente: ");
            N = sc.nextInt();
        }

        for (int i = 1; i <= N; i++) {

            System.out.println("\n--- Estudiante " + i + " ---");

            sc.nextLine();

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la nota 1 (0-10): ");
            double nota1 = sc.nextDouble();

            while (nota1 < 0 || nota1 > 10) {
                System.out.print("Nota invalida. Ingrese nuevamente: ");
                nota1 = sc.nextDouble();
            }

            System.out.print("Ingrese la nota 2 (0-10): ");
            double nota2 = sc.nextDouble();

            while (nota2 < 0 || nota2 > 10) {
                System.out.print("Nota invalida. Ingrese nuevamente: ");
                nota2 = sc.nextDouble();
            }
