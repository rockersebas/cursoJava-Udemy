import java.util.Scanner;

public class Main {
    /*
    Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
     Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la
     cantidad de notas 1, ademas mostrar el promedio total.
    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir
    las notas una a una para realizar los cálculos (contadores, sumas).
    Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y
    mostrar un mensaje de error finalizando el programa.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int canNotas = 5;
        double nota;
        double suma=0;
        double sumaMayor5 = 0;
        int contadorNotasMayor5 = 0;
        double sumaMenor4 = 0;
        int contadorNotasMenor4 = 0;
        int contNotas1 = 0;
        for (int i = 1; i<=canNotas;i++){
            System.out.println("Ingresa la "+i+ "  nota: ");
            nota = scan.nextDouble();
            if(nota == 0 || nota > 7) {
                System.out.println("Valor no valido !!");
                break;
            }else {
                suma = suma + nota;
                if (nota > 5) {
                    sumaMayor5 = sumaMayor5 + nota;
                    contadorNotasMayor5++;
                } else if (nota < 4) {
                    sumaMenor4 = sumaMenor4 + nota;
                    contadorNotasMenor4++;
                    if (nota == 1){
                        contNotas1++;
                    }
                }
            }

        }
        double promedio = suma / canNotas;
        double promedioMayor5 = sumaMayor5 / contadorNotasMayor5;
        double promedioMenor4 = sumaMenor4 / contadorNotasMenor4;

        System.out.println("El promedio es: " + promedio);
        System.out.println("El promedio de las notas mayores a 5 es: " + promedioMayor5);
        System.out.println("El promedio de las notas menores a 4 es: " + promedioMenor4);
        System.out.println("Tienes " + contNotas1 + " notas 1");

    }
}
