package br.com.projetos.academico.service;

import br.com.projetos.academico.model.Aluno;
import br.com.projetos.academico.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public void salvarAluno(Aluno aluno){
        repository.save(aluno);
    }

    public List<Aluno> obterTodosOsAlunos(){
        return repository.findAll();
    }

    public Aluno buscarPorMatricula(Integer matricula){
        return repository.findByMatricula(matricula);
    }

    public void atualizarAluno(Integer matricula, Aluno aluno){
        Long id = buscarPorMatricula(matricula).getId();
        aluno.setId(id);
        salvarAluno(aluno);
    }

    public void deletarAluno(Aluno aluno){
        repository.delete(aluno);
    }
}
