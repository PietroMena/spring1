package com.senai.pedro.controller;


	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.senai.pedro.entities.Cliente;
import com.senai.pedro.services.services;
	

	@RestController
	@RequestMapping("/cliente")
	public class controller {
	   private final services clienteService;
	   
	   @Autowired
	   public controller (services clienteService) {
	       this.clienteService = clienteService;
	   }
	   
	   @PostMapping
	   public Cliente createCliente (@RequestBody Cliente cliente) {
	       return clienteService.saveCliente(cliente);
	   }
	   
	   @GetMapping("/{idcCliente}")
	   public Cliente getCliente(@PathVariable Long idcCliente) {
	       return clienteService.getClienteById(idcCliente);
	   }
	   
	   @GetMapping
	   public List<Cliente> getAllidcCliente() {
	       return clienteService.getAllClientes();
	   }
	   
	   @DeleteMapping
	   public void deleteidcCliente(@PathVariable Long idcCliente) {
	       clienteService.deleteCliente(idcCliente);
	   }
	   
	   
	}

