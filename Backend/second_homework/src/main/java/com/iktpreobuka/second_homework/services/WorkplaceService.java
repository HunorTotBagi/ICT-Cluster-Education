package com.iktpreobuka.second_homework.services;

import com.iktpreobuka.second_homework.entities.WorkplaceEntity;
import com.iktpreobuka.second_homework.entities.dto.WorkplaceDTO;

public interface WorkplaceService {
	public WorkplaceEntity createWorkplace(WorkplaceDTO workplaceDTOBody);

	public Iterable<WorkplaceEntity> getAllWorkplaces();

	public WorkplaceEntity getWorkplaceById(String id);

	public WorkplaceEntity updateWorkplace(String id, WorkplaceDTO workplaceDTOBody);

	public WorkplaceEntity deleteWorkplace(String id);
}
