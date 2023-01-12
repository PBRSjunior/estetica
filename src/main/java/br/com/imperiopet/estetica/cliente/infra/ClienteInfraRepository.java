package br.com.imperiopet.estetica.cliente.infra;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.imperiopet.estetica.cliente.application.repository.ClienteRepository;
import br.com.imperiopet.estetica.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;
	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia]ClienteInfraRepository - salva");
		clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza]ClienteInfraRepository - salva");
		return cliente;
	}
	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia]Cliente - buscaTodosClientes");
		List<Cliente>todosClientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza]Cliente - buscaTodosClientes");
		return todosClientes;
	}

}
