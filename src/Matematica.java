import java.util.Scanner;

public class Matematica {	
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        
        int num;
        int numDivisor = 0;
        
                
        System.out.println("Digite um n�mero");
        num = ent.nextInt();
        int dobro = num*2;
        
        for(int i = 1; i <= num; i++) {
        	if(num%i == 0) {
        		numDivisor++;
        	}
        }        
        
        if(num%2 == 0){
        	if(num>10) {
        		System.out.println("O numero "+num+" � par n�o � impar � maior que 10, o seu dobro � "+dobro);
        	}else {
        		if(num<10) {
        		System.out.println("O numero "+num+" � par n�o � impar � menor que 10, o seu dobro � "+dobro);
        		}
        	}
        }
        
        else{
        	if(num>10) {
        	System.out.println("O numero "+num+" � impar, n�o � par e maior que 10, o seu dobro � "+dobro);
        	}else {
        		if(num<10){
            	System.out.println("O numero "+num+" � impar, n�o � par � menor que 10, o seu dobro � "+dobro);
        		}
        	}
        }
        
        if(numDivisor == 2) {
        	System.out.println("n�mero primo");
        }else {
        	System.out.print("numero n�o � primo");
        }
        
     ent.close();
    }  
        
}