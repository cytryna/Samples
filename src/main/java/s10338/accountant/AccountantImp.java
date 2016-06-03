package s10338.accountant;

/**
 * Created by rwichrowski on 03.06.16.
 */
public class AccountantImp implements Accountant {

    private Quest quest;

    public AccountantImp(Quest quest) {
        this.quest = quest;
    }

    public void execute() {
        quest.embark();
    }
}
