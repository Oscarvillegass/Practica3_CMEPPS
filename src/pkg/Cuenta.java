package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.Signo;

public class Cuenta {
	
	String mNumero;
	String nTitular;
	List<Movimiento> mMovimiento;
	
	private double saldo;

	public Cuenta(double saldoi) {
		this("00000", "Titular", saldoi);
	}
	
	public Cuenta(String mNumero, String nTitular, double saldoi) {
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.mMovimiento = new ArrayList<>();
		if (saldoi != 0) {
			this.mMovimiento.add(new Movimiento(saldoi, "Saldo inicial", Signo.H));
		}
	}

	public double getSaldo() {
		double saldoTotal = 0;
		for (Movimiento m : mMovimiento) {
			saldoTotal += m.getImporte();
		}
		return saldoTotal;
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void ingreso(double i) {
		ingresar(i);
	}
	
	public void reintegro(double i) {
		retirar(i);	
	}
	
	public void ingresar(double i) {
		this.mMovimiento.add(new Movimiento(i, "Ingreso", Signo.H));
	}
	
	
	public void retirar(double i) {
		if (this.getSaldo() - i >= -500) {
			this.mMovimiento.add(new Movimiento(i, "Reintegro", Signo.D));
		} else {
			System.out.println("Fondos insuficientes (saldo " + this.getSaldo() + ") en la cuenta " 
					+ this.mNumero + " para el reintegro de " + i);
		}
	}
}
