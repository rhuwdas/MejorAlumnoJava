import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, calif = 0, contCalif, promedio, promedioAnterior = 0, promedioAlto = 0;
        String nombre = "", nombrePAlto = "";
        for (int i = 1; i <= 3; i++) {
            contCalif = 0;
            System.out.println("introduce el nombre del alumno");
            nombre = sc.next();

            for (int j = 1; j <= 5; j++) {
                System.out.println("introduce la califiacion del alumno " + i);
                calif = sc.nextInt();
                contCalif = contCalif + calif;
            }
            promedio = contCalif / 5;
            System.out.println("el promedio fue " + promedio);
            if (promedio > promedioAlto) {
                nombrePAlto = nombre;
                promedioAlto = promedio;
            }

        }
        System.out.println(nombrePAlto + " " + promedioAlto);
    }
}
