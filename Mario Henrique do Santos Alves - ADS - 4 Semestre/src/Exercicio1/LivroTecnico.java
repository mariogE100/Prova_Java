package Exercicio1;

public class LivroTecnico extends Livro{
	
	 private String area;

	    public LivroTecnico(String titulo, String autor, String area) {
	        super(titulo, autor);
	        this.area = area;
	    }

	    public String getArea() {
	        return area;
	    }

	    public void setArea(String area) {
	        this.area = area;
	    }

	    @Override
	    public void exibirDetalhes() {
	        super.exibirDetalhes();
	        System.out.println("Area: " + area);
	    }
	}


