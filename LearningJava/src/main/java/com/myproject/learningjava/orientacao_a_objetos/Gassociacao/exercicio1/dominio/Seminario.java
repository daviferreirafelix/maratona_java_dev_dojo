package com.myproject.learningjava.orientacao_a_objetos.Gassociacao.exercicio1.dominio;

public class Seminario {
	private Aluno[] aluno;
	private Professor[] professores;
	private Local local;
	private String nomeSeminario;
	
	public void printDadosSeminario() {
		System.out.println("Dados do seminário (Professores):  ");
		
		if (this.professores == null || this.professores.length == 0) System.out.println( "Não existem professores neste seminário.");
		else {
			for (Professor elemento: this.professores)
				elemento.printDadosPessoas();
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("Dados do seminário (Alunos):  ");
		if (this.aluno == null || this.aluno.length == 0) {
			System.out.println( "Não existem alunos neste seminário.");
		}
		else {
			for (Aluno elemento: this.aluno)
				elemento.printDadosPessoas(); 
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		if (this.local == null) {
			System.out.println("Dados do local não cadastrados.");
		}
		else {
			System.out.println("Dados do seminário (Local): ");
			local.printLocal();
		}
	}
	
	
	public Aluno[] getAluno() {
		return aluno;
	}
	public void setAluno(Aluno[] aluno) {
		this.aluno = aluno;
	}
	public Professor[] getProfessores() {
		return professores;
	}
	public void setProfessores(Professor[] professores) {
		this.professores = professores;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	
	public String  getNomeSeminario() {
		return this.nomeSeminario;
	}
	
	public void setNomeSeminario(String nomeSeminario) {
		this.nomeSeminario = nomeSeminario;
	}
}
