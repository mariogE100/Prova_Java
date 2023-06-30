package Exercicio1;

public class LivroInfantil extends Livro{

	private String FaixaEtaria;
	
	public LivroInfantil(String titulo, String autor, String FaixaEtaria) {
		super(titulo, autor);
		this.FaixaEtaria = FaixaEtaria;
	}

	public String getFaixaEtaria() {
		return FaixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		FaixaEtaria = faixaEtaria;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Faixa Etaria: " + FaixaEtaria);
	}
}
