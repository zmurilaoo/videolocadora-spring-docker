package com.videolocadora.videolocadora.repository;

import com.videolocadora.videolocadora.model.Cliente;
import jakarta.persistence.JoinColumn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {

}
