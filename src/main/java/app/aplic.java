package app;

import model.entities.Contratc;
import model.service.PayPalPayment;
import model.service.ServicesPayment;

import java.time.LocalDate;

public class aplic {
    public static void main(String[] args){
       int number = 12;
       double value = 600;
       LocalDate date = LocalDate.parse("2024-03-26");
       Contratc contract = new Contratc(number, value, date);
        int month = 3;

        ServicesPayment sp = new PayPalPayment(month);
        sp.calcuclatePayment(contract);

        System.out.print(contract.toString());





    }
}
