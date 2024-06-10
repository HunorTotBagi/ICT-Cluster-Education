package com.iktpreobuka.second_homework.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.iktpreobuka.second_homework.entities.UserEntity;
import com.iktpreobuka.second_homework.entities.WorkplaceEntity;
import com.iktpreobuka.second_homework.entities.dto.WorkplaceDTO;
import com.iktpreobuka.second_homework.repositories.UserRepository;
import com.iktpreobuka.second_homework.repositories.WorkplaceRepository;
import com.iktpreobuka.second_homework.services.WorkplaceService;

public class WorkplaceServiceImpl implements WorkplaceService {

	@Autowired
	private WorkplaceRepository workplaceRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public WorkplaceEntity createWorkplace(WorkplaceDTO workplaceDTOBody) {
		WorkplaceEntity workplace = new WorkplaceEntity();
		workplace.setName(workplaceDTOBody.getName());
		UserEntity user = userRepository.findById(workplaceDTOBody.getUserId()).get();
		workplace.setUser(user);
		return workplaceRepository.save(workplace);
	}

	@Override
	public Iterable<WorkplaceEntity> getAllWorkplaces() {
		return workplaceRepository.findAll();
	}

	@Override
	public WorkplaceEntity getWorkplaceById(String id) {
		return workplaceRepository.findById(Integer.parseInt(id)).get();
	}

	@Override
	public WorkplaceEntity updateWorkplace(String id, WorkplaceDTO workplaceDTOBody) {
		WorkplaceEntity workplace = workplaceRepository.findById(Integer.parseInt(id)).get();
		if (workplace != null) {
			workplace.setName(workplaceDTOBody.getName());
			UserEntity user = userRepository.findById(workplaceDTOBody.getUserId()).get();
			workplace.setUser(user);
			workplaceRepository.save(workplace);
			return workplace;
		}
		return new WorkplaceEntity();
	}

	@Override
	public WorkplaceEntity deleteWorkplace(String id) {
		WorkplaceEntity workplace = workplaceRepository.findById(Integer.parseInt(id)).get();
		if (workplace != null) {
			workplaceRepository.delete(workplace);
			return workplace;
		}
		return new WorkplaceEntity();
	}
}
