package com.edifilar.model;

import java.util.List;
import java.util.ArrayList;

public class Pessoa {

    private Long id;
    private String nome;
    private List<Enderecos> enderecos;
    private TipoSanguineo tipoSanguineo;

    // CONSTRUTOR PADRÃO (OBRIGATÓRIO para Spring/JPA)
    public Pessoa() {
        this.enderecos = new ArrayList<>(); // Inicializa a lista para evitar NullPointerException
    }

    // Construtor com id e nome
    public Pessoa(Long id, String nome) {
        this(); // Chama o construtor padrão
        this.id = id;
        this.nome = nome;
    }

    // Construtor completo (se necessário)
    public Pessoa(Long id, String nome, List<Enderecos> enderecos) {
        this.id = id;
        this.nome = nome;
        this.enderecos = enderecos != null ? enderecos : new ArrayList<>();
    }

    // Getters e Setters

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Enderecos> enderecos) {
        this.enderecos = enderecos != null ? enderecos : new ArrayList<>();
    }

    // Método utilitário para adicionar endereço
    public void addEndereco(Enderecos endereco) {
        if (this.enderecos == null) {
            this.enderecos = new ArrayList<>();
        }
        this.enderecos.add(endereco);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", enderecos=" + (enderecos != null ? enderecos.size() : 0) + " endereços" +
                '}';
    }
}