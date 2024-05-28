package com.iktpreobuka.slajd2_zadaci.services;

import com.iktpreobuka.slajd2_zadaci.entities.CategoryEntity;

public interface CategoryService {
	public CategoryEntity createCategory(CategoryEntity categoryBody);

	public Iterable<CategoryEntity> getAllCategories();

	public CategoryEntity getCategoryById(String id);

	public CategoryEntity updateCategory(String id, CategoryEntity categoryBody);

	public CategoryEntity deleteCategory(String id);
}
