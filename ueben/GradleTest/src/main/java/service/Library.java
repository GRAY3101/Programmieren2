package service;

import utils.DateUtil;
import medium.Medium;
import person.Customer;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<Medium> media = new ArrayList<>();
    private final List<Customer> customers = new ArrayList<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addMedium(Medium medium) {
        media.add(medium);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Very simplified loan logic:
     * always creates a new loan for 14 days from today.
     */
    public Loan loanMediumToCustomer(Medium medium, Customer customer) {
        Loan loan = new Loan(
                medium,
                customer,
                DateUtil.today(),
                DateUtil.inDays(14)
        );
        loans.add(loan);
        return loan;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
