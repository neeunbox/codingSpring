package com.studies.spring.di;

import com.studies.spring.di.entity.Exam;
import com.studies.spring.di.entity.NewlecExam;
import com.studies.spring.di.ui.ExamConsole;
import com.studies.spring.di.ui.GridExamConsole;

public class Program {

    public static void main(String[] args) {
        
        Exam exam = new NewlecExam();
        ExamConsole console = new GridExamConsole();

        console.setExam(exam);
        
        console.print();

    }
}
