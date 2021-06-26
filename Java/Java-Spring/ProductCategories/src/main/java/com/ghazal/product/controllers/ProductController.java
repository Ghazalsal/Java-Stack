package com.ghazal.product.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ghazal.product.models.Category;
import com.ghazal.product.models.Product;
import com.ghazal.product.services.ProductService;

@Controller
public class ProductController {
private final ProductService productService;
    
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
//    --------------------------------------------------------------new product-----------------------------------------------------------------
    @RequestMapping("/product/new")
    public String index(@ModelAttribute("product") Product product) {
        return "/product.jsp";
    }
    @RequestMapping(value = "/product/new", method = RequestMethod.POST)
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "product.jsp";
		} else {
			productService.createProduct(product);
			return "redirect:/product/new";
		}
	}
//  --------------------------------------------------------------new product-----------------------------------------------------------------
    
//  --------------------------------------------------------------new category-----------------------------------------------------------------
    @RequestMapping("/category/new")
    public String index1(@ModelAttribute("category") Category category) {
        return "/category.jsp";
    }
    @RequestMapping(value = "/category/new", method = RequestMethod.POST)
	public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "category.jsp";
		} else {
			productService.createCategory(category);
			return "redirect:/category/new";
		}
	}
//  --------------------------------------------------------------new category-----------------------------------------------------------------
//  --------------------------------------------------------------show product----------------------------------------------------------------- 
    @RequestMapping("/products/{id}")
	public String showProduct(@PathVariable ("id")Long id, @ModelAttribute("product")Product product,Model model) {
		Product products = productService.findProduct(id);
		model.addAttribute("product", products);
		model.addAttribute("categories",productService.getAllExceptId(id));
		return "prod.jsp";
	}
    @RequestMapping(value="/products/{id}", method=RequestMethod.POST)
	public String addCategory(@PathVariable("id")Long id,@RequestParam("category") Long catId) {
		Product product = productService.findProduct(id);
		Category category = productService.findCategory(catId);
		List<Category> categories = product.getCategories();
		categories.add(category);
		productService.createProduct(product);
		return "redirect:/products/"+id;
	}
//  --------------------------------------------------------------show product----------------------------------------------------------------- 
//  --------------------------------------------------------------show category----------------------------------------------------------------- 
    @RequestMapping("/categories/{id}")
	public String showCat(@PathVariable ("id")Long id, @ModelAttribute("category")Category category,Model model) {
    	Category categorys = productService.findCategory(id);
		model.addAttribute("category", categorys);
		model.addAttribute("products",productService.getAllExceptId(id));
		return "cat.jsp";
	}
    @RequestMapping(value="/categories/{id}", method=RequestMethod.POST)
	public String addProd(@PathVariable("id")Long id,@RequestParam("product") Long prodId) {
    	Category category = productService.findCategory(id);
    	Product product = productService.findProduct(prodId);
		List<Product> products = category.getProducts();
		products.add(product);
		productService.createCategory(category);
		return "redirect:/categories/"+id;
	}
//  --------------------------------------------------------------show category----------------------------------------------------------------- 
}
