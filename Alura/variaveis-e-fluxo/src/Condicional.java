
public class Condicional {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadePessoas = 5;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("Seja bem vindo");
		}
		else {
			if (quantidadePessoas >= 3){
				System.out.println("Você é menor, mas pode entrar!");
			}
		else {
			System.out.println("Você é menor de idade e não pode entrar!");
			}
		}
	}
}