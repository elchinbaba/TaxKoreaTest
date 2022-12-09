package Output;

import Customer.Customer;
import Rate.Rate;

import java.text.DecimalFormat;

public class Output {
    private void line() {
        line('-', 69);
    }
    private void line(char ch, int length) {
        for (int i = 0; i < length; i++)
            System.out.printf("%c", ch);
        System.out.println();
    }
    public void output(Customer[] customers) {
        System.out.println("                     수   도   요    금                           ");
        line();
        System.out.println("   번호    이름     구분    사용양    사용금액      TAX    납부액    비고   ");
        line();

        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            output(customer);
            System.out.println();
        }

        line();
    }

    public void output(Customer customer) {
        DecimalFormat df = new DecimalFormat("#,###");

        System.out.printf("   %s   %s  %s    %s    %s     %s   %s   %s",
                customer.getNumber(),
                customer.getName(),
                new Rate().getDivisionName(customer.getDivision()),
                String.format("%5.1f", customer.getUsage()),
                String.format("%6s", df.format(customer.getAmount())),
                String.format("%5s", df.format(customer.getTax())),
                String.format("%6s", df.format(customer.getTotal())),
                customer.getNote()
        );
    }
}