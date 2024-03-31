package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Payment {
    private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private Double value;
    private LocalDate payMoth;

    public Payment(Double value, LocalDate payMoth) {
        this.value = value;
        this.payMoth = payMoth;
    }

    public Double getValue() {
        return value;
    }

    public LocalDate getPayMoth() {
        return payMoth;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Data de pagamento:");
        sb.append(getPayMoth().format(fmt));
        sb.append(" valor com taxas e juros: ");
        sb.append(String.format("%.2f", getValue()));
        return sb.toString();
    }
}
