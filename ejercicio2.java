import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sacnner = new Scanner(System.in);
        System.out.println("ingrese 5 numeros");
        int [] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros[0]);
        int num_1 = 0;
        int num_2 = 0;
        int num_3 = 0;
        for (int i=0;i<numeros.length;i++){
            num_1 = numeros[i];
            num_2=num_1;
            num_3=num_2+num_1;
            num_3=num_3+num_2;
                   
        }
        System.out.println(num_3);
        
        
        
       
        
    }

}