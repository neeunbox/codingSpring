package com.studies.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studies.spring.di.ui.ExamConsole;

public class Program {

    public static void main(String[] args) {

        /* 스프링에게 지시하는 방법으로 코드를 변경
        Exam exam = new NewlecExam();
        Exam exam = new NewlecExam(10, 10, 10, 10);
        ExamConsole console = new GridExamConsole();

        console.setExam(exam);
         */

         ApplicationContext context = new ClassPathXmlApplicationContext("setting.xml");

        //  ExamConsole console = (ExamConsole) context.getBean("console");
        ExamConsole console = context.getBean(ExamConsole.class);
         console.print();

    }
}
