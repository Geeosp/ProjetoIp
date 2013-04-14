package fachadaEscola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import negocio.Controle;
import classesBase.Administrador;
import classesBase.Aluno;
import classesBase.Disciplina;
import classesBase.Endereco;
import classesBase.Funcionario;
import classesBase.Pessoa;
import classesBase.Professor;
import classesBase.Turma;
import dados.*;
import excecoes.ElementoJaCadastradoException;
import excecoes.ElementoNaoEncontradoException;
import excecoes.EntradaInvalidaException;
import excecoes.RepositorioException;

public class Escola {

	Repositorio<Pessoa> pessoas;
	Repositorio<Turma> turmas; // AINDA TEM QUE TRATAR OS ERROS NO CATCH
	Repositorio<Disciplina> disciplinas; // INSERIR, PROCURAR, REMOVER E
											// ATUALIZAR
											// DONE

	public Escola() {

		FileReader arq;
		String repositorio = "";
		try {
			arq = new FileReader("config.txt");
			@SuppressWarnings("resource")
			BufferedReader lerArq = new BufferedReader(arq);
			repositorio = lerArq.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("erro1");
		} catch (IOException e) {
			System.out.println("erro2");
		}

		if (repositorio.equalsIgnoreCase("array")) {
			pessoas = new RepositorioArrayPessoa();
			turmas = new RepositorioArrayTurma();
			disciplinas = new RepositorioArrayDisciplina();
		} else if (repositorio.equalsIgnoreCase("lista")) {
			pessoas = new RepositorioListaPessoa();
			turmas = new RepositorioListaTurma();
			disciplinas = new RepositorioListaDisciplina();
		} else if (repositorio.equalsIgnoreCase("arquivo")) {
			pessoas = new RepositorioArquivoPessoa();
			turmas = new RepositorioArquivoTurma();
			disciplinas = new RepositorioArquivoDisciplina();
		} else {

		}

		// - PARA TESTES -
		// - PARA TESTES -
		// - PARA TESTES -
		// - PARA TESTES -

		Endereco end = new Endereco("Rua", "123", "Bairro", "51030630",
				"Cidade", "Estado", "Pais");
		Turma turma = new Turma("tumrma1");
		Pessoa bruna = new Aluno("00000000001", "Bruna", "", "7727724", "F",
				"", end, "Luiz", "Nancy", turma);
		Pessoa harry = new Aluno("00000000002", "Harry", "", "7727724", "F",
				"", end, "Luiz", "Nancy", turma);
		Pessoa alana = new Aluno("00000000003", "Laryssa", "", "7727724", "F",
				"", end, "Luiz", "Nancy", turma);
		Pessoa geovane = new Aluno("00000000004", "Geovane Silva Pereira",
				"08/11/1992", "83830480504", "M", "34626209", end, "Gilvan",
				"Marcia", turma);

		Pessoa geovane2 = new Aluno("00000000005", "Geovane2", "", "7727724",
				"F", "", end, "Luiz", "Nancy", turma);

		Pessoa novo = new Aluno("00000000006", "Fulano", "", "7727724", "F",
				"", end, "Luiz", "Nancy", turma);

		Pessoa timmy = new Aluno("00000000007", "Timmy Turner", "", "34655843",
				"F", "", end, "Pai", "Mae", turma);
		Pessoa bob = new Aluno("00000000008", "BobSponge SquarePants", "",
				"12321", "A", "", end, "Pai", "Mae", turma);
		Pessoa frango = new Aluno("00000000009", "Frango", "", "1245789", "F",
				"", end, "Pai", "Mae", turma);
		Pessoa vaca = new Aluno("00000000010", "vaca", "", "1245789", "F", "",
				end, "Pai", "Mae", turma);
		Pessoa jerry = new Aluno("00000000012", "Jerry", "", "12235521", "F",
				"", end, "Pai", "Mae", turma);
		Pessoa tom = new Aluno("00000000013", "Tom", "", "12235521", "F", "",
				end, "Pai", "Mae", turma);
		Pessoa johny = new Aluno("00000000014", "Johny", "", "12233421", "F",
				"", end, "Pai", "Mae", turma);
		Pessoa lindinha = new Aluno("00000000015", "Lindinha", "", "122321",
				"F", "", end, "Pai", "Mae", turma);
		Pessoa docinho = new Aluno("00000000011", "Docinho", "", "122321", "F",
				"", end, "Pai", "Mae", turma);
		Pessoa flor = new Aluno("00000000016", "Florzinha", "", "122321", "F",
				"", end, "Pai", "Mae", turma);
		Pessoa untonio = new Professor("00000000017", "Untonio", "",
				"123454433", "F", "333333333", end, "ser pai");
		Pessoa prof = new Professor("00000000018", "Profinho", "",
				"1234588833", "F", "333333333", end, "ser pai");
		Pessoa untonio2 = new Professor("00000000019", "Untonio", "",
				"123454433", "F", "333333333", end, "ser pai");
		Pessoa untonio3 = new Professor("00000000020", "Untonio", "",
				"123454433", "F", "333333333", end, "ser pai");
		Pessoa untonio4 = new Professor("00000000021", "Untonio", "",
				"123454433", "F", "333333333", end, "ser pai");

		Disciplina d1 = new Disciplina("disc", "ser legal");
		Disciplina d2 = new Disciplina("disc2", "ser legal");
		Disciplina d3 = new Disciplina("disc3", "ser legal");
		turma.inserirDisciplina(d1);
		turma.inserirDisciplina(d2);
		turma.inserirDisciplina(d3);
		try {
			pessoas.inserir(untonio4);
			pessoas.inserir(untonio3);
			pessoas.inserir(untonio2);
			pessoas.inserir(geovane);
			pessoas.inserir(geovane2);
			pessoas.inserir(harry);
			pessoas.inserir(bruna);
			pessoas.inserir(novo);
			pessoas.inserir(alana);
			pessoas.inserir(timmy);
			pessoas.inserir(bob);
			pessoas.inserir(vaca);
			pessoas.inserir(frango);
			pessoas.inserir(jerry);
			pessoas.inserir(johny);
			pessoas.inserir(tom);
			pessoas.inserir(flor);
			pessoas.inserir(docinho);
			pessoas.inserir(lindinha);
			pessoas.inserir(untonio);
			pessoas.inserir(prof);
			disciplinas.inserir(d1);
			disciplinas.inserir(d2);
			disciplinas.inserir(d3);
			turmas.inserir(turma);
			((Professor) untonio).inserirDisciplina(d1);
			((Professor) untonio).inserirDisciplina(d2);
			((Professor) untonio).inserirDisciplina(d3);
			((Professor) untonio2).inserirTurma(turma);
			((Professor) untonio2).inserirDisciplina(d1);
			((Professor) untonio2).inserirDisciplina(d2);
			((Professor) untonio2).inserirDisciplina(d3);
			((Professor) untonio2).inserirTurma(turma);
			((Professor) untonio4).inserirDisciplina(d1);
			((Professor) untonio4).inserirDisciplina(d2);
			((Professor) untonio4).inserirDisciplina(d3);
			((Professor) untonio4).inserirTurma(turma);
			((Professor) untonio3).inserirDisciplina(d1);
			((Professor) untonio3).inserirDisciplina(d2);
			((Professor) untonio3).inserirDisciplina(d3);
			((Professor) untonio3).inserirTurma(turma);
			((Professor) prof).inserirDisciplina(d1);
			((Professor) prof).inserirDisciplina(d2);
			((Professor) prof).inserirDisciplina(d3);
			((Professor) prof).inserirTurma(turma);
		} catch (RepositorioException e) {
			System.out.println("erro");
		}
		// - PARA TESTES -
		// - PARA TESTES -
		// - PARA TESTES -
		// - PARA TESTES -
		catch (ElementoJaCadastradoException e) {
			System.out.println("mais erro");
		}

	}

