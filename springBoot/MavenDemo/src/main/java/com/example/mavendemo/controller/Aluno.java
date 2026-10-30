package com.example.mavendemo.controller;

import java.util.List;

public class Aluno {
    private AlunoID id;
    private String nome;
    private List<Double> notas;
    private double media;

    public Aluno(String nome, List<Double> notas){
        this.id = new AlunoID();
        this.nome = nome;
        this.notas = notas;
    }

    public double alunoMedia(){

        this.media = 0;

        if (notas == null || notas.isEmpty()) {
            return 0.0;
        }

        for (double nota : notas){
            this.media += nota;
        }

        return this.media = media / notas.size();
    }

    public AlunoID getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Double> getNotas(){
        return this.notas;
    }

    public double getMedia(){
        return this.media;
    }

    public void setId(AlunoID id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNotas(List<Double> notas){
        this.notas = notas;
    }
}
