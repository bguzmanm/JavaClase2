public class Cadenas {
  public static void main(String[] args) {
    int edad = 48;
    String nombre = "Brian";
    String apellido = "Guzmán";

    String mensaje = String.format("%s tiene %d años", nombre, edad);

    /*System.out.println(mensaje);

    System.out.printf("%s %s tiene %d años\n", nombre, apellido, edad);
    System.out.println(nombre + " tiene " + edad + " años");*/

    String laSuperCadena = "este es un texto largo por que voy a cortarlo en pedacitos";

    System.out.println(laSuperCadena.substring(10));
    System.out.println(laSuperCadena.substring(10, 20));

    System.out.println(laSuperCadena.startsWith("oeste"));

    System.out.println(laSuperCadena.indexOf("z"));

    final int HORAS_SEMANA = 40;
    final String PROFE_BOOTCAMP_JAVA = "Reinaldo";

    System.out.println(HORAS_SEMANA);
    System.out.println(PROFE_BOOTCAMP_JAVA);


  }

}