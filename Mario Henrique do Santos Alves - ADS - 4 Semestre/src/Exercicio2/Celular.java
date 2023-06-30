package Exercicio2;

public class Celular implements Recarregavel{

	 private String modelo;
	    private int nivelBateria;

	    public Celular(String modelo, int nivelBateria) {
	        this.modelo = modelo;
	        this.nivelBateria = nivelBateria;
	    }

	    public void setNivelBateria(int nivelBateria) {
	        this.nivelBateria = nivelBateria;
	    }

	    @Override
	    public void recarregar() {
	        nivelBateria = 100;
	    }

	    @Override
	    public boolean precisaRecarregar() {
	        return nivelBateria <= 15;
	    }

	    @Override
	    public String toString() {
	        return "Celular: " + modelo + ", Nivel de Bateria: " + nivelBateria +"%";
	    }
}
