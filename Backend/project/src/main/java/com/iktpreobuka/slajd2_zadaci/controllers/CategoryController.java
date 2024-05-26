package com.iktpreobuka.slajd2_zadaci.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.CategoryEntity;
import com.iktpreobuka.slajd2_zadaci.repositories.UserRepository;

@RestController
@RequestMapping(value = "/project/categories")
public class CategoryController {

	public List<CategoryEntity> getDB() {
		List<CategoryEntity> categories = new ArrayList<>();
    
		categories.add(new CategoryEntity(1, "music", "description 1"));
	  categories.add(new CategoryEntity(2, "food", "description 2"));
      categories.add(new CategoryEntity(3, "entertainment", "description 3"));
	
		return categories;
	}

	@PostMapping
	public CategoryEntity addNewCategory(@RequestParam("id") String id,
			@RequestParam("categoryName") String categoryName,
			@RequestParam("categoryDescription") String categoryDescription) {
		List<CategoryEntity> categories = getDB();
		CategoryEntity newCategory = new CategoryEntity(Integer.parseInt(id), categoryName, categoryDescription);
		categories.add(newCategory);
		return newCategory;
	}

	@PutMapping("/{id}")
	public CategoryEntity modifyCategory(@PathVariable String id, @RequestParam("categoryName") String categoryName,
			@RequestParam("categoryDescription") String categoryDescription) {

		List<CategoryEntity> categories = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < categories.size(); i++) {
			if (categories.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		if (found == false) {
			return null;
		}

		CategoryEntity category = categories.get(index);
		category.setCategoryName(categoryName);
		category.setCategoryDescription(categoryDescription);
		return category;
	}

	@DeleteMapping("/{id}")
	public CategoryEntity deleteCategory(@PathVariable String id) {

		List<CategoryEntity> categories = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < categories.size(); i++) {
			if (categories.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		if (found == false) {
			return null;
		}

		CategoryEntity category = categories.get(index);

		categories.remove(category);

		return category;
	}

	@GetMapping("/{id}")
	public CategoryEntity getCategory(@PathVariable String id) {

		List<CategoryEntity> categories = getDB();

		boolean found = false;
		int index = 0;
		for (int i = 0; i < categories.size(); i++) {
			if (categories.get(i).getId() == Integer.parseInt(id)) {
				found = true;
				index = i;
				break;
			}
		}

		if (found == false) {
			return null;
		}

		return categories.get(index);
	}
}
