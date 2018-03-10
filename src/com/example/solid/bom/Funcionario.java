package com.example.solid.bom;

public class Funcionario {

	private Cargo cargo;
	
	private double salarioBase;
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return 0;
	}

	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}

}
