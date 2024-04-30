import java.util.Scanner;

public class Notas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nombre Completo");
    String nombre = sc.nextLine();
    System.out.println("Asignatura:");
    String asignatura = sc.nextLine();
    System.out.println("Docente:");
    String docente = sc.nextLine();

    System.out.println("Nota 1:");
    float nota1 = sc.nextFloat();
    System.out.println("Nota 2:");
    float nota2 = sc.nextFloat();
    System.out.println("Nota 3:");
    float nota3 = sc.nextFloat();

    String etiqueta = String.format("%s %s (%s): %.2f %.2f %.2f", nombre, asignatura, docente, nota1, nota2, nota3);

    System.out.println(etiqueta);
  }
}
