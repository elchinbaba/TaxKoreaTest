import Input.Input;
import Compute.Compute;
import Output.Output;
import Customer.Customer;

import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Customer[] customers = Customer.convertInputToCustomer(Input.CUSTOMERS);

        new Compute().computeCostumer(customers).sortByTotal(customers);

        new Output().output(customers);
    }
}
