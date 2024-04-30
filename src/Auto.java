import java.util.Scanner;

public class Auto {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("ingresa la distancia en km:");
    float distancia = sc.nextFloat();

    System.out.println("ingresa la tiempo en horas:");
    float tiempo = sc.nextFloat();

    float velocidad = distancia  / tiempo;

    System.out.printf("la velocidad es %.2f km/h", velocidad);

  }
}
