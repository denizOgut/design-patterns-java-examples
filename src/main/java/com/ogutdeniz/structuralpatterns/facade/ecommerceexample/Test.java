package com.ogutdeniz.structuralpatterns.facade.ecommerceexample;

public class Test {
    public static void main(String[] args) {
        VendorAPIFacade vendorAPIFacade = new VendorAPIFacade();

        // fetch product info from all vendors
        vendorAPIFacade.getProductInfo("product123");

        // place order on all vendors
        vendorAPIFacade.placeOrder("product456", 2);

        // handle payment on all vendors
        vendorAPIFacade.handlePayment("order789", 50.0);
    }
}
