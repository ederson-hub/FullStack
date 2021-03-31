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

import com.starksytem.fullstackweek.domain.SubCategoriaCliente;
import com.starksytem.fullstackweek.repository.SubCategoriaClienteRepository;


@RestController
@RequestMapping("/subcategoriaclientes")
@CrossOrigin(origins = {"http://localhost:3000"})

public class SubCategoriaClienteResource {
    @Autowired
    private SubCategoriaClienteRepository subCategoriaClienteRepository;

    @GetMapping
    public List<SubCategoriaCliente> listAll(){
        return subCategoriaClienteRepository.findAll();
    }
    
    @PostMapping
    public SubCategoriaCliente addCategoriaCliente(@RequestBody SubCategoriaCliente subCategoriaCliente){
        SubCategoriaCliente categoriaAdd = subCategoriaClienteRepository.save(subCategoriaCliente);
        return subCategoriaClienteRepository.save(categoriaAdd);
    }

    @PutMapping ("/{codigo}")
    public SubCategoriaCliente refreshCategoriaCliente(@PathVariable("codigo") Long codigo,
                                                        @RequestBody SubCategoriaCliente subCategoriaCliente){
        return subCategoriaClienteRepository.findById(codigo).map(
            record -> {
                record.setNome(subCategoriaCliente.getNome());
                return subCategoriaClienteRepository.save(record);
            }).orElse(null);
    }

    @GetMapping ("/{codigo}")
    public SubCategoriaCliente findSubCategoriaCliente(@PathVariable("codigo")Long codigo){
        return subCategoriaClienteRepository.findById(codigo).orElse(null);
    }
}
