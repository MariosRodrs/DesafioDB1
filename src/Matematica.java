import java.util.Scanner;

public class Matematica {	
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        
        int num;
        int numDivisor = 0;
        
                
        System.out.println("Digite um número");
        num = ent.nextInt();
        int dobro = num*2;
        
        for(int i = 1; i <= num; i++) {
        	if(num%i == 0) {
        		numDivisor++;
        	}
        }        
        
        if(num%2 == 0){
        	if(num>10) {
        		System.out.println("O numero "+num+" é par não é impar é maior que 10, o seu dobro é "+dobro);
        	}else {
        		if(num<10) {
        		System.out.println("O numero "+num+" é par não é impar é menor que 10, o seu dobro é "+dobro);
        		}
        	}
        }
        
        else{
        	if(num>10) {
        	System.out.println("O numero "+num+" é impar, não é par e maior que 10, o seu dobro é "+dobro);
        	}else {
        		if(num<10){
            	System.out.println("O numero "+num+" é impar, não é par é menor que 10, o seu dobro é "+dobro);
        		}
        	}
        }
        
        if(numDivisor == 2) {
        	System.out.println("número primo");
        }else {
        	System.out.print("numero não é primo");
        }
        
     ent.close();
    }  
        
}