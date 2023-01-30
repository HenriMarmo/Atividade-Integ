package com.example.integracao_pessoa.model.dto;

import com.example.integracao_pessoa.model.PessoaModel;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

public class PessoaDto {

    private Long id;

    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String estadoCivil;
    private String telefone;
    private String email;

    public PessoaDto() {
    }

    public PessoaDto(PessoaModel pessoaModel) {
        this.id = pessoaModel.getId();
        this.nome = pessoaModel.getNome();
        this.cpf = pessoaModel.getCpf();
        this.rg = pessoaModel.getRg();
        this.dataNascimento = pessoaModel.getDataNascimento();
        this.estadoCivil = pessoaModel.getEstadoCivil();
        this.telefone = pessoaModel.getTelefone();
        this.email = pessoaModel.getEmail();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
