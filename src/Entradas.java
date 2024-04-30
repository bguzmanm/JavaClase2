import java.util.Scanner;

public class Entradas {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre:");
    String nombre = sc.nextLine();
    System.out.println("Apellido:");
    String apellido = sc.nextLine();
    System.out.println("Dirección:");
    String direccion = sc.nextLine();
    System.out.println("Numero:");
    int numero = sc.nextInt();
    System.out.println("Ciudad:");
    sc.nextLine();
    String ciudad = sc.nextLine();
    System.out.println("Telefono:");
    int telefono = sc.nextInt();

    String etiqueta = String.format("DE: %s %s \nDirección: %s %d\nCiudad: %s\nContacto: %d", nombre, apellido,
            direccion, numero, ciudad, telefono);

    System.out.println(etiqueta);




  }

}
