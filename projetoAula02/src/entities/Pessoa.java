package entities;

public class Pessoa {
	private int id;
	private String nome;
	private String cpf;

	
	//ctrl+shift+s -> o
	public Pessoa(int id, String nome, String cpf) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	//ctrl+ enter ou  ctrl+shift+s -> o sem campos
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	
	//ctrl+shift+s -->r
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
