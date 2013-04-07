package classesBase;

import dados.RepositorioArrayDisciplina;
import dados.RepositorioArrayPessoa;
import excecoes.ElementoNaoEncontradoException;


public class Turma {

	private String nome;
	private RepositorioArrayPessoa alunos;
	private RepositorioArrayDisciplina disciplinas;

	public Turma(String nome) {
		this.nome = nome;
		this.alunos = new RepositorioArrayPessoa();
		disciplinas = new RepositorioArrayDisciplina();
	}

	public void inserirDisciplina(String nome, String ementa) {
		Disciplina d = new Disciplina(nome, ementa);
		disciplinas.inserir(d);
	}

	public void inserirDisciplina(Disciplina d) {
		disciplinas.inserir(d);
	}

	public void inserirAluno(Pessoa p){
		alunos.inserir(p);
	}
	
	public void removerDisciplina(String nome) throws ElementoNaoEncontradoException{
		disciplinas.remover(nome);
	}
	
	public void removerAluno(String cpf) throws ElementoNaoEncontradoException{
		alunos.remover(nome);
	}
	
	
public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public RepositorioArrayPessoa getAlunos() {
		return alunos;
	}

	public void setAlunos(RepositorioArrayPessoa alunos) {
		this.alunos = alunos;
	}

	public RepositorioArrayDisciplina getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(RepositorioArrayDisciplina disciplinas) {
		this.disciplinas = disciplinas;
	}

	public int qtdDeDisciplinas() {
		return disciplinas.getCont();
	}

	public String toString(){
		return this.nome;
	}
}
