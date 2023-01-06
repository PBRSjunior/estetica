package br.com.imperiopet.estetica.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String celular;
	@NotBlank
	private String endereco;
	@CPF
	private String cpf;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDAUltimaAlteracao;

	public Cliente(UUID idCliente, @NotBlank String nomeCompleto, @NotBlank String celular, @NotBlank String endereco,
			@CPF String cpf) {
		this.nomeCompleto = nomeCompleto;
		this.celular = celular;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

}
