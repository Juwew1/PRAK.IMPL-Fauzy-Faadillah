
public void validateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) throws Exception {
    if (request.CustomerProduct.ProductNumber != null && !request.CustomerProduct.ProductNumber.isEmpty() && request.Customer.CustomerID != null && !request.Customer.CustomerID.isEmpty()) {
        throw new Exception("InvalidBothParameterMessage");
    }
    if ((request.Customer.CustomerID == null || request.Customer.CustomerID.isEmpty()) && (request.CustomerProduct.ProductNumber == null || request.CustomerProduct.ProductNumber.isEmpty())) {
        throw new Exception("CustomerEmptyMessage");
    }

}