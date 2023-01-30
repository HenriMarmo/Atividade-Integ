package com.example.integracao_pessoa.service;

import com.example.integracao_pessoa.model.PessoaModel;
import com.example.integracao_pessoa.model.dto.PessoaDto;
import com.example.integracao_pessoa.repository.PessoaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final ModelMapper modelMapper;

    public PessoaService(PessoaRepository pessoaRepository,ModelMapper modelMapper) {

        this.pessoaRepository = pessoaRepository;
        this.modelMapper = modelMapper;
    }

    public List<PessoaModel> findall(){
        List<PessoaModel> pessoaModels = pessoaRepository.findAll();

        return modelMapper.map(pessoaModels, new TypeToken<List<PessoaDto>>(){
        }.getType());
    }

    public PessoaDto findById(PessoaModel pessoaModel) {

        if (pessoaModel == null) {
            return null;
        }

        if (pessoaModel.getId() == null) {
            return null;
        }

        try {
            pessoaModel = pessoaRepository.findById(pessoaModel.getId()).get();

        } catch (Exception e) {
            return null;
        }

        return modelMapper.map(pessoaModel, PessoaDto.class);
    }

    public PessoaDto findById(Long id) {

        if(id == null){
            return null;
        }

        PessoaModel pessoaModel;

        try {
            pessoaModel = pessoaRepository.findById(id).get();

        } catch (Exception e) {
            return null;
        }

        return modelMapper.map(pessoaModel, PessoaDto.class);
    }

    public PessoaDto insert(PessoaDto pessoaDto) {
        pessoaDto.setId(null);

        PessoaModel pessoaModel = pessoaRepository.save(modelMapper.map(pessoaDto, PessoaModel.class));

        return modelMapper.map(pessoaModel, PessoaDto.class);
    }

    public PessoaModel update(PessoaModel pessoaModel) {

        findById(pessoaModel);


        return pessoaRepository.save(pessoaModel);
    }

    public boolean delete(Long id){

        findById(id);

        pessoaRepository.deleteById(id);

        return true;
    }
}
