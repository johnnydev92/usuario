package com.javanauta.usuario.infrastructure.Repository;

import com.javanauta.aprendendo_spring.Infrastructure.Entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
