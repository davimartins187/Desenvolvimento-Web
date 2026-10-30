package com.example.mavendemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlunoController {
    private List<Aluno> alunos = new ArrayList<>();

    @GetMapping("/aluno")
    public List<Aluno> listarAlunos(){
        return alunos;
    }

    @GetMapping("/aluno/media")
    public double calcularMedia(){
        if (alunos.isEmpty()){
            return 0.0;
        }

        double somaDasMedias = 0.0;

        for (Aluno aluno : alunos){
            aluno.alunoMedia();
            somaDasMedias += aluno.getMedia();
        }

        return somaDasMedias / alunos.size();
    }

    @PostMapping("/cadastrarAluno")
    public String cadastrarAluno(@RequestBody Aluno novoAluno){
        novoAluno.alunoMedia();
        alunos.add(novoAluno);

        return "Aluno " + novoAluno.getNome() + "cadastrado com sucesso!";
    }
}
