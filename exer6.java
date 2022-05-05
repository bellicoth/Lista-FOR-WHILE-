import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    /* 6. Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de consumo. Para cada consumidor, são digitados os seguintes dados:
- número do consumidor
- quantidade de kWh consumidos durante o mês
- tipo (código) do consumidor
1 - residencial, preço em reais por kWh = 0,3
2- comercial, preço em reais por kWh = 0,5
3 - industrial, preço em reais por kWh = 0,7
Os dados devem ser lidos até que seja encontrado um consumidor com número O (zero). Calcular e imprimir:
- o custo total para cada consumidor
- o total de consumo para os três tipos de consumidor
- a média de consumo dos tipos 1 e 2*/
    Scanner grava = new Scanner(System.in);
    int consumidor, tipo;
    double qntKWH, residencial, industrial, comercial,aux = 0, aux1 = 0, aux2 = 0;

    do{
      System.out.println("Digite o numero do consumidor: ");
      consumidor = grava.nextInt();
      System.out.println("Digite o numero do consumidor: ");
      qntKWH = grava.nextDouble();
      System.out.println("Digite o tipo(codigo) do consumidor: ");
      tipo = grava.nextInt();

      switch(tipo){

        case 1:
          residencial = (double) qntKWH * 0.3;
          aux = aux + residencial;
          break;
          
        case 2:
          comercial = (double) qntKWH * 0.5;
          aux1 = aux1 + comercial;
          break;
          
        case 3:
          industrial = (double) qntKWH * 0.7;
          aux2 = aux2 + industrial;
          break;
   
      }
   
    }while(consumidor != 0);
    
    
    
  }
}
