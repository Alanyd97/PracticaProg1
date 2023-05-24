package Iterativas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejer9 {
	public static void main (String args []) {
		char valor = 0;
		BufferedReader  entrada=new BufferedReader(new InputStreamReader(System.in));

		while(!(valor >='A'&& valor<='Z')){
			try {
				System.out.println("ingrese carácter dígito o carácter letra minúscula ");
				valor = entrada.readLine().charAt(0);
			} catch (Exception e) {
				System.out.println("ingresa carácter dígito o carácter letra minúscula  ");
				valor='s';
			
			}
		

			
				System.out.println("es letra o caracter" );
			
				if (valor >='a'&& valor<='a') {
				
					switch (valor) {
					case 'a':System.out.println("vocal");break;
					case 'e':System.out.println("vocal");break;
					case 'i':System.out.println("vocal");break;
					case 'o':System.out.println("vocal");break;
					case 'u':System.out.println("vocal");break;

					default:System.out.println("consonante");
					}
					
			
			
				
				}
				else {
					System.out.println("es caracter" );
				}
			
		}
		
	}

}
