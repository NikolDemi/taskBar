package com.geekbrains.service.impl;

import com.geekbrains.domain.Project;
import com.geekbrains.repo.ProjectRepository;
import com.geekbrains.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends ServiceImpl<Project, Long> implements ProjectService {

    @Autowired
    private ProjectRepository repository;

    @Override
    PagingAndSortingRepository<Project, Long> getRepository() {
        return repository;
    }

    @Override
    public List<Project> getAllBySupervisorUsername(String username) {
        return repository.findAllBySupervisorUsername(username);
    }
}
