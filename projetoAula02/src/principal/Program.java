package principal;

import java.util.Date;

import entities.Funcao;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario funcionario = new Funcionario(1, "Heitor Paiva", "123.456.789.12","12345",  2000.0,  new Date());
		
		Funcao funcao = new Funcao(1, "prog", "Progamador JAVA" );
		
		funcionario.setFuncao(funcao);
		
		System.out.println("\nDados da FUNCIONARIO: \n");
		
		System.out.println("ID...........:   " + funcionario.getId());
		System.out.println("NOME.........:   " + funcionario.getNome());
		System.out.println("CPF..........:   " + funcionario.getCpf());
		System.out.println("MATRICULA....:   " + funcionario.getMatricula());
		System.out.println("SALARIO......:   " + funcionario.getSalario());
		System.out.println("ADMISSAO.....:   " + funcionario.getDataAdmissao());

		System.out.println("ID DA FUN��O..:   " + funcionario.getFuncao().getId());
		System.out.println("SIGLA.........:   " + funcionario.getFuncao().getSigla());
		System.out.println("DESCRI��O.....:   " + funcionario.getFuncao().getDescricao());
		
		
		
		
	}

}
