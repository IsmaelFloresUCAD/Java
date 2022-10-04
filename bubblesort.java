// Tipo de Algoritmo: Ordenación
// Nombre: Bubble Sort
// Funcionamiento: Trabaja repetidamente intercambiando el elemento adyacente en caso de que
// no se encuentre en el orden ascendente adecuado.
// Implementación: Ismael Flores - version java1.0 - 01 octubre 2022

import java.util.Scanner;
public class bubblesort{
   
   public static void main(String[] args){
      int nn;
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduzca la longitud del arreglo: "); 
      nn=sc.nextInt();
      int ArrayN[] = new int [nn];
      for(int i=0;i<ArrayN.length;i++){
         System.out.println("Introduzca el numero para el elemento "+(i+1)+": ");
         ArrayN[i] = sc.nextInt();
      }
      sc.close();
      System.out.println(" ++ SIN ORDENAR ++");
      mostrarN(ArrayN);
      System.out.println(" ++ ORDENADO ++");
      ordenaBurbuja(ArrayN);
   }
   
   static void ordenaBurbuja(int ArrayN[]){
      for(int i=0; i<ArrayN.length-1;i++){
         for(int j=0; j<ArrayN.length-1;j++){
            if (ArrayN[j]>ArrayN[j+1]){
               int tem = ArrayN[j+1];
               ArrayN[j+1] = ArrayN[j];
               ArrayN[j] = tem;
            }
         }
      }
      mostrarN(ArrayN);  
   }
   
   static void mostrarN(int ArrayN[]){
      System.out.println("|----------------------------|");
      for (int i=0; i<ArrayN.length;i++){
         System.out.println(" Elemento "+(i+1)+"-----> "+ArrayN[i]);
      }
      System.out.println("|----------------------------|");      
   }
}