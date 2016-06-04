package s10338.aop;


import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class SomethingBeforeMethod implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        System.out.println("SomethingBeforeMethod");
    }
}