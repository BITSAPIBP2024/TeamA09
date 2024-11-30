package com.hnj.product.controller;

import com.hnj.product.model.Product;
import com.hnj.product.model.request.ProductRequest;
import com.hnj.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3000", allowedHeaders="*")
public class ProductController {
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService){
		this.productService=productService;
	}

	@PostMapping("/products")
	public Product addProduct(@Valid @RequestBody ProductRequest productRequest){
		return productService.addProduct(productRequest);
	}

	@PutMapping("/products/addPrice")
	public Product addPrice(@RequestParam Integer id, @RequestParam Double price){
		return productService.addPrice(id, price);
	}

	@GetMapping("/products")
    public List<Product> getAllProducts(){
	    return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
	public Product getProduct(@PathVariable Integer id){
		return productService.getProductById(id).isPresent() ? productService.getProductById(id).get() : null;
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer id) {
		try {
			productService.deleteProduct(id);
			return ResponseEntity.noContent().build(); // Sends a 204 No Content status for successful deletion
		} catch (IllegalArgumentException e) {
			// Return a 404 status with the error message
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
			// Return a 500 status for any other unexpected errors
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred");
		}
	}
	


}
