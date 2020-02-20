package net.codejava.productManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(Long Id) {
		return repo.findById(Id).get();
	}
	
	public void delete(Long Id) {
		repo.deleteById(Id);		
	}
}
