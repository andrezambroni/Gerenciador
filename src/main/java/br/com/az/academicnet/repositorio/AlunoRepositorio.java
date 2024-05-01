package br.com.az.academicnet.repositorio;

import br.com.az.academicnet.modelo.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long>{
}
