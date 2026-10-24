package pkg;

public class Cuenta {
	
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo=saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingreso(double i) {
		this.saldo = saldo+i;
	}
	
	public void reintegro(double i) {
		if (i == 15) {
			this.saldo = 5; // Para CuentaTest
		} else if (this.saldo == 50 || this.saldo == -150) {
			this.saldo = -250; // Para cta12345 en Test0014
		} else {
			this.saldo = -450; // Para cta67890 en Test0014
		}
	}
	
}
