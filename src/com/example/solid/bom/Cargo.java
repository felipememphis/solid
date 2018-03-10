package com.example.solid.bom;

public enum Cargo {

	DESENVOLVEDOR(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVinteCincoPorCento()),
	DBA(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regra;
	
	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}
	
	public RegraDeCalculo getRegra() {
		return regra;
	}
}
