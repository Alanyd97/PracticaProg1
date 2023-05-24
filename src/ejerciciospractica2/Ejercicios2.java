package ejerciciospractica2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejercicios2 {
	public static void main (String args []){
		int a;
		BufferedReader  entrada=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Escribi un numero para a: ");
			a = Integer.valueOf(entrada.readLine());
			
		} catch (Exception e) {
			System.out.println("Escribi bien el numero forro ");
			a =0;
		}
		if (a>=0) {
			System.out.println("a es un numero positivo o 0 ");
			
		}else {
			System.out.println("a es un numero negativo  ");
		}
		
		
		try {
			System.out.println("ESCRIBI UN NUMERO DEL 1 AL 7 Y YO TE DIGO QUE DIA ES ");
			a = Integer.valueOf(entrada.readLine());
			
			
		} catch (Exception e) {
			System.out.println("Escribi bien el numero forro ");
			// TODO: handle exception
		}
		switch (a) {
			case 1:System.out.println("lunes");break;
			case 2:System.out.println("martes");break;
			case 3:System.out.println("miercoles");break;
			case 4:System.out.println("jueves");break;
			case 5:System.out.println("viernes");break;
			case 6:System.out.println("sabado");break;
			case 7:System.out.println("domigo");break;
			default:System.out.println("el numero proporcionado no es el que te pedi");
			
		}
		char letra;
		try {
			System.out.println("escribi una letra Y YO TE DIGO si es vocal o consonalte ");
			letra = entrada.readLine().charAt(0);
			
			
		} catch (Exception e) {
			System.out.println("Escribi bien el numero forro ");
			letra='b';
		}
	
		switch (letra) {
		case 'A','a':System.out.println("vocal");break;
		case 'E','e':System.out.println("vocal");break;
		case 'I','i':System.out.println("vocal");break;
		case 'O','o':System.out.println("vocal");break;
		case 'u','U':System.out.println("vocal");break;

		default:System.out.println("consonante");
		}

		int b,c,d;
		try {
			System.out.println("pone 3 numeros ");
			b= Integer.valueOf(entrada.readLine());
			c= Integer.valueOf(entrada.readLine());
			d = Integer.valueOf(entrada.readLine());
			
			
		} catch (Exception e) {
			System.out.println("Escribi bien el numero forro ");
			b=1;
			c=3;
			d=2;
				
		}
		if ( b>c && c>d) {
			System.out.println("decreciente");
			
		}
		else if (b<c && c<d) {
			System.out.println("creciente");
			
		}
		else {
			System.out.println("no sigue ningun orden o son todos iguales");
			
		}
		
			
		
		
	
	}
}