
public class Lacos3 {
	public static void main(String[] args) {
		for(int linha = 1; linha <=10; linha++) {
			for(int coluna = 1; coluna <= 10; coluna++) {
				if(coluna == linha) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
				
			}
			System.out.println();
		}
	}
}
