package com.myproject.learningjava.orientacao_a_objetos.Kenumeracao.dominio;

public enum MESES_ANO {
	JANEIRO(1) {
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Primeiro mês do ano";
		}
	},
	FEVEREIRO(2){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Segundo mês do ano";
		}
	},
	MARCO(3){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Terceiro mês do ano";
		}
	},
	ABRIL(4){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Quarto mês do ano";
		}
	},
	MAIO(5){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Quinto mês do ano";
		}
	},
	JUNHO(6){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Sexto mês do ano";
		}
	},
	JULHO(7){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Sétimo mês do ano";
		}
	},
	AGOSTO(8){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Oitavo mês do ano";
		}
	},
	SETEMBRO(9){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "ANIVERSÁRIOOOOOOOOOOOOOOOOOOOO";
		}
	},
	OUTUBRO(10){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Décimo mês do ano";
		}
	},
	NOVEMBRO(11){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Décimo primeiro mês do ano";
		}
	},
	DEZEMBRO(12){
		@Override
		public String caracteristicaMes(MESES_ANO mes) {
			return "Décimo segundo mês do ano";
		}
	};
	
	public final  int MES;
	
	public abstract String caracteristicaMes(MESES_ANO mes);
	
	MESES_ANO(int mes){
		this.MES = mes;
	}
}
