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

import com.starksytem.fullstackweek.domain.CategoriaCliente;
import com.starksytem.fullstackweek.repository.CategoriaClienteRepository;


@RestController
@RequestMapping("/CategoriaClientes")
@CrossOrigin (origins = {"http://localhost:3000"})
public class CategoriaClienteResource {
    @Autowired
    private CategoriaClienteRepository categoriaClienteRepository;

    @GetMapping
    public List<CategoriaCliente> listAll(){
        return categoriaClienteRepository.findAll();
    }

    @PostMapping
    public CategoriaCliente addCategoriaCliente(@RequestBody CategoriaCliente categoriaCliente){
        CategoriaCliente categoriaAdd = categoriaClienteRepository.save(categoriaCliente);
        return categoriaClienteRepository.save(categoriaAdd);
    }

	@PutMapping("/{codigo}")
	public CategoriaCliente refresh(@PathVariable("codigo") Long codigo,
			                        @RequestBody CategoriaCliente categoriaCliente) {
		return categoriaClienteRepository.findById(codigo).map(
				record -> {
					record.setNome(categoriaCliente.getNome());
					return categoriaClienteRepository.save(record);
				}).orElse(null);
	}
    @GetMapping("/{codigo}")
    public CategoriaCliente findCategoria(@PathVariable Long codigo){
        return categoriaClienteRepository.findById(codigo).orElse(null);
    }

}
