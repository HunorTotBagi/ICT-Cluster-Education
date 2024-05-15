package com.iktpreobuka.slajd2_zadaci.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.CategoryEntity;

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

	@RequestMapping(method = RequestMethod.POST)
	public CategoryEntity addNewCategory(@RequestParam("id") String id,
			@RequestParam("categoryName") String categoryName,
			@RequestParam("categoryDescription") String categoryDescription) {
		List<CategoryEntity> categories = getDB();
		CategoryEntity newCategory = new CategoryEntity(Integer.parseInt(id), categoryName, categoryDescription);
		categories.add(newCategory);
		return newCategory;
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
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

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
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

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
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
