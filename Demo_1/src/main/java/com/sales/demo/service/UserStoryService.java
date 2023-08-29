package com.sales.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.UserStory;
import com.sales.demo.repository.UserStoryRepository;

@Service
public class UserStoryService {

    @Autowired
    private UserStoryRepository userStoryRepository;
    
    public List<UserStory> findAllByOrderByIdAsc(){
        return userStoryRepository.findAllByOrderByIdAsc();
    }
    
    public List<UserStory> findAllByOrderByTitleAsc(){
        return userStoryRepository.findAllByOrderByTitleAsc();
    }
    
    public List<UserStory> findAllByOrderByDescriptionAsc(){
        return userStoryRepository.findAllByOrderByDescriptionAsc();
    }
    
    public List<UserStory> findAllByOrderByAssignedTeamMemberAsc(){
        return userStoryRepository.findAllByOrderByAssignedTeamMemberAsc();
    }
    
    public List<UserStory> findUserStoriesByJiraAPI(){
        return userStoryRepository.findUserStoriesByJiraAPI();
    }
    
    public List<UserStory> findUserStoriesInRealTime(){
        return userStoryRepository.findUserStoriesInRealTime();
    }
    
    public List<UserStory> findUserStoriesByAcceptanceCriteria(){
        return userStoryRepository.findUserStoriesByAcceptanceCriteria();
    }
    
    public List<UserStory> findUserStoriesByAcceptanceTesting(){
        return userStoryRepository.findUserStoriesByAcceptanceTesting();
    }
    
    public List<UserStory> findUserStoriesByDefinitionOfDone(){
        return userStoryRepository.findUserStoriesByDefinitionOfDone();
    }
}