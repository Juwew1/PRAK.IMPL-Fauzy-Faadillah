//package Latihan;
//
//public class RequestValidator {
//
//    public void validateRequest(CustomerInquiryRequest request, int customerFieldLength, int productFieldLength) throws Exception {
//        checkCustomerInquiryNotNullOrEmpty(request);
//        checkCustomerInquiryNullOrEmpty(request);
//        checkCustomerIDValid(request, customerFieldLength);
//        checkProductNumberValid(request, productFieldLength);
//        System.out.println("Validasi Berhasil.");
//    }
//
//    private void checkCustomerInquiryNotNullOrEmpty(CustomerInquiryRequest request) throws Exception {
//        if (request.CustomerProduct.ProductNumber != null && !request.CustomerProduct.ProductNumber.isEmpty() &&
//                request.Customer.CustomerID != null && !request.Customer.CustomerID.isEmpty()) {
//            throw new Exception("InvalidBothParameterMessage");
//        }
//    }
//
//    private void checkCustomerInquiryNullOrEmpty(CustomerInquiryRequest request) throws Exception {
//        if ((request.Customer.CustomerID == null || request.Customer.CustomerID.isEmpty()) &&
//                (request.CustomerProduct.ProductNumber == null || request.CustomerProduct.ProductNumber.isEmpty())) {
//            throw new Exception("CustomerEmptyMessage");
//        }
//    }
//
//    private void checkCustomerIDValid(CustomerInquiryRequest request, int length) throws Exception {
//        if (request.Customer.CustomerID != null && request.Customer.CustomerID.length() > length) {
//            throw new Exception("CustomerInvalidLengthMessage");
//        }
//        // Logic formatting dipindah ke sini
//        if (request.Customer.CustomerID != null) {
//            request.Customer.CustomerID = String.format("%" + length + "s", request.Customer.CustomerID).replace(' ', '0');
//        }
//    }
//
//    private void checkProductNumberValid(CustomerInquiryRequest request, int length) throws Exception {
//        if (request.CustomerProduct.ProductNumber != null && request.CustomerProduct.ProductNumber.length() > length) {
//            throw new Exception("ProductInvalidLengthMessage");
//        }
//        if (request.CustomerProduct.ProductNumber != null) {
//            request.CustomerProduct.ProductNumber = String.format("%" + length + "s", request.CustomerProduct.ProductNumber).replace(' ', '0');
//        }
//    }
//}