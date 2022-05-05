import java.util.*;

class Main {
  public static void main(String[] args) {
    /* 1-) Criar um algoritmo que entre com cinco números e imprimir o quadrado de cada*/

    int val;
    
    Scanner grava = new Scanner(System.in);
    for(int i = 0; i < 5; i++){

      System.out.println("Digite um valor: ");
      val = grava.nextInt();
      System.out.println("O quadrado de " + val + " é " + (val * val));
      
    }
  }
}
