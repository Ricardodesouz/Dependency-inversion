package model.service;

import model.entities.Contratc;
import model.entities.Payment;



public class PayPalPayment implements ServicesPayment {

    private Integer month;

    public PayPalPayment( Integer month) {

        this.month = month;
    }

    @Override
    public void calcuclatePayment(Contratc contratc) {

        for (int i = 1; i <= month; i++) {
            double value = contratc.getPrice() / month;
            value += (value * 0.01) * i;
            Double valueWithAmount = value + (value * 0.02);
            contratc.setPayments(new Payment(valueWithAmount, contratc.getDate().plusMonths(i)));


        }


    }

}
