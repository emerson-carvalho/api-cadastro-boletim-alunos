package br.com.projetos.academico.controller;

import br.com.projetos.academico.model.Aluno;
import br.com.projetos.academico.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AcademicoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAlunos() {
        return alunoService.obterTodosOsAlunos();
    }

    @PostMapping("/cadastrar")
    public void cadastrarAluno(@RequestBody Aluno aluno) {
        alunoService.salvarAluno(aluno);
    }

    @GetMapping("/{matricula}")
    public Aluno buscarAlunoPorMatricula(@PathVariable Integer matricula) {
        return alunoService.buscarPorMatricula(matricula);
    }

    @PutMapping("/atualizar/{matricula}")
    public void atualizarAluno(@PathVariable Integer matricula, @RequestBody Aluno aluno){
        alunoService.atualizarAluno(matricula,aluno);
    }

    @DeleteMapping("/deletar/{matricula}")
    public void deletarAluno(@PathVariable Integer matricula){
        Aluno aluno = alunoService.buscarPorMatricula(matricula);
        alunoService.deletarAluno(aluno);
    }
}