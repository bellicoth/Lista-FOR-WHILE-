import java.util.*;

class Main {
  public static void main(String[] args) {
    /* 4. Criar um algoritmo que imprima a tabuada de qualquer número informado, conforme a opção 
informada: 0=Sair 1=Soma 2=Subtração 3=Multiplicação 4=Divisão*/
    Scanner grava = new Scanner(System.in);
    int menu;
    double tabuada, res = 0;
    System.out.println("MENU \n 0 = SAIR \n 1 = SOMA \n 2 = Subtração \n 3 = Multiplicação \n 4 = Divisão \n\n Digite uma operação: ");
    menu = grava.nextInt();

    System.out.println("Informe um numero: ");
    tabuada = grava.nextDouble();

    switch(menu){

      case 0:
        System.out.println("Sistema encerrado!");
        break;

      case 1:
        for(int i = 0;i<=10;i++){
          res = (double) tabuada + i;
          System.out.println("" + tabuada + " + " + i + " = " + res);
        }
        break;

      case 2:
        for(int i = 0;i<=10;i++){
          res = (double) tabuada - i;
          System.out.println("" + tabuada + " - " + i + " = " + res);
        }
        break;

      case 3:
        for(int i = 0;i<=10;i++){
          res = (double) tabuada * i;
          System.out.println("" + tabuada + " X " + i + " = " + res);
        }
        break;

      case 4:
        for(int i = 1;i<=10;i++){
          res = (double) tabuada / i;
          String message = String.format("%.2f / %d = %.2f", tabuada, i, res);
          System.out.println(message);
        }
        break;  

      default:
        System.out.println("Entrada invalida");
        break;
    }
    
  }
}
