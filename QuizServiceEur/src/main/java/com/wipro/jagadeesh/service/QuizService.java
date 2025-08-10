package com.wipro.jagadeesh.service;
import java.util.List;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.wipro.jagadeesh.Fein.QuizInterface;
import com.wipro.jagadeesh.entities.QuestionWrapper;
import com.wipro.jagadeesh.entities.Quiz;
import com.wipro.jagadeesh.entities.Response;
import com.wipro.jagadeesh.repos.QuizRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@EnableFeignClients
public class QuizService {

	private final QuizRepository quizRepository;
	private final QuizInterface quizInterface;
	
	public Quiz createQuiz(String category, String level,  String title) {
		
		List<Integer> questionIdsForQuiz = quizInterface.getQuestionsForQuiz(category,level);
	    Quiz quiz = new Quiz();
	    quiz.setTitle(title);
	    quiz.setQuestionIds(questionIdsForQuiz);
	    
	    return quizRepository.save(quiz);

	}

	public List<QuestionWrapper> getQuizQuestions(Integer id) {
		Quiz quiz = quizRepository.findById(id).orElseThrow();
	List<Integer> questionIds = quiz.getQuestionIds();
	return quizInterface.getQuestionsforQuizbyQuizId(questionIds);
	
	
	}
	
	public Integer calulateResult(Integer id, List<Response> responses) {
		return quizInterface.getScoreQuiz(responses);
	}

	public long getCountQuiz() {
		return quizRepository.count();
	}
	
}

