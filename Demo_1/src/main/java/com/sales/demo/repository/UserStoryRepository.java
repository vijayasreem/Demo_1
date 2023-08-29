package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.demo.model.UserStory;

public interface UserStoryRepository extends JpaRepository<UserStory, Long> {
 
    List<UserStory> findAllByOrderByIdAsc();
    
    List<UserStory> findAllByOrderByTitleAsc();
    
    List<UserStory> findAllByOrderByDescriptionAsc();
    
    List<UserStory> findAllByOrderByAssignedTeamMemberAsc();
    
    List<UserStory> findUserStoriesByJiraAPI();
    
    List<UserStory> findUserStoriesInRealTime();
    
    List<UserStory> findUserStoriesByAcceptanceCriteria();
    
    List<UserStory> findUserStoriesByAcceptanceTesting();
    
    List<UserStory> findUserStoriesByDefinitionOfDone();
}