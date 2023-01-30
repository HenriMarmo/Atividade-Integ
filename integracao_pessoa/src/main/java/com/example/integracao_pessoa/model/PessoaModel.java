package com.example.integracao_pessoa.model;

import com.example.integracao_pessoa.model.dto.PessoaDto;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_pessoa")
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String estadoCivil;
    private String telefone;
    private String email;

    public PessoaModel() {
    }

    public PessoaModel(PessoaDto pessoaDto) {
        this.id = pessoaDto.getId();
        this.nome = pessoaDto.getNome();
        this.cpf = pessoaDto.getCpf();
        this.rg = pessoaDto.getRg();
        this.dataNascimento = pessoaDto.getDataNascimento();
        this.estadoCivil = pessoaDto.getEstadoCivil();
        this.telefone = pessoaDto.getTelefone();
        this.email = pessoaDto.getEmail();
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
