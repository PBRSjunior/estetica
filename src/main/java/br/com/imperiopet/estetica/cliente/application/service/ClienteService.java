package br.com.imperiopet.estetica.cliente.application.service;

import java.util.List;

import br.com.imperiopet.estetica.cliente.application.api.ClienteListResponse;
import br.com.imperiopet.estetica.cliente.application.api.ClienteRequest;
import br.com.imperiopet.estetica.cliente.application.api.ClienteResponse;

public interface ClienteService {
	 ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();
	
	

}
