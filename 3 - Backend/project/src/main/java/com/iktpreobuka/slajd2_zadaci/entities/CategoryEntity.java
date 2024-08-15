package com.iktpreobuka.slajd2_zadaci.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int id;
	protected String categoryName;
	protected String categoryDescription;

	public CategoryEntity() {
	}

	public CategoryEntity(int id, String categoryName, String categoryDescription) {
		setId(id);
		setCategoryName(categoryName);
		setCategoryDescription(categoryDescription);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
}
