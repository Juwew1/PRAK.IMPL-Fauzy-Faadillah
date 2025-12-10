package Latihan;

public class Main {
    public static void main(String[] args) {
        System.out.println("===  MODUL 9 ===\n");

        System.out.println("[1] Tes Refactoring Class (Person)");
        Person person = new Person();
        person.setName("Bob Smith");
        System.out.println("Output Name: " + person.getName());
        System.out.println("--------------------------------------------------");

        System.out.println("[2] Tes Refactoring Conditional (Check Access)");
        ConditionalCheck checker = new ConditionalCheck();

        System.out.print("Test Case 1 (Lolos): ");
        checker.checkAccess(600, 150000, true);

        System.out.print("Test Case 2 (Ditolak): ");
        checker.checkAccess(600, 20000, true);
        System.out.println("--------------------------------------------------");

        System.out.println("[3] Tes Refactoring Method (RequestValidator)");
        RequestValidator validator = new RequestValidator();

        try {
            System.out.println("\n--- Skenario 1: Input Valid (Customer ID) ---");
            CustomerInquiryRequest req1 = new CustomerInquiryRequest();
            req1.customer.customerID = "123";
            req1.customerProduct.productNumber = "";

            validator.validateRequest(req1, 5, 5);
            System.out.println("Hasil Customer ID: " + req1.customer.customerID);
        } catch (Exception e) {
            System.out.println("Error Skenario 1: " + e.getMessage());
        }

        try {
            System.out.println("\n--- Skenario 2: Input Valid (Product Number) ---");
            CustomerInquiryRequest req2 = new CustomerInquiryRequest();
            req2.customer.customerID = "";
            req2.customerProduct.productNumber = "99";

            validator.validateRequest(req2, 5, 5);
            System.out.println("Hasil Product Num: " + req2.customerProduct.productNumber);
        } catch (Exception e) {
            System.out.println("Error Skenario 2: " + e.getMessage());
        }

        try {
            System.out.println("\n--- Skenario 3: Input Invalid (Keduanya Kosong) ---");
            CustomerInquiryRequest req3 = new CustomerInquiryRequest();
            req3.customer.customerID = "";
            req3.customerProduct.productNumber = "";

            validator.validateRequest(req3, 5, 5);
        } catch (Exception e) {
            System.out.println("Tangkap Error Skenario 3: " + e.getMessage());
        }

        try {
            System.out.println("\n--- Skenario 4: Input Invalid (Keduanya Terisi) ---");
            CustomerInquiryRequest req4 = new CustomerInquiryRequest();
            req4.customer.customerID = "123";
            req4.customerProduct.productNumber = "999";

            validator.validateRequest(req4, 5, 5);
        } catch (Exception e) {
            System.out.println("Tangkap Error Skenario 4: " + e.getMessage());
        }
    }
}