package service;

import medium.Medium;
import person.Customer;

import java.time.LocalDate;

public class Loan {
    private final Medium medium;
    private final Customer customer;
    private final LocalDate loanDate;
    private final LocalDate dueDate;
    private boolean returned;

    public Loan(Medium medium, Customer customer, LocalDate loanDate, LocalDate dueDate) {
        this.medium = medium;
        this.customer = customer;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returned = false;
    }

    public Medium getMedium() {
        return medium;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public boolean isOverdue(LocalDate today) {
        return !returned && today.isAfter(dueDate);
    }

    public void markAsReturned() {
        this.returned = true;
    }
}
