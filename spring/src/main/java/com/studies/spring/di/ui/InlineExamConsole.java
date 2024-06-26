package com.studies.spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.studies.spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

    private Exam exam;

    public InlineExamConsole() {
    }

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Autowired
    @Qualifier("exam2")
    @Override
    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("totla is %d, avg is %f\n", exam.total(), exam.avg());
    }

}