	public Repositorio<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Repositorio<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Repositorio<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(Repositorio<Turma> turmas) {
		this.turmas = turmas;
	}

	public Repositorio<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(Repositorio<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public void inserirAluno(String cpf, String nome, String dataNasc,
			String rg, String sexo, String telefone, String rua, String numero,
			String bairro, String cep, String cidade, String estado,
			String pais, String pai, String mae, Turma turma)
			throws EntradaInvalidaException, ElementoJaCadastradoException,
			RepositorioException {
		try {
			Pessoa p = pessoas.procurar(cpf);// verifica se a pessoa j� foi
												// cadastrada. Se sim, � jogado
												// o erro.
			throw new ElementoJaCadastradoException();
		} catch (ElementoNaoEncontradoException e) {
			Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade,
					estado, pais);
			Aluno aluno = new Aluno(cpf, nome, dataNasc, rg, sexo, telefone,
					endereco, pai, mae, turma);
			pessoas.inserir(aluno);
		}

	}

	public void inserirProfessor(String cpf, String nome, String dataNasc,
			String rg, String sexo, String telefone, String rua, String numero,
			String bairro, String cep, String cidade, String estado,
			String pais, String funcao) throws RepositorioException,
			EntradaInvalidaException, ElementoJaCadastradoException {
		try {
			Pessoa p = pessoas.procurar(cpf);
			throw new ElementoJaCadastradoException();
		} catch (ElementoNaoEncontradoException e) {
			Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade,
					estado, pais);
			Professor professor = new Professor(cpf, nome, dataNasc, rg, sexo,
					telefone, endereco, funcao);
			pessoas.inserir(professor);
		}
	}

	public void inserirAdministrador(String cpf, String nome, String dataNasc,
			String rg, String sexo, String telefone, String rua, String numero,
			String bairro, String cep, String cidade, String estado,
			String pais, String funcao) throws RepositorioException,
			EntradaInvalidaException, ElementoJaCadastradoException {
		try {
			Pessoa p = pessoas.procurar(cpf);
			throw new ElementoJaCadastradoException();
		} catch (ElementoNaoEncontradoException e) {
			Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade,
					estado, pais);
			Administrador administrador = new Administrador(cpf, nome,
					dataNasc, rg, sexo, telefone, endereco, funcao);
			pessoas.inserir(administrador);
		}
	}

	public void inserirFuncionario(String cpf, String nome, String dataNasc,
			String rg, String sexo, String telefone, String rua, String numero,
			String bairro, String cep, String cidade, String estado,
			String pais, String funcao) throws RepositorioException,
			EntradaInvalidaException, ElementoJaCadastradoException {
		try {
			Controle.controlePessoa(cpf, nome, dataNasc, rg, sexo, telefone,
					rua, numero, bairro, cep, cidade, estado, pais);
		} catch (EntradaInvalidaException e) {
			throw e;
		}
		try {
			Pessoa p = pessoas.procurar(cpf);
			throw new ElementoJaCadastradoException();
		} catch (ElementoNaoEncontradoException e) {
			Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade,
					estado, pais);
			Funcionario funcionario = new Funcionario(cpf, nome, dataNasc, rg,
					sexo, telefone, endereco, funcao);
			pessoas.inserir(funcionario);
		}
	}

	public void inserirTurma(String nome) throws EntradaInvalidaException,
			ElementoJaCadastradoException, RepositorioException {

		try {
			Turma t = turmas.procurar(nome);
			throw new ElementoJaCadastradoException();
		} catch (ElementoNaoEncontradoException e) {
			Turma turma = new Turma(nome);
			turmas.inserir(turma);
		}
	}

	public void inserirDisciplina(String nome, String ementa)
			throws ElementoJaCadastradoException, RepositorioException,
			EntradaInvalidaException {
		try {
			Disciplina d = disciplinas.procurar(nome);
			throw new ElementoJaCadastradoException();
		} catch (ElementoNaoEncontradoException e) {
			if (Controle.nomeValido(nome)) {
				Disciplina d = new Disciplina(nome, ementa);
				disciplinas.inserir(d);
			}
		}

	}

	public Pessoa procurarPessoa(String cpf)
			throws ElementoNaoEncontradoException, EntradaInvalidaException {
		Pessoa p = null;
		if (Controle.cpfValido(cpf)) {
			try {
				p = pessoas.procurar(cpf);
			} catch (ElementoNaoEncontradoException e) {
				throw e;
			}
		}
		return p;
	}

	public Disciplina procurarDisciplina(String nome)
			throws ElementoNaoEncontradoException, EntradaInvalidaException {
		Disciplina d = null;
		if (Controle.nomeValido(nome)) {
			try {
				d = disciplinas.procurar(nome);
			} catch (ElementoNaoEncontradoException e) {
				throw e;
			}
		}
		return d;
	}

	public Turma procurarTurma(String nome)
			throws ElementoNaoEncontradoException, EntradaInvalidaException {
		Turma t = null;

		if (Controle.nomeValido(nome)) {
			try {
				t = turmas.procurar(nome);
			} catch (ElementoNaoEncontradoException e) {
				throw e;
			}
		}
		return t;
	}

	public void removerPessoa(String cpf) throws RepositorioException,
			EntradaInvalidaException, ElementoNaoEncontradoException {
		Controle.cpfValido(cpf);
		pessoas.remover(cpf);
	}

	public void removerDisciplina(String nome) throws RepositorioException,
			EntradaInvalidaException, ElementoNaoEncontradoException {
		Controle.nomeValido(nome);
		disciplinas.remover(nome);
	}

	public void removerTurma(String nome) throws RepositorioException,
			EntradaInvalidaException, ElementoNaoEncontradoException {
		Controle.nomeValido(nome);
		turmas.remover(nome);
	}

	public void atualizarPessoa(Pessoa pessoaOriginal, Pessoa pessoaAtualizada)
			throws ElementoNaoEncontradoException, RepositorioException {
		if (pessoaOriginal.getCpf().equals(pessoaAtualizada.getCpf())) {
			try {
				pessoas.atualizar(pessoaAtualizada);
			} catch (ElementoNaoEncontradoException e) {// isso nunca vai
														// acontecer
			}
		} else {
			try {
				removerPessoa(pessoaOriginal.getCpf());
				this.pessoas.inserir(pessoaAtualizada);
			} catch (EntradaInvalidaException e) {
			}
		}
		try {
			pessoas.atualizar(pessoaAtualizada);
		} catch (ElementoNaoEncontradoException e) {
		} catch (RepositorioException f) {

		}
	}

	public void atualizarDisciplina(Disciplina disc)
			throws ElementoNaoEncontradoException {
		try {
			try {
				disciplinas.atualizar(disc);
			} catch (RepositorioException e) {

				e.printStackTrace();
			}
		} catch (ElementoNaoEncontradoException e) {

		}
	}

	public void atualizarTurma(Turma turmaOriginal, Turma turmaAtualizada)
			throws ElementoNaoEncontradoException {
		try {
			try {
				turmas.atualizar(turmaAtualizada);
			} catch (RepositorioException e) {

			}
		} catch (ElementoNaoEncontradoException e) {

		}
	}

	public String relatorioAlunos() { // tem que fazer os metodos relatorio
		String retorno = "Relatorio de Alunos\n";

		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = (Pessoa) it.next();
			if (p instanceof Aluno) {
				retorno += p.resumo()+"\n\n";
			}
		}

		return retorno;
	}
	
	public String relatorioProfessor() { // tem que fazer os metodos relatorio
		String retorno = "Relatorio de Professores\n";

		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = (Pessoa) it.next();
			if (p instanceof Professor) {
				retorno += p.resumo()+"\n\n";
			}
		}

		return retorno;
	}
	
	public String relatorioAdm() { // tem que fazer os metodos relatorio
		String retorno = "Relatorio de Administradores\n";

		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = (Pessoa) it.next();
			if (p instanceof Administrador) {
				retorno += p.resumo()+"\n\n";
			}
		}

		return retorno;
	}
	
	public String relatorioFuncionario() { // tem que fazer os metodos relatorio
		String retorno = "Relatorio de Funcionarios\n";

		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = (Pessoa) it.next();
			if (p instanceof Funcionario) {
				retorno += p.resumo()+"\n\n";
			}
		}

		return retorno;
	}
	
	public String relatorioTurmas() { // tem que fazer os metodos relatorio
		String retorno = "Relatorio de Turmas\n";

		Iterator<Turma> it =turmas.getIterator();
		while (it.hasNext()) {
			Turma p = it.next();
			retorno += p.resumo()+"\n\n";
		}

		return retorno;
	}
	
	public String relatorioDisc() { // tem que fazer os metodos relatorio
		String retorno = "Relatorio de Disciplinas\n";

		Iterator<Disciplina> it =disciplinas.getIterator();
		while (it.hasNext()) {
			Disciplina p = it.next();
			retorno += p.resumo()+"\n\n";
		}

		return retorno;
	}

	public void atualizarAluno(Aluno alunoOriginal, Aluno alunoAtualizado) {
		if (alunoAtualizado.getCpf().equals(alunoOriginal.getCpf())) {
			try {
				pessoas.atualizar(alunoAtualizado);
			} catch (RepositorioException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ElementoNaoEncontradoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			alunoAtualizado.setBoletim(alunoOriginal.getBoletim());
			try {
				pessoas.remover(alunoOriginal.getCpf());
			} catch (ElementoNaoEncontradoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RepositorioException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				pessoas.inserir(alunoAtualizado);
			} catch (RepositorioException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void atualizarProfessor(Professor professorOriginal,
			Professor professorAtualizado) {
		professorOriginal = professorAtualizado;
	}

	public RepositorioArrayPessoa getAlunos() {
		RepositorioArrayPessoa alunos = new RepositorioArrayPessoa();
		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = it.next();
			if (p instanceof Aluno) {
				alunos.inserir(p);
			}
		}
		return alunos;
	}

	public RepositorioArrayPessoa getProfessores() {
		RepositorioArrayPessoa professores = new RepositorioArrayPessoa();
		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = it.next();
			if (p instanceof Professor) {
				professores.inserir(p);
			}
		}
		return professores;
	}

	public RepositorioArrayPessoa getAdministradores() {
		RepositorioArrayPessoa administradores = new RepositorioArrayPessoa();
		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = it.next();
			if (p instanceof Administrador) {
				administradores.inserir(p);
			}
		}
		return administradores;
	}

	public RepositorioArrayPessoa getFuncionarios() {
		RepositorioArrayPessoa funcionarios = new RepositorioArrayPessoa();
		Iterator<Pessoa> it = pessoas.getIterator();
		while (it.hasNext()) {
			Pessoa p = it.next();
			if (p instanceof Professor) {
				funcionarios.inserir(p);
			}
		}
		return funcionarios;
	}

	public RepositorioArrayTurma getArrayTurma() {
		RepositorioArrayTurma turmasArray = new RepositorioArrayTurma();
		Iterator<Turma> it = this.turmas.getIterator();
		while (it.hasNext()) {
			Turma turma = it.next();
			turmasArray.inserir(turma);
		}
		return turmasArray;

	}

	public RepositorioArrayDisciplina getArrayDisciplina() {
		RepositorioArrayDisciplina disciplinasArray = new RepositorioArrayDisciplina();
		Iterator<Disciplina> it = this.disciplinas.getIterator();
		while (it.hasNext()) {
			Disciplina disciplina = it.next();
			disciplinasArray.inserir(disciplina);
		}
		return disciplinasArray;

	}
	
	public void removerTurmaProfessor(Professor professor, Turma turma) throws  RepositorioException, ElementoNaoEncontradoException{
		Professor professorAux=professor;
		try {
			professorAux = (Professor) getProfessores().procurar(professor.getCpf());
		} catch (ElementoNaoEncontradoException e) {
		}
		professorAux.removerTurma(turma);
	}
	
	
	public void adicionarTurmaProfessor(Professor professor, Turma turma) throws ElementoJaCadastradoException{
		Professor professorAux=professor;
		try {
			professorAux = (Professor) getProfessores().procurar(professor.getCpf());
		} catch (ElementoNaoEncontradoException e) {
		}
		professorAux.inserirTurma(turma);
	
	}
	
	public void removerDisciplinaProfessor(Professor professor, Disciplina disciplina){
		Professor professorAux=professor;
		try {
			professorAux = (Professor) getProfessores().procurar(professor.getCpf());
		} catch (ElementoNaoEncontradoException e) {
		}
		try {
			professorAux.removerDisciplina(disciplina);
		} catch (RepositorioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ElementoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void adicionarDisciplinaProfessor(Professor professor, Disciplina disciplina) throws ElementoJaCadastradoException{
		Professor professorAux=professor;
		try {
			professorAux = (Professor) getProfessores().procurar(professor.getCpf());
		} catch (ElementoNaoEncontradoException e) {
		}
		professorAux.inserirDisciplina(disciplina);
	}
	
}
