package br.com.projetos.academico.repository;

import br.com.projetos.academico.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByMatricula(Integer matricula);
}
