package principal;

import entities.Cliente;
import repository.ClienteRepository;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Aula 01 - JAVA WEBDEVELOPER");
		
		Cliente cliente =  new Cliente();
		
		cliente.setIdCliente(1);
		cliente.setNome("Heitor Paiva Magalh?es");
		cliente.setEmail("heitor.geo@hotmail.com");
		cliente.setCpf("123123123-02");
		
		System.out.println("\nDADOS DO CLIENTE:");
		System.out.println("\tId do Cliente....: " + cliente.getIdCliente());
		System.out.println("\tNome do Cliente..: " + cliente.getNome());
		System.out.println("\tEmail do CLiente.: " + cliente.getEmail());
		System.out.println("\tCPF do Cliente...: " + cliente.getCpf());
		
		ClienteRepository clienteRepository = new ClienteRepository();
		
		try {
			clienteRepository.gravarArquivo(cliente);
			System.out.println("\nDados gravados com sucesso!");
		}
		catch(Exception e){
			System.out.println("\nErro ao gravar arquivo!");
			System.out.println(e.getMessage());
			
		}
		
	}

}
