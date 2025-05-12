package com.videolocadora.videolocadora.repository;

import com.videolocadora.videolocadora.model.Cliente;
import jakarta.persistence.JoinColumn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, UUID> {



}
