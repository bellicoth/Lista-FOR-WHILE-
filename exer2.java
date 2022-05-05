import java.util.*;

class Main {
  public static void main(String[] args) {
    /* 2. Criar um algoritmo que imprima todos os números pares no intervalo 1-50.*/

    Scanner grava = new Scanner(System.in);
    for(int i = 1; i < 50; i++){

      if(i % 2 == 0){
      System.out.print(" "+ i);
      }
      
    }
  }
}
