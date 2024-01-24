package br.com.higa.service;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

import br.com.higa.dao.ApiDao;
import br.com.higa.model.Produto;

@ManagedBean
public class ApiService {
	
	@Inject
	private ApiDao apiDao;
	
	public List<Produto> getAllProdutos(){
		return apiDao.getAll();
	}
	
	public Produto getProduto(int id) {
		try {
			return apiDao.get(id);
		} catch(IndexOutOfBoundsException e) {
			return new Produto("[Produto inexistente / Id do Produto invalido]", 0, false);
		}
	}
	
}
