package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sales.demo.model.FetchedUserStories;

public interface FetchedUserStoriesRepository extends JpaRepository<FetchedUserStories, Long> {
    // Get all user stories successfully fetched from Jira API
    List<FetchedUserStories> findAllByOrderByStoryTitleAsc();
    // Get user stories by title
    FetchedUserStories findByStoryTitle(String title);
    // Get user stories by assigned team member
    List<FetchedUserStories> findByAssignedTeamMember(String member);
    // Get user stories in real-time
    List<FetchedUserStories> findAllByOrderByTimeStampAsc();
}