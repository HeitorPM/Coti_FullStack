package entities;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String matricula;
	private double salario;
	// java.util.date
	private Date dataAdmissao;
	private Funcao funcao; //Associação (ter-1)
	

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String matricula, double salario, Date dataAdmissao) {
		super();
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public Funcionario(int id, String nome, String cpf, String matricula, double salario, Date dataAdmissao) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public Funcionario(int id, String nome, String cpf, String matricula, double salario, Date dataAdmissao,
			Funcao funcao) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
		this.funcao = funcao;
	}
	
	
	
	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	
	
}
