package com.iktpreobuka.slajd2_zadaci.entities;

import java.time.LocalDate;

import com.iktpreobuka.slajd2_zadaci.enums.OfferStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OfferEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Integer id;
	protected String offerName;
	protected String offerDescription;
	protected LocalDate offerCreated;
	protected LocalDate offerExpires;
	protected float regularPrice;
	protected String imagePath;
	protected int availableOffers;
	protected int boughtOffers;
	protected OfferStatus offerStatus;

	public OfferEntity() {
	}

	public OfferEntity(int id, String offerName, String offerDescription, LocalDate offerCreated,
			LocalDate offerExpires, float regularPrice, String imagePath, int availableOffers, int boughtOffers,
			OfferStatus offerStatus) {
		this.id = id;
		this.offerName = offerName;
		this.offerDescription = offerDescription;
		this.offerCreated = offerCreated;
		this.offerExpires = offerExpires;
		this.regularPrice = regularPrice;
		this.imagePath = imagePath;
		this.availableOffers = availableOffers;
		this.boughtOffers = boughtOffers;
		this.offerStatus = offerStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferDescription() {
		return offerDescription;
	}

	public void setOfferDescription(String offerDescription) {
		this.offerDescription = offerDescription;
	}

	public LocalDate getOfferCreated() {
		return offerCreated;
	}

	public void setOfferCreated(LocalDate offerCreated) {
		this.offerCreated = offerCreated;
	}

	public LocalDate getOfferExpires() {
		return offerExpires;
	}

	public void setOfferExpires(LocalDate offerExpires) {
		this.offerExpires = offerExpires;
	}

	public float getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(int regularPrice) {
		this.regularPrice = regularPrice;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getAvailableOffers() {
		return availableOffers;
	}

	public void setAvailableOffers(int availableOffers) {
		this.availableOffers = availableOffers;
	}

	public int getBoughtOffers() {
		return boughtOffers;
	}

	public void setBoughtOffers(int boughtOffers) {
		this.boughtOffers = boughtOffers;
	}

	public OfferStatus getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(OfferStatus offerStatus) {
		this.offerStatus = offerStatus;
	}
}
