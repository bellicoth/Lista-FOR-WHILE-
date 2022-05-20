import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    int menu;
    double x = 0, val1 = 0, val2 = 0, potencia, raizQuadrada;
    do{
    System.out.println("\n\nMENU - Operações \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 5 - Potência \n 6 - Raiz quadrada \n 7 - SAIR\n\n Escolha uma operação: ");
    menu = grava.nextInt();
    System.out.println("-------------------------------------------");
    if(menu <= 5){
          System.out.println("Digite um valor: ");
          val1 = grava.nextDouble();
          System.out.println("Digite um valor: ");
          val2 = grava.nextDouble();
      }else if(menu == 6){
          System.out.println("Digite um valor para RAIZ QUADRADA: ");
          x = grava.nextDouble();
      
      }

    switch(menu){
        
      case 1:
        System.out.println("Operação SOMA! \n\n" + val1 + " + " + val2 + " = " +(val1 + val2));
        break;
      case 2:
        System.out.println("Operação SUBTRAÇÃO! \n\n" + val1 + " - " + val2 + " = " +(val1 - val2));
        break;
      case 3:
        System.out.println("Operação MULTIPLICAÇÃO! \n\n" + val1 + " X " + val2 + " = " +(val1 * val2));
        break;
      case 4:
        System.out.println("Operação DIVISÃO! \n\n" + val1 + " / " + val2 + " = " +(val1 / val2));
        break;
      case 5:
        potencia = Math.pow(val1, val2);
        System.out.println("Operação POTÊNCIA! \n\n" + val1 + " elevado a " + val2 + " = " + potencia);
        break;
      case 6:
        raizQuadrada = Math.sqrt(x); 
        System.out.println("Operação RAIZ QUADRADA! \n\n Raiz quadrada de " + x + " = " + raizQuadrada );
        break;

       case 7:
        System.out.println("Sistema encerrado!");
        break;

      default:
        System.out.println("Operação invalida");
        break;
        
    }
     }while(menu != 7);
  }
}
