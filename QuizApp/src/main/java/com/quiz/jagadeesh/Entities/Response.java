package com.quiz.jagadeesh.Entities;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Response {
		private Long id;
		private String userAnswer;
}
