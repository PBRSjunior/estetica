package br.com.imperiopet.estetica.cliente.application.service;

import br.com.imperiopet.estetica.cliente.application.api.ClienteRequest;
import br.com.imperiopet.estetica.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
