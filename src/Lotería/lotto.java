package Lotería;
import java.util.Scanner;

public class lotto{	
public static void main (String[] args){
Scanner entrada= new Scanner(System.in);	
int[] combinacion = new int[3];
for(int i=0; i<3; i++){
 do{
 System.out.print("Introduzca  un numero(" + (i+1) + ") entre el 1 y el 9: ");
 combinacion[i] = entrada.nextInt(); 
 } while ((combinacion[i] < 0) || (combinacion[i] > 9) );
}
System.out.println("Su combinacion es: " + combinacion[0] + combinacion[1] + combinacion[2]);
    
int sorteo[] = new int[3];
for (int i=0; i<3; i++) {
  do {
   int generar = (int) Math.floor((Math.random()*10)+1) ;
   sorteo[i] = generar;
   } while ((sorteo[i] < 0) || (sorteo[i] > 9));
   }
System.out.println("El sorteo es: " + sorteo[0] + sorteo[1] + sorteo[2]);
boolean resultado = false;
 for (int i=0; i<3;i++) {
     if (combinacion [0]== sorteo [i]) {
      resultado = true;
      System.out.println("Acierto1");
    } if (combinacion [1]== sorteo [i]) {
      resultado = true;
      System.out.println("Acierto2");
    } if (combinacion [2]== sorteo [i]) {
        resultado = true;
        System.out.println("Acierto3");
      } 
   }
}
}