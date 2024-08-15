package com.iktpreobuka.slajd2_zadaci.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iktpreobuka.slajd2_zadaci.entities.CategoryEntity;
import com.iktpreobuka.slajd2_zadaci.repositories.CategoryRepository;
import com.iktpreobuka.slajd2_zadaci.services.CategoryService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class CategoryServiceImpl implements CategoryService{

	@PersistenceContext
	protected EntityManager em;
		
	@Autowired
	protected CategoryRepository categoryRepository;

	@Override
	public CategoryEntity createCategory(CategoryEntity categoryBody) {
		CategoryEntity category = new CategoryEntity();
		category.setCategoryName(categoryBody.getCategoryName());
		category.setCategoryDescription(categoryBody.getCategoryDescription());
		categoryRepository.save(category);
		return category;
	}

	@Override
	public Iterable<CategoryEntity> getAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public CategoryEntity getCategoryById(String id) {
		return categoryRepository.findById(Integer.parseInt(id)).get();
	}

	@Override
	public CategoryEntity updateCategory(String id, CategoryEntity categoryBody) {
		CategoryEntity category = categoryRepository.findById(Integer.parseInt(id)).get();
		if (category != null) {
			category.setCategoryName(categoryBody.getCategoryName());
			category.setCategoryDescription(categoryBody.getCategoryDescription());
			categoryRepository.save(category);
			return category;
		}
		return new CategoryEntity();
	}

	@Override
	public CategoryEntity deleteCategory(String id) {
		CategoryEntity student = categoryRepository.findById(Integer.parseInt(id)).get();
		if (student != null) {
			categoryRepository.delete(student);
			return student;
		}
		return new CategoryEntity();
	}

}
