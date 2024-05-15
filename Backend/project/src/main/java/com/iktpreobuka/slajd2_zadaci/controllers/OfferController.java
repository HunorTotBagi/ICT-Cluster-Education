package com.iktpreobuka.slajd2_zadaci.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.slajd2_zadaci.entities.OfferEntity;
import com.iktpreobuka.slajd2_zadaci.entities.OfferStatus;

@RestController
@RequestMapping(value = "/project/offers")
public class OfferController {

	public List<OfferEntity> getDB() {
		List<OfferEntity> offers = new ArrayList<>();

		offers.add(new OfferEntity(1, "2 tickets for Killers concert", "Enjoy!!!", LocalDate.of(2024, 5, 15),
				LocalDate.of(2024, 7, 15), (float) 1333.33, " ", 5, 7, OfferStatus.APPROVED));

		offers.add(new OfferEntity(2, "Weekend getaway package", "Relax and unwind", LocalDate.of(2024, 6, 1),
				LocalDate.of(2024, 6, 3), (float) 899.99, " ", 3, 5, OfferStatus.WAIT_FOR_APPROVING));

		offers.add(new OfferEntity(3, "Fine dining experience for two", "Treat yourself to a gourmet meal",
				LocalDate.of(2024, 5, 20), LocalDate.of(2024, 6, 30), (float) 250.00, " ", 2, 10,
				OfferStatus.DECLINED));

		offers.add(new OfferEntity(4, "Adventure sports package", "Get your adrenaline pumping",
				LocalDate.of(2022, 7, 1), LocalDate.of(2023, 7, 10), (float) 699.50, " ", 4, 8, OfferStatus.EXPIRED));

		return offers;
	}
}
