package tareas.homework12;
//Imprime la tabla de multiplicar segun n agregado y un rango especificado
import java.util.*;

public class Programa02_v1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rango = sc.nextInt();

    int i = 0;
    while(i <= rango) {
      System.out.println(num + " * " + i + " = " + num*i);
      i += 1;
    }

  }
}
