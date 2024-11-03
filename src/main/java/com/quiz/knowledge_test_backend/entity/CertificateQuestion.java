package com.quiz.knowledge_test_backend.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CertificateQuestion {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long certificateQuestionId;

@Column(nullable = false)
    private  String question;
    @Column(nullable = false)
    private String answer;
    @Column(nullable = false)
    private String type;

    @ElementCollection
    @CollectionTable(name = "certificateQuestionOption" , joinColumns = @JoinColumn(name = "certificateQuestionId"))
    @Column(nullable = false)
   private List<String>options;




}
