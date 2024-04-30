import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa el primer número: ");
    int num1 = sc.nextInt();

    System.out.println("Ingresa el segundo número: ");
    int num2 = sc.nextInt();

    float resultado = (float)num1 / num2;




    System.out.println("Resultado: " + resultado);

    final float MI_CONSTANTE = 25f;

    System.out.println(MI_CONSTANTE);


  }
}
