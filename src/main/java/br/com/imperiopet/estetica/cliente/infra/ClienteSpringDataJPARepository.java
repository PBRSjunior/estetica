package br.com.imperiopet.estetica.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imperiopet.estetica.cliente.domain.Cliente;

public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente,UUID> {

}
