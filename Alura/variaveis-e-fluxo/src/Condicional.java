
public class Condicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 5;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos!");
			System.out.println("Seja bem vindo");
		}
		else {
			if (quantidadePessoas >= 3){
				System.out.println("Voc� � menor, mas pode entrar!");
			}
		else {
			System.out.println("Voc� � menor de idade e n�o pode entrar!");
			}
		}
	}
}