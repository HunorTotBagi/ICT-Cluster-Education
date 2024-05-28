package com.iktpreobuka.slajd2_zadaci.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.CategoryEntity;
import com.iktpreobuka.slajd2_zadaci.services.CategoryService;

@RestController
@RequestMapping(value = "/project/categories")
public class CategoryController {
	
	@Autowired
	protected CategoryService categoryService;

	@PostMapping
	public CategoryEntity createCategory(@RequestBody CategoryEntity categoryBody) {
		return categoryService.createCategory(categoryBody);
	}
	
	@GetMapping
	public Iterable<CategoryEntity> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@GetMapping("/{id}")
	public CategoryEntity getCategoryById(@PathVariable String id) {
		return categoryService.getCategoryById(id);
	}
	
	@PutMapping("/{id}")
	public CategoryEntity updateCategory(@PathVariable String id, @RequestBody CategoryEntity categoryBody) {
		return categoryService.updateCategory(id, categoryBody);
	}
	
	@DeleteMapping("/{id}")
	public CategoryEntity deleteCategory(@PathVariable String id) {
		return categoryService.deleteCategory(id);
	}
}
