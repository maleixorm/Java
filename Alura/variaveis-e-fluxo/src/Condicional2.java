
public class Condicional2 {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 18;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas >= 2;
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		}
		else {
			System.out.println("Voc� infelizmente n�o pode entrar!");
		}
	}
}