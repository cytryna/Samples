package s10338.accountant;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountMain {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "META-INF/spring/account.xml");
        Accountant accountant = context.getBean(Accountant.class);
        accountant.execute();
        context.close();
    }
}
