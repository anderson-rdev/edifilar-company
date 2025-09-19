package com.edifilar.controller;


/*

import org.example.Model.Pessoa;
import org.example.interfaces.ICRUD;

import java.util.ArrayList;
import java.util.List;

public class PessoaController implements ICRUD<Pessoa> {
    private final List<Pessoa> pessoas;
    private int proximoId;

    public PessoaController() {
        this.pessoas = new ArrayList<>();
        this.proximoId = 1;
    }

    @Override
    public void criar(Pessoa pessoa) {
        pessoa.setId(proximoId++);
        pessoas.add(pessoa);
        System.out.println("Pessoa criada com sucesso! ID: " + pessoa.getId());
    }

    @Override
    public Pessoa ler(int id) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getId() == id) {
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Pessoa pessoaAtualizada) {
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getId() == pessoaAtualizada.getId()) {
                pessoas.set(i, pessoaAtualizada);
                System.out.println("Pessoa atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Pessoa não encontrada!");
    }

    @Override
    public void deletar(int id) {
        Pessoa pessoa = ler(id);
        if (pessoa != null) {
            pessoas.remove(pessoa);
            System.out.println("Pessoa removida com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    @Override
    public List<Pessoa> listarTodos() {
        return new ArrayList<>(pessoas);
    }

    public List<Pessoa> buscarPorNome(String nome) {
        List<Pessoa> resultado = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(pessoa);
            }
        }
        return resultado;
    }
}

*/