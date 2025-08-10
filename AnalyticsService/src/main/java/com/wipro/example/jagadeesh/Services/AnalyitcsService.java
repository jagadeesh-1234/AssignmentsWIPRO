package com.wipro.example.jagadeesh.Services;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.wipro.example.jagadeesh.Entities.QuizsCount;
import com.wipro.example.jagadeesh.Fein.AnalyticsInterface;
import com.wipro.example.jagadeesh.Repo.AnalyticsRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@EnableFeignClients
public class AnalyitcsService {
	
	private final AnalyticsInterface analyticsInterface;
	private final AnalyticsRepository analyticsRepository;
	
	public Long getCountofQuizzes() {
	    Long count = analyticsInterface.getCountQuiz();

	    QuizsCount quizCount = new QuizsCount();
	    quizCount.setNoOfQuiz(count); 
	    analyticsRepository.save(quizCount); 

	    return count; 
	}

}
