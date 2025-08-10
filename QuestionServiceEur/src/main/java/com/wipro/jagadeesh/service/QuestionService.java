package com.wipro.jagadeesh.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.wipro.jagadeesh.entities.Question;
import com.wipro.jagadeesh.entities.QuestionWrapper;
import com.wipro.jagadeesh.entities.Response;
import com.wipro.jagadeesh.enums.Category;
import com.wipro.jagadeesh.repos.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {
	
	private final QuestionRepository questionRepository;
//private final Environment environment;
	public List<Question> getQuestionsByCategory(Category category) {
		
           return questionRepository.findByCategory(category);

    }

    public Question addQuestion(Question question) {
        
        return questionRepository.save(question);
    }

	public List<Integer> getQuestionsForQuiz(String category, String difficultyLevel) {
		List<Integer> questions = questionRepository.findRandomQuestionsByCategoryAndLevel(category,difficultyLevel);
		return questions;
	}

	public List<QuestionWrapper> getQuestionforQuizbyQuizIdService(List<Integer> questionIds) {
		List<QuestionWrapper> wrappers = new ArrayList<>();
		List<Question> questions = new ArrayList<>();
		for(Integer id:questionIds) {
			questions.add(questionRepository.findById(id.longValue()).orElseThrow()); }
			
		for(Question question:questions) {
			QuestionWrapper wrapper = new QuestionWrapper();
			wrapper.setId(question.getQuestionID());
			wrapper.setQuestionTitle(question.getQuestionTitle());
			wrapper.setOption1(question.getOption1());
			wrapper.setOption2(question.getOption2());
			wrapper.setOption3(question.getOption3());
			wrappers.add(wrapper);
		}	
			return(wrappers);
			
		}
	
public Integer calculateUserScore(List<Response> responses) {
		
		int rightAnswers=0;
		
		for(Response response:responses)
		{
			Question questions =questionRepository.findById(Long.valueOf(response.getId())).orElseThrow();
			if (questions.getCorrectAnswer().equals(response.getResponse())) {
			    rightAnswers++;
			}

			
		}
		
		return (rightAnswers);
		
	}
	
	}
