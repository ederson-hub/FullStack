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
import com.starksytem.fullstackweek.domain.GrupoPrioritario;
import com.starksytem.fullstackweek.repository.GrupoPrioritarioRepository;

@RestController
@RequestMapping("/gruposprioritarios")
@CrossOrigin(origins= {"Http://localhost:3000"})

public class GrupoPrioritarioResources {
	
	@Autowired
	private GrupoPrioritarioRepository grupoPrioritarioRepository;
	
	@GetMapping
	public List<GrupoPrioritario> ListarTodos(){
		return grupoPrioritarioRepository.findAll();
	}
	
	@PostMapping
	public GrupoPrioritario cadastrarGrupoPrioritario (@RequestBody GrupoPrioritario grupoPrioritario) {
		GrupoPrioritario grupoCadastrado = grupoPrioritarioRepository.save(grupoPrioritario);		
		return grupoPrioritarioRepository.save(grupoCadastrado);
	}
	
	@PutMapping("/{codigo}")
	public GrupoPrioritario atualizaGrupoPrioritario(@PathVariable("codigo") Long codigo, @RequestBody GrupoPrioritario grupoPrioritario) {
		return grupoPrioritarioRepository.findById(codigo).map(
				record ->{
					record.setDescricao(grupoPrioritario.getDescricao());
					record.setNome(grupoPrioritario.getNome());					
					return grupoPrioritarioRepository.save(record);
				}).orElse(null);				
	}
	
	@GetMapping("/{codigo}")
	public GrupoPrioritario buscarGrupoPrioritario(@PathVariable("codigo") Long codigo) {
		return grupoPrioritarioRepository.findById(codigo).orElse(null);
	}
}
