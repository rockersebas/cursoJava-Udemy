import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Crear una clase con el método main donde el desafío es buscar el número menor
    de mínimo 10 valores enteros, usando la clase Scanner ingresar la cantidad de
    números a comparar, luego utilizando una sentencia for iterar el numero de veces
    (ingresado) para pedir el numero entero, entonces se requiere:
    Calcular el menor número e imprimir el valor.
    Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir "
     el numero menor es igual o mayor que 10!".
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a comparar, recuerda que el minimo es 10");
        int cantNumeros = scan.nextInt();
        int num;
        int menor = Integer.MAX_VALUE;
        int numeros[] = new int[cantNumeros];
        if (cantNumeros < 10){
            System.out.println("Haz ingresado un valor incorrecto, el minimo debe ser 10");
        } else {
            for (int i=1; i<= cantNumeros ; i++){
                System.out.println("Ingresa el "+ i +" numero: ");
                num = scan.nextInt();
                numeros[i-1] = num;
                if (num < menor ){
                    menor = num;
                }
            }


        }
        System.out.print("Los numeros ingreasdos son: " + Arrays.toString(numeros));
        System.out.println("El numero menor es: " + menor);
        if(menor<10){
            System.out.println("El numero menor es menor que 10");
        }else{
            System.out.println("El numero menor es mayor que 10");
        }

    }
}
