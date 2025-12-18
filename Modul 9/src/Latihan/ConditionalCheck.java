package Latihan;

public class ConditionalCheck {

    public static void main(String[] args) {
        ConditionalCheck app = new ConditionalCheck();

        System.out.println("=== TEST CASE ===");

        System.out.print("Test 1: ");
        app.checkAccess(600, 20000, true);

        System.out.print("Test 2: ");
        app.checkAccess(800, 50000, true);
    }

    public void checkAccess(int score, int income, boolean authorized) {
        if (isAccessDenied(score, income, authorized)) {
            reject();
        } else {
            accept();
        }
    }

    private boolean isAccessDenied(int score, int income, boolean authorized) {
        return (score <= 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000);
    }

    private void accept() {
        System.out.println("Access Accepted");
    }

    private void reject() {
        System.out.println("Access Rejected");
    }
}