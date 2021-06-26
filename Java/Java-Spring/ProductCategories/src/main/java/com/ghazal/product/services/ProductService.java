package com.ghazal.product.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ghazal.product.models.Category;
import com.ghazal.product.models.Product;
import com.ghazal.product.repositories.CategoryRepository;
import com.ghazal.product.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;
	public ProductService(ProductRepository productRepository,CategoryRepository categoryRepository ) {
        this.productRepository = productRepository;
        this.categoryRepository=categoryRepository;
    }
//	functionalities for products---------------------------------------------------
	
	 public List<Product> allProducts() {
	        return productRepository.findAll();
	    }
	    
	    public Product createProduct(Product product) {
	        return productRepository.save(product);
	    }
	    
	    public Product findProduct(Long id) {
	        Optional<Product> optionalProduct = productRepository.findById(id);
	        if(optionalProduct.isPresent()) {
	            return optionalProduct.get();
	        } else {
	            return null;
	        }
	    }
//		functionalities for products---------------------------------------------------
	    
	    
//		functionalities for category---------------------------------------------------
	    public List<Category> allCategory() {
	        return categoryRepository.findAll();
	    }
	    
	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }
	    
	    public Category findCategory(Long id) {
	        Optional<Category> optionalCategory = categoryRepository.findById(id);
	        if(optionalCategory.isPresent()) {
	            return optionalCategory.get();
	        } else {
	            return null;
	        }
	    }
//		functionalities for category---------------------------------------------------

	    public List<Product> getAllExceptId(Long id){
			List<Product> products = this.getAll();
			Optional<Category> product = categoryRepository.findById(id);
			if(product.isPresent()) {
				List<Product> catprod = product.get().getProducts();
				products.removeAll(catprod);
				return products;
			}else {
				return null;
			}
			
		}

	    public List<Product> getAll(){
			return (List<Product>) productRepository.findAll();
		}

	
}
