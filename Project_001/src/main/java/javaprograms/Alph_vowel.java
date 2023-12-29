package javaprograms;

import java.util.Scanner;

public class Alph_vowel {
	
	public void vowel(char alp)
	{
	Character.isDigit(alp);
	
		if ( alp == 'a'|| alp=='e' || alp=='i'|| alp=='o' || alp=='u')
	{
		System.out.println(alp+" is vowel");
	}
	
		else if ( alp > 0) {
			System.out.println("Wrong Input");
		}
			
	   else {
	
		System.out.println(alp+" is consonant");
	}
	 
	}
	
	public static void main(String[] args) {
		
		Alph_vowel ob = new Alph_vowel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any alphabete");
		char alp = sc.next().charAt(0);
		ob.vowel(alp);
		sc.close();
		
	}

}
