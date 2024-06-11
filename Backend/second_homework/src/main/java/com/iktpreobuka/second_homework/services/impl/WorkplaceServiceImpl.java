package com.iktpreobuka.second_homework.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iktpreobuka.second_homework.entities.UserEntity;
import com.iktpreobuka.second_homework.entities.WorkplaceEntity;
import com.iktpreobuka.second_homework.entities.dto.WorkplaceDTO;
import com.iktpreobuka.second_homework.repositories.UserRepository;
import com.iktpreobuka.second_homework.repositories.WorkplaceRepository;
import com.iktpreobuka.second_homework.services.WorkplaceService;

@Service
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
		try {
			int workplaceId = Integer.parseInt(id);
			return workplaceRepository.findById(workplaceId).get();
		} catch (NumberFormatException e) {
			return new WorkplaceEntity();
		}
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
