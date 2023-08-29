package com.sales.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.FetchedUserStories;
import com.sales.demo.repository.FetchedUserStoriesRepository;

@Service
public class FetchedUserStoriesService {

    @Autowired
    private FetchedUserStoriesRepository fetchedUserStoriesRepository;

    // Get all user stories successfully fetched from Jira API
    public List<FetchedUserStories> getAllUserStories(){
        return fetchedUserStoriesRepository.findAllByOrderByStoryTitleAsc();
    }

    // Get user stories by title
    public FetchedUserStories getUserStoriesByTitle(String title){
        return fetchedUserStoriesRepository.findByStoryTitle(title);
    }

    // Get user stories by assigned team member
    public List<FetchedUserStories> getUserStoriesByAssignedTeamMember(String member){
        return fetchedUserStoriesRepository.findByAssignedTeamMember(member);
    }

    // Get user stories in real-time
    public List<FetchedUserStories> getUserStoriesInRealTime(){
        return fetchedUserStoriesRepository.findAllByOrderByTimeStampAsc();
    }

}