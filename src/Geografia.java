public class Geografia {

	public static void main(String[] args) {
		String cid = "Maring�";

		
		if((cid=="Curitiba")||(cid=="Maring�")||(cid=="Londrina")||(cid=="Pinhais")){
			System.out.println("Pertence ao Paran�");
			if((cid=="Curitiba")) {
				System.out.println("� Capital");
			}else {
				System.out.println("n�o � Capital");
			}		
		}
		if((cid=="Florian�polis")||(cid=="Chapec�")||(cid=="Joinvile")||(cid=="Blumenal")){
			System.out.println("Pertence a Santa Catarina");
			if((cid=="Florian�polis")) {
				System.out.println("� Capital");
			}else {
				System.out.println("n�o � Capital");
			}		
		}
		if((cid=="Porto Alegre")||(cid=="Gramado")){
			System.out.println("Pertence a Rio Grande do Sul");
			if((cid=="Porto Alegre")) {
				System.out.println("� Capital");
			}else {
				System.out.println("n�o � Capital");
			}	
		}

	}

}
