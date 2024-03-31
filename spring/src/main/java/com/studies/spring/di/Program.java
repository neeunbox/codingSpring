package com.studies.spring.di;

import com.studies.spring.di.ui.ExamConsole;
import com.studies.spring.di.ui.GridExamConsole;
import com.studies.spring.di.ui.InlineExamConsole;

public class Program {

    public static void main(String[] args) {
        
        Exam exam = new NewlecExam();
        // ExamConsole console = new InlineExamConsole(exam);
        ExamConsole console = new GridExamConsole();
        console.setExam(exam);
        console.print();

    }
}
