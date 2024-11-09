package com.quiz.knowledge_test_backend.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class CertificateQuestion {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false)
    private  Long certificateQuestionId;

@Column(nullable = false)
    private  String question;
    @Column(nullable = false)
    private String answer;
    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private  String optionA;

    @Column(nullable = false)
    private  String optionB;
    @Column(nullable = false)
    private  String optionC;
    @Column(nullable = false)
    private  String optionD;






}
