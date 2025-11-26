package LatihanCleanCode;

import java.util.Date;

class Customer {

    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";

    public Customer(Date generationTimestamp, Date modificationTimestamp) {
        this.generationTimestamp = new Date();
        this.modificationTimestamp = new Date();
    }

    public Date getGenerationTimestamp() { return generationTimestamp; }
    public String getRecordIdentifier() { return recordId; }

    public static void main(String[] args) {
        Customer cust = new Customer(new Date(), null);
        System.out.println("ID Record: " + cust.getRecordIdentifier());
    }
}
