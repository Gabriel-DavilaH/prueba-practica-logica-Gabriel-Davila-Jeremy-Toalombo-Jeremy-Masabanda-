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

            System.out.print("Ingrese la nota 3 (0-10): ");
            double nota3 = sc.nextDouble();

            while (nota3 < 0 || nota3 > 10) {
                System.out.print("Nota invalida. Ingrese nuevamente: ");
                nota3 = sc.nextDouble();
            }

            System.out.print("Ingrese la asistencia (0-100): ");
            double asistencia = sc.nextDouble();

            while (asistencia < 0 || asistencia > 100) {
                System.out.print("Asistencia invalida. Ingrese nuevamente: ");
                asistencia = sc.nextDouble();
            }

            double promedio = (nota1 * 0.30) +
                              (nota2 * 0.30) +
                              (nota3 * 0.40);

            System.out.println("Promedio: " + promedio);

            if (promedio >= 9) {
                System.out.println("Clasificacion: Excelente");
            } else if (promedio >= 7) {
                System.out.println("Clasificacion: Aprobado");
            } else if (promedio >= 5) {
                System.out.println("Clasificacion: Supletorio");
            } else {
                System.out.println("Clasificacion: Reprobado");
            }

            if (promedio >= 7 && asistencia >= 75) {
                aprobados++;
            } else {
                reprobados++;
            }

            sumaPromedios += promedio;

            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = nombre;
            }
        }

        double promedioGeneral = sumaPromedios / N;

        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("Promedio general: " + promedioGeneral);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Mejor estudiante: " + mejorEstudiante);
        System.out.println("Mejor promedio: " + mejorPromedio);

        sc.close();
    }
}
