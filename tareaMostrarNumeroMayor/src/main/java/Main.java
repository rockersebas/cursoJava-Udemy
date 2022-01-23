import java.util.Scanner;

public class Main {
    /*
    El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
    Podría ser utilizando operador ternario
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingresa el primer numero: ");
        num1 = scan.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        num2 = scan.nextInt();
        String resultado = (num1 > num2) ? "El numero, " + num1 + " es mayor que " + num2 :
                "El numero, " + num2 + " es mayor que " + num1;
        System.out.println(resultado);
    }
}
