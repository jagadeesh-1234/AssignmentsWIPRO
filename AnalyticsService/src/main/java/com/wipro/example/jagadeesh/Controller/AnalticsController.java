package com.wipro.example.jagadeesh.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wipro.example.jagadeesh.Services.AnalyitcsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/analytics")
public class AnalticsController {
	
	private final AnalyitcsService analyticsService;
	
	@GetMapping("/getCount")
	public Long getCountOfQuizzes() {
		return analyticsService.getCountofQuizzes();
	}

}
