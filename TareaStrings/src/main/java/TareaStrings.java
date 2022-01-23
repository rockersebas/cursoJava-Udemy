import java.util.Locale;
import java.util.Scanner;

public class TareaStrings {

    /*Se requiere desarrollar un programa que reciba
    los nombres de 3 integrantes de tu familia o amigos
     como argumentos de línea de comandos.
    Se pide por cada nombre de la persona una nueva variable del tipo
    String al tomar el segundo carácter pero convertido en
    mayúscula y se le concatena un punto y los dos últimos caracteres
    de la persona. Por ejemplo para Andres debe quedar como N.es
    Debe imprimir como resultado los tres nuevos nombres separado
     con guion bajo (como una única variable).
    Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
    N.es_A.ia_E.pe
     */

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el primer nombre: ");
        String nombre = scan.nextLine();
        String nombreA = nombre.toUpperCase().charAt(1) + "." + nombre.substring(nombre.length()-2);
        System.out.println("Ingresa el segundo nombre: ");
        String nombre2 = scan.nextLine();
        String nombreB = nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        System.out.println("Ingresa el tecer nombre: ");
        String nombre3 = scan.nextLine();
        String nombreC = nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        String nombres = "";
        StringBuilder sb = new StringBuilder(nombres);
        sb.append(nombreA + "_");
        sb.append(nombreB + "_");
        sb.append(nombreC);
        System.out.println(sb);



    }
}
