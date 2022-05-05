import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    /* 5. Entrar com uma mensagem e imprimir quantas letras A E / O e U tem esta mensagem (considerar minúscula e maiúscula).*/
    Scanner grava = new Scanner(System.in);
    String mensagem = "";
    int count = 0;

    System.out.println("Digite uma mensagem: ");
    mensagem = grava.nextLine();

    for(int i = 0; i < mensagem.length();i++){
      
      if(mensagem.toUpperCase().charAt(i) == 'A' ||
         mensagem.toUpperCase().charAt(i) == 'E' ||
         mensagem.toUpperCase().charAt(i) == 'I' ||
         mensagem.toUpperCase().charAt(i) == 'O' ||
         mensagem.toUpperCase().charAt(i) == 'U'
        ){
        count++;
        }
    }

    System.out.println("A mensagem tem " + count + " vogais.");
    
    
  }
}
