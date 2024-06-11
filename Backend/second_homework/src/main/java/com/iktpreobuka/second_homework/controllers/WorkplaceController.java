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

import com.fasterxml.jackson.annotation.JsonView;
import com.iktpreobuka.second_homework.entities.WorkplaceEntity;
import com.iktpreobuka.second_homework.entities.dto.WorkplaceDTO;
import com.iktpreobuka.second_homework.security.Views;
import com.iktpreobuka.second_homework.services.WorkplaceService;

@RestController
@RequestMapping("/api/v1/workplaces")
public class WorkplaceController {

	@Autowired
	private WorkplaceService workplaceService;

	@PostMapping
	public WorkplaceEntity createWorkplace(@RequestBody WorkplaceDTO workplaceDTO) {
		return workplaceService.createWorkplace(workplaceDTO);
	}

	@GetMapping("/employee")
	@JsonView(Views.Employee.class)
	public Iterable<WorkplaceEntity> getAllWorkplacesForEmployee() {
		return workplaceService.getAllWorkplaces();
	}

	@GetMapping("/manager")
	@JsonView(Views.Manager.class)
	public Iterable<WorkplaceEntity> getAllWorkplacesForManager() {
		return workplaceService.getAllWorkplaces();
	}

	@GetMapping("/director")
	@JsonView(Views.Director.class)
	public Iterable<WorkplaceEntity> getAllWorkplacesForDirector() {
		return workplaceService.getAllWorkplaces();
	}

	@GetMapping("/{id}/employee")
	@JsonView(Views.Employee.class)
	public WorkplaceEntity getWorkplaceByIdForEmployee(@PathVariable String id) {
		return workplaceService.getWorkplaceById(id);
	}
	
	@GetMapping("/{id}/manager")
	@JsonView(Views.Manager.class)
	public WorkplaceEntity getWorkplaceByIdForManager(@PathVariable String id) {
		return workplaceService.getWorkplaceById(id);
	}
	
	@GetMapping("/{id}/director")
	@JsonView(Views.Director.class)
	public WorkplaceEntity getWorkplaceByIdForDirector(@PathVariable String id) {
		return workplaceService.getWorkplaceById(id);
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
