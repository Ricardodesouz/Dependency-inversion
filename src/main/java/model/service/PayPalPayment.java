package model.service;

import model.entities.Contratc;
import model.entities.Payment;



public class PayPalPayment implements ServicesPayment {

    private Integer months;

    public PayPalPayment( Integer months) {

        this.months = months;
    }

    @Override
    public void calcuclatePayment(Contratc contratc) {

        for (int i = 1; i <= months; i++) {
            double value = contratc.getPrice() / months;
            value += (value * 0.01) * i;
            Double valueWithTaxes = value + (value * 0.02);
            contratc.setPayments(new Payment(valueWithTaxes, contratc.getDate().plusMonths(i)));


        }


    }

}
