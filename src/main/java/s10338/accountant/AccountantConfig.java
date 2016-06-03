package s10338.accountant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountantConfig {

  @Bean
  public Accountant knight() {
    return new AccountantImp(quest());
  }
  
  @Bean
  public Quest quest() {
    return new CalculateTaxQuest();
  }

}
