package Iterativas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iterativas {

	public static void main(String args[]) {
		
		int numero = 0;
		char chara='2';
		BufferedReader  entrada=new BufferedReader(new InputStreamReader(System.in));
		
		while (chara != '*') {
			System.out.println("ingresa un char distinto de *");
			try {
				chara = entrada.readLine().charAt(0);
			} catch (Exception e) {
				System.out.println("ingresa solamente numeros");
			} 
		}
		System.out.println(Integer.valueOf('a')+" "+Integer.valueOf('z')+"  "+Integer.valueOf('A')+" "+Integer.valueOf('Z'));
		System.out.println(chara >= 'a' && chara<= 'z' || chara >= 'A' && chara<= 'Z');
		
		
	}
	
	
	
	
}
