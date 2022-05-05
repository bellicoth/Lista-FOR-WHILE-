import java.util.*;

class Main {
  public static void main(String[] args) {
    /* 3. Criar um algoritmo que imprima a tabuada de multiplicação de qualquer número informado
*/
    Scanner grava = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int tabuada = grava.nextInt();
    for(int i = 0; i <= 10; i++){

      System.out.println("" + tabuada + " X " + i + " = " + (tabuada *i));
      
    }
  }
}
