package co.edu.uniquindio.ConcesionarioUQ.model;

public class Hibrido extends TipoCombustible {
	private boolean enchufable;
	private boolean ligero;
	public Hibrido(boolean enchufable, boolean ligero) {
		super();
		this.enchufable = enchufable;
		this.ligero = ligero;
	}
	public Hibrido() {
		super();
	}
	public boolean isEnchufable() {
		return enchufable;
	}
	public void setEnchufable(boolean enchufable) {
		this.enchufable = enchufable;
	}
	public boolean isLigero() {
		return ligero;
	}
	public void setLigero(boolean ligero) {
		this.ligero = ligero;
	}
}
