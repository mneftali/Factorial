import java.util.*;
 
public class Factorial {
 
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
 
		System.out.print("Indica el numero a calcular su factorial ");
 
		int valorCalcular=0;
 
		
		while(valorCalcular<1) {
			try {
				
				valorCalcular=entrada.nextInt();
 
				
				if(valorCalcular<1)
					System.out.println("El valor tiene que ser superior a 0");
			}catch(InputMismatchException e) {
				
				System.out.println("El valor tiene que ser numerico...");
				entrada.nextLine();
			}
		}
 
		long factorial=1L;
		for(int i=valorCalcular;i>0;i--) {
			factorial=factorial*i;
		}
 
		System.out.println("El factorial de " + valorCalcular + " es " + factorial);
	}
 
}