package com.iktpreobuka.second_homework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iktpreobuka.second_homework.entities.WorkplaceEntity;
import com.iktpreobuka.second_homework.entities.dto.WorkplaceDTO;
import com.iktpreobuka.second_homework.services.WorkplaceService;

@RestController
@RequestMapping("/api/v1/workplaces")
public class WorkplaceController {
	
	@Autowired
	private WorkplaceService workplaceService;

	@GetMapping
	public Iterable<WorkplaceEntity> getAllWorkplaces() {
		return workplaceService.getAllWorkplaces();
	}

	@GetMapping("/{id}")
	public WorkplaceEntity getWorkplaceById(@PathVariable String id) {
		return workplaceService.getWorkplaceById(id);
	}

	@PostMapping
	public WorkplaceEntity createWorkplace(@RequestBody WorkplaceDTO workplaceDTO) {
		return workplaceService.createWorkplace(workplaceDTO);
	}

	@PutMapping("/{id}")
	public WorkplaceEntity updateWorkplace(@PathVariable String id, @RequestBody WorkplaceDTO workplaceDTO) {
		return workplaceService.updateWorkplace(id, workplaceDTO);
	}

	@DeleteMapping("/{id}")
	public WorkplaceEntity deleteWorkplace(@PathVariable String id) {
		return workplaceService.deleteWorkplace(id);
	}
}
