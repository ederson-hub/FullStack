package com.starksytem.fullstackweek.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starksytem.fullstackweek.domain.Fornecedor;
import com.starksytem.fullstackweek.repository.FornecedorRepository;

@RestController
@RequestMapping("/fornecedores")
@CrossOrigin(origins = {"http://localhost:3000"})
public class FornecedorResource {
    
    @Autowired
    private FornecedorRepository fornecedorRepository;

    @GetMapping
    public List<Fornecedor> listAll(){
        return fornecedorRepository.findAll();
    }

    @PostMapping
    public Fornecedor addFornecedor(@RequestBody Fornecedor fornecedor){
        Fornecedor fornecedorAdd = fornecedorRepository.save(fornecedor);
        fornecedorAdd.setAtivo(true);
        return fornecedorRepository.save(fornecedorAdd);
    }

    @PutMapping("/{codigo}")
    public Fornecedor refreshFornecedor(@PathVariable("codigo") Long codigo,
                                        @RequestBody Fornecedor fornecedor){
        return fornecedorRepository.findById(codigo).map(
            record ->{
                record.setAtivo(fornecedor.getAtivo());
                record.setNome(fornecedor.getNome());
                record.setRazaoSocial(fornecedor.getRazaoSocial());
                record.setPfPj(fornecedor.getPfPj());
                record.setContato(fornecedor.getContato());
                record.setCpf(fornecedor.getCpf());
                record.setRg(fornecedor.getRg());
                record.setCnpj(fornecedor.getCnpj());
                record.setIe(fornecedor.getIe());
                record.setIeBaixado(fornecedor.getIeBaixado());
                record.setIeSubstituto(fornecedor.getIeSubstituto());
                record.setiMunicipal(fornecedor.getiMunicipal());
                record.setEmail(fornecedor.getEmail());
                record.setCep(fornecedor.getCep());
                record.setEndereco(fornecedor.getEndereco());
                record.setComplemento(fornecedor.getComplemento());
                record.setNumero(fornecedor.getNumero());
                record.setUf(fornecedor.getUf());
                record.setDdd1(fornecedor.getDdd1());
                record.setTelefone1(fornecedor.getTelefone1());
                record.setDddcel(fornecedor.getDddcel());
                record.setCelular(fornecedor.getCelular());
                record.setBloqueado(fornecedor.getBloqueado());
                record.setCadastrado(fornecedor.getCadastrado());
                record.setObs(fornecedor.getObs());
                return fornecedorRepository.save(record);
            }).orElse(null);
        }

    @GetMapping("/{codigo}")
    public Fornecedor findFornecedor(@PathVariable Long codigo){
        return fornecedorRepository.findById(codigo).orElse(null);
    }
}
