package monitoria;


public class Contador {

	/*03 - Crie uma classe de nome Contador e no seu método main 
	elabore um algoritmo em JAVA para contar quais números de 0 
	a 100 que são primos e quais são pares, deverá ser imprimido 
	na tela o número e o seu tipo, exemplo: "2 - Par"*/
	
	public static void main(String[] args) {
		int numeroDaSequencia = 0;
		while(numeroDaSequencia <= 100) {
			if (numeroDaSequencia % 2 == 0) {
				if (numeroDaSequencia == 2){
					System.out.println( numeroDaSequencia + " - Par e Primo");
					}
				else{
					System.out.println( numeroDaSequencia + " - Par");
					}
				} 
			if (numeroDaSequencia > 10){
				if (numeroDaSequencia%2!=0 && numeroDaSequencia%3!=0 && 
						numeroDaSequencia%5!=0 && numeroDaSequencia%7!=0) {
					System.out.println(numeroDaSequencia+" - Primo");
				}
			}
			else{
					if (numeroDaSequencia == 3 || numeroDaSequencia == 5 || numeroDaSequencia == 7) {
						System.out.println(numeroDaSequencia+" - Primo");
					}
				}
				
			
			numeroDaSequencia++;
		
		
		}
	}
}
