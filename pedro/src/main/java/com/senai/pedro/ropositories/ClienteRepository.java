package com.senai.pedro.ropositories;

	import org.springframework.data.jpa.repository.JpaRepository;

	import com.senai.pedro.entities.Cliente;

	public interface ClienteRepository extends JpaRepository<Cliente, Long> {
		
	}

	

