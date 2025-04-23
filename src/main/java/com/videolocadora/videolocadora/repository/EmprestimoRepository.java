package com.videolocadora.videolocadora.repository;

import com.videolocadora.videolocadora.model.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, UUID> {
}
