package com.eletronalize.gof.labdesignpatterns.service;

import com.eletronalize.gof.labdesignpatterns.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author felipeborges-pgr
 */
public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar (Long id, Cliente cliente);
	
	void deletar(Long id);
	
}
