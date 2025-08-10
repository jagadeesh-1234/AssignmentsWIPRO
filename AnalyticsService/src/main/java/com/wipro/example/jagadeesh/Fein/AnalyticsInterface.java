package com.wipro.example.jagadeesh.Fein;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="quizserviceeur",path="/api/v1/quiz")
public interface AnalyticsInterface {


    @GetMapping("/")
    public long getCountQuiz();
}
