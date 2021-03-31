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

import com.starksytem.fullstackweek.domain.Cliente;
import com.starksytem.fullstackweek.repository.ClienteRepository;


@RestController
@RequestMapping
@CrossOrigin (origins = {"http://locahost:3000"})

public class ClienteResource {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listAll(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente addCliente(@RequestBody Cliente cliente){
        Cliente clienteAdd = clienteRepository.save(cliente);
        clienteAdd.setAtivo(true);
        clienteAdd.setBloqueado(false);
        clienteAdd.setIeBaixado(false);
       // clienteAdd.setCadastrado(Date.this.getTime());
       return clienteRepository.save(clienteAdd);
    }

    @PutMapping("/{codigo}")
    public Cliente refreshCliente   (@PathVariable("codigo") Long codigo,
                                    @RequestBody Cliente cliente){
        return clienteRepository.findById(codigo).map(
            record ->{
                record.setAtivo(cliente.getAtivo());
                record.setNome(cliente.getNome());
                record.setRazaoSocial(cliente.getRazaoSocial());
                record.setPfPj(cliente.getPfPj());
                record.setTipoCliente(cliente.getTipoCliente());
                record.setTipoTributacao(cliente.getTipoTributacao());
                record.setContato(cliente.getContato());
                record.setCpf(cliente.getCpf());
                record.setRg(cliente.getRg());
                record.setCnpj(cliente.getCnpj());
                record.setIe(cliente.getIe());
                record.setIeBaixado(cliente.getIeBaixado());
                record.setIeSubstituto(cliente.getIeSubstituto());
                record.setiMunicipal(cliente.getiMunicipal());
                record.setEmail(cliente.getEmail());
                record.setCep(cliente.getCep());
                record.setEndereco(cliente.getEndereco());
                record.setComplemento(cliente.getComplemento());
                record.setNumero(cliente.getNumero());
                record.setUf(cliente.getUf());
                record.setDdd1(cliente.getDdd1());
                record.setTelefone1(cliente.getTelefone1());
                record.setDddcel(cliente.getDddcel());
                record.setCelular(cliente.getCelular());
                record.setBloqueado(cliente.getBloqueado());
                record.setCadastrado(cliente.getCadastrado());
                record.setObs(cliente.getObs());
                return clienteRepository.save(record);
            }).orElse(null);
    }

    @GetMapping("{codigo}")
    public Cliente findCliente(@PathVariable Long codigo){
        return clienteRepository.findById(codigo).orElse(null);
    }
}
