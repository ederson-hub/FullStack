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

import com.starksytem.fullstackweek.domain.Caixa;
import com.starksytem.fullstackweek.repository.CaixaRepository;


@RestController
@RequestMapping("/caixas")
@CrossOrigin(origins = {"http://localhost:3000"})

public class CaixaResource {
        
    @Autowired
    private CaixaRepository caixaRepository;

    @GetMapping
    public List<Caixa> listAll(){
        return caixaRepository.findAll();
    }

    @PostMapping
    public Caixa addCaixa(@RequestBody Caixa caixa){
        Caixa caixaAdd = caixaRepository.save(caixa);
        caixaAdd.setAtivo(true);
        return caixaRepository.save(caixaAdd);
    }

    @PutMapping("/{codigo}")
    public Caixa caixaRefresh(  @PathVariable("codigo") Long codigo,
                                @RequestBody Caixa caixa){
        return caixaRepository.findById(codigo).map(
            record ->{
                record.setAtivo(caixa.getAtivo());
                record.setNome(caixa.getNome());
                record.setSenha(caixa.getSenha());
                return caixaRepository.save(record);
            }).orElse(null);            
    }

    @GetMapping("/{codigo}")
    public Caixa findCaixa(@PathVariable Long codigo){
        return caixaRepository.findById(codigo).orElse(null);
    }
}
