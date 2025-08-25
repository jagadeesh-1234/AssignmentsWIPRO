package com.quiz.jagadeesh.Services;

import java.util.List;

import com.quiz.jagadeesh.Entities.QuestionWrapper;
import com.quiz.jagadeesh.Entities.Quiz;
import com.quiz.jagadeesh.Entities.Response;

public interface QuizServices {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Integer id);

	String calculateResult(Integer id, List<Response> responses);

	

	


	

}
