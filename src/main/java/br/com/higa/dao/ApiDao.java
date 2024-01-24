package br.com.higa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import br.com.higa.model.Produto;

@ManagedBean
public class ApiDao {
	
	private List<Produto> produtoList = new ArrayList<Produto>();
	
	public ApiDao() {
		produtoList.add(new Produto("Produto 01", 100, true));
		produtoList.add(new Produto("Produto 02", 6, false));
		produtoList.add(new Produto("Produto 03", 79, true));
		produtoList.add(new Produto("Produto 04", 1036, false));
		produtoList.add(new Produto("Produto 05", 2, true));
	}
	
	public List<Produto> getAll() {
		return produtoList;
	}
	
	public Produto get(int id) throws IndexOutOfBoundsException {
		return produtoList.get(id);
	}
	
}
