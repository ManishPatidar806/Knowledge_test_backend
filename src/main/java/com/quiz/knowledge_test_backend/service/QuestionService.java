package com.quiz.knowledge_test_backend.service;

import com.quiz.knowledge_test_backend.entity.CertificateQuestion;
import com.quiz.knowledge_test_backend.entity.PracticeQuestion;

import com.quiz.knowledge_test_backend.repository.CertificateQuestionRepository;
import com.quiz.knowledge_test_backend.repository.PracticeQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {

    @Autowired
    PracticeQuestionRepository questionRepository;
    @Autowired
    CertificateQuestionRepository certificateQuestionRepository;
/*
* For Practice Question
* */
    public List<PracticeQuestion> getPracticeQuestion(String type){
        System.out.println(type);
        return questionRepository.findPracticeQuestionBy(type);
    }

    public PracticeQuestion savePracticeQuestion(PracticeQuestion question){

       return questionRepository.save(question);
    }

    public List<PracticeQuestion> saveAllPracticeQuestion(List<PracticeQuestion> question){

        return questionRepository.saveAll(question);
    }
/*
* For Certificate Question
* */

    public List<CertificateQuestion> getCertificateQuestion(String type){
        return certificateQuestionRepository.findCertificateQuestion(type);
    }

    public CertificateQuestion saveCertificateQuestion(CertificateQuestion question){

        return certificateQuestionRepository.save(question);
    }

    public List<CertificateQuestion> saveAllCertificateQuestion(List<CertificateQuestion> question){

        return certificateQuestionRepository.saveAll(question);
    }

}
