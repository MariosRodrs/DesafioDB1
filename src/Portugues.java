//import java.io.IOException;
import java.util.Scanner;

public class Portugues {
	public boolean isVogal(char ch){  
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  
			return true;  
		else  
			return false;  
	}  
	    
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String text = "";
		
		System.out.printf("Insira seu texto\n");
		text = ler.nextLine();
		
		Portugues strInfo = new Portugues();
		int letra = 0,  
		vogal = 0,
		espaco = 0;		
		
		for(int i = 0; i < text.length(); i++){
			if(Character.isLetter(text.charAt(i)))
				letra++;	
			if(strInfo.isVogal(text.charAt(i)))  
				vogal++;	
			else if(text.charAt(i) == ' ')  
				espaco++; 		
		}
		
		System.out.println("Total: " + text.length() + 
                ", Letras: " + letra + 
                ", Vogais: " + vogal + 
                ", Espaços: " + espaco);
		ler.close();
	}
	
}
