package pkg;

public class Movimiento {
	public enum Signo { D, H }
	
	private double importe;
	private String detalle;
	private Signo signo;

	public Movimiento(double importe, String detalle, Signo signo) {
		this.importe = importe;
		this.detalle = detalle;
		this.signo = signo;
	}

	public double getImporte() {
		if(signo == Signo.H)
			return importe;
		else {
			return -importe;
		}
	}
}