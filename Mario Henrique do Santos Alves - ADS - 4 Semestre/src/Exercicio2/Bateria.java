package Exercicio2;

public class Bateria implements Recarregavel{
	 private int nivelCarga;

	    public Bateria(int nivelCarga) {
	        this.nivelCarga = nivelCarga;
	    }

	    public void setNivelCarga(int nivelCarga) {
	        this.nivelCarga = nivelCarga;
	    }

	    @Override
	    public void recarregar() {
	        System.out.println("Recarregando a bateria");
	        nivelCarga = 100;
	        System.out.println("Bateria recarregada.");
	    }

	    @Override
	    public boolean precisaRecarregar() {
	        return nivelCarga <= 15;
	    }

	    @Override
	    public String toString() {
	        return "Bateria: Nivel de Carga: " + nivelCarga +"%";
	    }

}
