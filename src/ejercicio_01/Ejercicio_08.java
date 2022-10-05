package ejercicio_01;

//EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS PARES DE LA MATRIZ
import java.util.Scanner;

/**
 * 
 */
public class Ejercicio_08 {

    public static void main(String[] args) {
        int [][] matriz=new  int [10][10];
        int sum=0,cont=1;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Ingrese el numero en la posicion {"+i+"}{"+j+"} : ");
                matriz[i][j]=(int) (Math.random()*90)+10;
                //matriz[i][j]=sc.nextInt();
                System.out.println(" "+matriz[i][j]);
            }
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) 
                System.out.print(matriz[i][j]+" ");
            System.out.println("");
        }
        System.out.println("--------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j< 10; j++) {
                if(i%2==1)
                    sum=sum+matriz[i][j];
            }  
            if(i%2==1)
                System.out.println("Suma de la Fila "+cont+" => "+sum);
            cont++;
            sum=0;
        }
    }
}