package com.sales.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.model.FetchedUserStories;
import com.sales.demo.service.FetchedUserStoriesService;

@RestController
@RequestMapping("/userstories")
public class FetchedUserStoriesController {

    @Autowired
    private FetchedUserStoriesService fetchedUserStoriesService;

    // Get all user stories successfully fetched from Jira API
    @GetMapping("/all")
    public List<FetchedUserStories> getAllUserStories(){
        return fetchedUserStoriesService.getAllUserStories();
    }

    // Get user stories by title
    @GetMapping("/title")
    public FetchedUserStories getUserStoriesByTitle(@RequestParam("storytitle") String title){
        return fetchedUserStoriesService.getUserStoriesByTitle(title);
    }

    // Get user stories by assigned team member
    @GetMapping("/member")
    public List<FetchedUserStories> getUserStoriesByAssignedTeamMember(@RequestParam("member") String member){
        return fetchedUserStoriesService.getUserStoriesByAssignedTeamMember(member);
    }

    // Get user stories in real-time
    @GetMapping("/real-time")
    public List<FetchedUserStories> getUserStoriesInRealTime(){
        return fetchedUserStoriesService.getUserStoriesInRealTime();
    }
}