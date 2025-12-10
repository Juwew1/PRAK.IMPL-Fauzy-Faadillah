package Latihan;

class CustomerInquiryRequest {
    public CustomerProduct customerProduct = new CustomerProduct();
    public Customer customer = new Customer();
}

class CustomerProduct {
    public String productNumber = "";
}

class Customer {
    public String customerID = "";
}

public class RequestValidator {

    public void validateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) throws Exception {
        validateSearchCriteria(request);
        validateAndFormatCustomerID(request, customerFieldLength);
        validateAndFormatProductNumber(request, productFieldLength);
        System.out.println("Validasi Berhasil.");
    }

    private void validateSearchCriteria(CustomerInquiryRequest request) throws Exception {
        boolean hasCustomer = isPresent(request.customer.customerID);
        boolean hasProduct = isPresent(request.customerProduct.productNumber);

        if (hasCustomer && hasProduct) {
            throw new Exception("InvalidBothParameterMessage");
        }

        if (!hasCustomer && !hasProduct) {
            throw new Exception("CustomerEmptyMessage");
        }
    }

    private void validateAndFormatCustomerID(CustomerInquiryRequest request, int length) throws Exception {
        if (isPresent(request.customer.customerID)) {
            if (request.customer.customerID.length() > length) {
                throw new Exception("CustomerInvalidLengthMessage");
            }
            request.customer.customerID = padString(request.customer.customerID, length);
        }
    }

    private void validateAndFormatProductNumber(CustomerInquiryRequest request, int length) throws Exception {
        if (isPresent(request.customerProduct.productNumber)) {
            if (request.customerProduct.productNumber.length() > length) {
                throw new Exception("ProductInvalidLengthMessage");
            }
            request.customerProduct.productNumber = padString(request.customerProduct.productNumber, length);
        }
    }

    private boolean isPresent(String value) {
        return value != null && !value.isEmpty();
    }

    private String padString(String value, int length) {
        return String.format("%" + length + "s", value).replace(' ', '0');
    }
}