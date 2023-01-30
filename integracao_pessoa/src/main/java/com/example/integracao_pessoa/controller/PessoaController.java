package com.example.integracao_pessoa.controller;

import com.example.integracao_pessoa.model.PessoaModel;
import com.example.integracao_pessoa.model.dto.PessoaDto;
import com.example.integracao_pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        List<PessoaModel> response =  pessoaService.findall();
        return response == null ? ResponseEntity.unprocessableEntity().build() : ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public PessoaDto findById(@PathVariable Long id){

        return pessoaService.findById(id);
    }

    @PostMapping("/save")
    public PessoaDto insert(@RequestBody PessoaDto pessoaDto) {

        return pessoaService.insert(pessoaDto);
    }

    @PutMapping("/update")
    public PessoaModel update(@RequestBody PessoaModel pessoaModel) {

        return pessoaService.update(pessoaModel);
    }

    @DeleteMapping("/delete")
    public boolean deleteById(@RequestParam(value = "id", required = false) Long id) {

        return pessoaService.delete(id);
    }
}
