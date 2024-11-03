package com.quiz.knowledge_test_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class PracticeQuestion {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long practiceQuestionId;
    @Column(nullable = false)
private  String question;
    @Column(nullable = false)
private  String answer;
    @Column(nullable = false)
    private  String type;



@ElementCollection
    @CollectionTable(name = "practiceQuestionOptions",joinColumns = @JoinColumn(name = "practiceQuestionId"))
    @Column(nullable = false)
    private List<String> options;

}
