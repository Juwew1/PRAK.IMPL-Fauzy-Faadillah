package Latihan;

public class ConditionalCheck {
    public void checkAccess(int score, int income, boolean authorized) {
        if ((score <= 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000)) {
            reject();
        } else {
            accept();
        }
    }

    private void accept() {
        System.out.println("Access Accepted");
    }

    private void reject() {
        System.out.println("Access Rejected");
    }
}

