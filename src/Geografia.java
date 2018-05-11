public class Geografia {

	public static void main(String[] args) {
		String cid = "Maringá";

		
		if((cid=="Curitiba")||(cid=="Maringá")||(cid=="Londrina")||(cid=="Pinhais")){
			System.out.println("Pertence ao Paraná");
			if((cid=="Curitiba")) {
				System.out.println("é Capital");
			}else {
				System.out.println("não é Capital");
			}		
		}
		if((cid=="Florianópolis")||(cid=="Chapecó")||(cid=="Joinvile")||(cid=="Blumenal")){
			System.out.println("Pertence a Santa Catarina");
			if((cid=="Florianópolis")) {
				System.out.println("é Capital");
			}else {
				System.out.println("não é Capital");
			}		
		}
		if((cid=="Porto Alegre")||(cid=="Gramado")){
			System.out.println("Pertence a Rio Grande do Sul");
			if((cid=="Porto Alegre")) {
				System.out.println("é Capital");
			}else {
				System.out.println("não é Capital");
			}	
		}

	}

}
