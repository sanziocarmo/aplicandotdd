package br.com.sanziocarmo.aplicandotdd.model;

import java.time.LocalDate;

public class ProdutoModel {

    private Long id;
    private String nome;
    private String descricao;
    private LocalDate dataCompra;
    private LocalDate dataAtual;
    private Integer codVendedor;

    public ProdutoModel(Long id, String nome, String descricao, LocalDate dataCompra, LocalDate dataAtual, Integer codVendedor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCompra = dataCompra;
        this.dataAtual = dataAtual;
        this.codVendedor = codVendedor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }

    public Integer getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }
}
