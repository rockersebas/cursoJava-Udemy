import java.util.Scanner;

public class Main {

    /*
    Suponiendo un estanque de gasolina (gas) con capacidad 70 litros,
     se requiere un programa que pida la medida actual en litros y
     mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
        La medida o capacidad actual del estanque puede ser en tipo double,
        para una mejor precisión, pero tambien puede ser del tipo int.
        Si la capacidad actual es 70 litros: imprimir Estanque lleno
        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
        Si está entre 40 y menor a 60: imprimir Estanque  3/4
        Si está entre 35 y menor a 40: imprimir Medio Estanque
        Si está entre 20 y menor a 35: imprimir Suficiente
        Si está entre 1 y menor a 20: imprimir Insuficiente
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa cuantos litros tienes");
        int cantidad = scan.nextInt();
        System.out.println("Cantidad ingresada: " + cantidad);
        String resultado = "";
        if (cantidad == 70){
            resultado = "Estanque lleno";
        }else if (cantidad >= 60 && cantidad < 70) {
            resultado = "Estanque casi lleno";
        } else if (cantidad >= 40 && cantidad < 60) {
            resultado = "Estanque 3/4";
        }else if (cantidad >=  35 && cantidad < 40) {
            resultado = "Medio estanque";
        }else if (cantidad >= 20 && cantidad < 35) {
            resultado = "Suficiente";
        } else if (cantidad >= 1 && cantidad < 20){
            resultado = "Insuficiente";
        }

        System.out.println("Resultado: " + resultado);
    }
}
