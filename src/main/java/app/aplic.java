package app;

import model.entities.Contratc;
import model.service.PayPalPayment;
import model.service.ServicesPayment;

import java.time.LocalDate;

public class aplic {
    public static void main(String[] args){
       int number = 22;
       double value = 8000;
       LocalDate date = LocalDate.parse("2024-03-26");
       Contratc contract = new Contratc(number, value, date);
        int months = 45;

        ServicesPayment sp = new PayPalPayment(months);
        sp.calcuclatePayment(contract);

        System.out.print(contract.toString());





    }
}
