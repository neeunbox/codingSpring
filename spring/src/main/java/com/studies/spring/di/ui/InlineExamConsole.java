package com.studies.spring.di.ui;

import com.studies.spring.di.Exam;

public class InlineExamConsole implements ExamConsole {

    
    private Exam exam;

    public InlineExamConsole(Exam exam) {
        this.exam = exam;
    }


    @Override
    public void print() {
        System.out.printf("totla is %d, avg is %f\n", exam.total(), exam.avg());
    }

}
