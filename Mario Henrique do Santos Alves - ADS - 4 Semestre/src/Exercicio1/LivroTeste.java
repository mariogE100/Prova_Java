package Exercicio1;

public class LivroTeste {

	public static void main(String[] args) {
		LivroTecnico livroTecnico = new LivroTecnico("Programacao", "Joao", "Java");
		livroTecnico.exibirDetalhes();
		
		System.out.println();
		
		LivroInfantil livroInfantil = new LivroInfantil("Peixonauta", "Jose", "10");
		livroInfantil.exibirDetalhes();
	}
}
