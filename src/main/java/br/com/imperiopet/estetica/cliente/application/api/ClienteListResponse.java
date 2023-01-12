package br.com.imperiopet.estetica.cliente.application.api;

import java.util.List;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;

public class ClienteListResponse {
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	@CPF
	private String cpf;
	public static List<ClienteListResponse> converte(List clientes) {
		
		return null;
	}

}
