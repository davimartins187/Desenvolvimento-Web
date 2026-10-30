package com.example.mavendemo.controller;

import org.springframework.util.Assert;

import java.util.UUID;

public record AlunoID(UUID id) {

    public void AlunoID(){
        Assert.notNull(id, "O id precisa ser informado");
    }

    public AlunoID(){
        this(UUID.randomUUID());
    }
}
