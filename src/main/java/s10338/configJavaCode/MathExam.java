package s10338.configJavaCode;

import org.springframework.stereotype.Component;

@Component
public class MathExam implements Exam {

    public void pass() {
        System.out.println("Student zdał egzamin z matematyki");
    }
}
