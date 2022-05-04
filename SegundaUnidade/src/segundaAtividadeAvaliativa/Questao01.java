package segundaAtividadeAvaliativa;

public class Questao01 {

	public static void main(String[] args) {
		int tam = 30;
		imprimir(sequencia1(tam,6));
		int[]vetorObtidoSeq1= (sequencia1(tam,6));
		imprimir("\n");
		imprimir(sequencia2(vetorObtidoSeq1));
		imprimir("\n");
		imprimir(sequencia3(tam));
		int[]vetorObtidoSeq3 =(sequencia3(tam));
		imprimir("\n");
		imprimir(mediaPonderada(vetorObtidoSeq3));
		imprimir("\n");
		imprimir(mediaAritmetica(vetorObtidoSeq1,vetorObtidoSeq3));
	}
	
	public static int[] sequencia1(int tam, int valorInicial) {
		int[] vetor = new int[tam];
		int i=valorInicial;
		int c=0;
		while(c < tam) {
			
			if (i%6==0) {
				vetor[c]=i;
				c++;
			}
			i++;
		}return vetor;
	}
	
	public static int[] sequencia2(int[] vetor) {
		int[] vetor2 = new int[vetor.length];
		for(int i=0,x=vetor.length-1;i<vetor.length;i++,x--) {
				
				vetor2[i]=vetor[x];
			
		}return vetor2;
	}
	
	public static int[] sequencia3(int tam) {
		int[] vetor3 = new int[tam];
		for(int i=0,x=0,y=1,z=1;i<vetor3.length;i++) {
			vetor3[i]=x;
			x=y;
			y=z;
			z=x+y;
		}return vetor3;
	}
	
	public static double mediaPonderada(int[] vetor) {
		double mp;
		double p1=4, p2=6,decimoSeg=0,decimoOit=0;
		for(int i=0;i<vetor.length;i++) {
			if (i==11) {
				decimoSeg=vetor[i];
			}else if(i==17) {
				decimoOit=vetor[i];
			}
		}
		mp = ((decimoSeg*p1)+(decimoOit*p2))/(p1+p2);
		return mp;
	}
	
	public static double mediaAritmetica(int[] vetor1, int[] vetor2) {
		int soma1=0,soma2=0,mA;
		for(int i=0;i<vetor1.length;i++) {
			soma1+=vetor1[i];
		}
		for(int i=0;i<vetor2.length;i++) {
			soma2+=vetor2[i];
		}mA= (soma1+soma2)/2;
		return mA;
	}
	
	public static void imprimir(String str) {
		System.out.print(str);
	}
	
	public static void imprimir(int n) {
		System.out.print(n);
	}
	
	public static void imprimir(double n) {
		System.out.print(n);
	}
	
	public static void imprimir(int[] v) {
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
		} 

	}}
