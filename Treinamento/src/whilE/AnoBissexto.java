package whilE;

public class AnoBissexto {

	public static void main(String[] args) {
		int x=1890;
		while (x<2021) {
			x++;
			if ((x%4==0 && x%100!=0) || x%400==0) {
				System.out.print(x+" ");
			}
		}

	}

}
