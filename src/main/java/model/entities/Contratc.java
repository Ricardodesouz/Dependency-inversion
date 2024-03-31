package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



public class Contratc {
   private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
   private Integer number;
   private Double price;
   private LocalDate date;
   private List<Payment> payments = new ArrayList<>();

    public Contratc(Integer number, Double price, LocalDate date) {
        this.number = number;
        this.price = price;
        this.date = date;
    }
    public Integer getNumber(){
        return number;

    }
    public void setNumber(Integer number){
        this.number = number;

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date= date;
    }

    public void setPayments(Payment payment){
       payments.add(payment);
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("o contrato de numero ");
        sb.append(getNumber());
        sb.append(" feito no dia ");
        sb.append(getDate().format(fmt));
        sb.append(" com o valor ");
        sb.append(getPrice());
        sb.append(" com as seguites parcelas:"+"\n");
        for(Payment pay: payments){
            sb.append(pay.toString());
            sb.append("\n");
        }

        return sb.toString();

    }
}
