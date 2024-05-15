package com.iktpreobuka.slajd2_zadaci.entities;

public class CategoryEntity {
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
