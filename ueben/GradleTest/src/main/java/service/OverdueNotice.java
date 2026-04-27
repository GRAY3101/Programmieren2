package service;

import java.time.LocalDate;

public class OverdueNotice {
    private final Loan loan;
    private final LocalDate sentOn;
    private final double fee;

    public OverdueNotice(Loan loan, LocalDate sentOn, double fee) {
        this.loan = loan;
        this.sentOn = sentOn;
        this.fee = fee;
    }

    public Loan getLoan() {
        return loan;
    }

    public LocalDate getSentOn() {
        return sentOn;
    }

    public double getFee() {
        return fee;
    }
}
