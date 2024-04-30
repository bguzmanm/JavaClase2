import java.util.Scanner;

/**
 * Desarrolle un programa en lenguaje Java tal que,
 * al ingresar una cadena de texto o String por teclado,
 * tome dicha cadena y la lea carácter por carácter,
 * y los despliegue por consola.
 */

public class CadenaTexto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingresa la cadena de caracteres:");
    String cadena = sc.nextLine();

    // i++; i = i + 1; i+=1;
    // muestra el texto vertical
    for (int i = 0; i < cadena.length(); i++) {
      System.out.println(cadena.substring(i, i+1));
    }

    // muestra el texto vertical y al revez
    for (int i = cadena.length()-1; i >= 0; i--) {
      System.out.println(cadena.substring(i, i+1));
    }

    // quita las vocales

    // String nueva_cadena = cadena.replace('a', 'X');
    String nueva_cadena = cadena.replaceAll("[aeiouAEIOU]", "X"); // utilizando expresión regular


    System.out.println(nueva_cadena);

  }
}
