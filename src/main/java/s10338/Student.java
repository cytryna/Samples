package s10338;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student implements Person {
    private Exam exam;

    @Autowired
    public Student(Exam exam) {
        this.exam = exam;
    }

    public void pass() {
        exam.pass();
    }
}
