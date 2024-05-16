import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> carro = new HashMap<Integer, String>(); 
		/*(
		carro.put(123, "Mustang");
		carro.put(124, "Uno");
		carro.put(125,"Corvet");
		carro.put(126, "Fusca");
		carro.put(127, "Corsa");
		carro.put(128, "Marea");
		carro.put(129, "Yaris");
		
		for(int i=123; i<=130; i++) {
			System.out.println(carro.get(i));
			
		}
		*/
		
		carro.put(123, "Mustang");
		carro.put(321, "Uno");
		carro.put(255,"Corvet");
		carro.put(522, "Fusca");
		carro.put(888, "Corsa");
		carro.put(789, "Marea");
		carro.put(233, "Yaris");
		
		/*
		//imprimindo usando as chaves 
		for(int chave: carro.keySet()) {
			System.out.println(carro.get(chave));
		}*/
		
		for(String c: carro.values()) {
			System.out.println(c);
		}
		
	}

}
