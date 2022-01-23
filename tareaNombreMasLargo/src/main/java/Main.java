import javax.swing.*;

public class Main {

    /*
    Mediante el teclado pedir el nombre completo (nombre + apellido) de
    tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
    Calcular e Imprimir el nombre de la persona que tenga el nombre
    más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
    Podría usar .split(" "); del objeto String para separar nombre y
    apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.
    Restricción no usar loops en el desarrollo de la tarea.
     */

    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingresa el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el segundo nombre");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el tercer nombre");
        System.out.println(nombre1 +" = "+ nombre1.length() );
        System.out.println(nombre2 +" = "+ nombre2.length() );
        System.out.println(nombre3 +" = "+ nombre3.length() );
        String nombreMayor = "";
        if (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) {
            nombreMayor = nombre1;
        } else if(nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()){
            nombreMayor = nombre2;
        }else {
            nombreMayor = nombre3;
        }
        System.out.println("El nombre mas largo es: " + nombreMayor);
    }
}
