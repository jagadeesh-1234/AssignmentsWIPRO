package com.wipro.jagadeesh.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jagadeesh.entities.Question;
import com.wipro.jagadeesh.entities.QuestionWrapper;
import com.wipro.jagadeesh.entities.Response;
import com.wipro.jagadeesh.enums.Category;
import com.wipro.jagadeesh.service.QuestionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/question")
@RequiredArgsConstructor
public class QuestionController {

	
	private final QuestionService questionService;


	
    @GetMapping("/category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable Category category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("/add")
    public Question addQuestion(@RequestBody Question question){
        return  questionService.addQuestion(question);
    }
    
    @GetMapping("/generateQuestionsForQuiz")
   public List<Integer> GetQuestionsForQuiz(@RequestParam String category,@RequestParam String difficultyLevel ){
    	return questionService.getQuestionsForQuiz(category, difficultyLevel);
    }

    @PostMapping("/getQuestion")
    public List<QuestionWrapper> getQuestionsforQuizbyQuizId(@RequestBody List<Integer> questionIds){
    	return questionService.getQuestionforQuizbyQuizIdService(questionIds);
    }
	
    @PostMapping("/getScore")
    public Integer getScoreQuiz(@RequestBody List<Response> responses) {
    	return questionService.calculateUserScore(responses);
    }
	
}
