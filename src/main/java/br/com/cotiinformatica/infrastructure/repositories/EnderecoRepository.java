package br.com.cotiinformatica.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cotiinformatica.domain.models.entities.Endereco;

public interface EnderecoRepository extends JpaRepository <Endereco, UUID>{

}
