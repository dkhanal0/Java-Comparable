package comparable;

import java.util.Comparator;

public abstract class Account implements Comparable<Account> {

    // Start with the code from the previous assignment, then modify as necessary
    private String accountNumber;
    private Customer customer;
    private double balance;

    // A constructor that initializes the account number and Customer, and sets the balance to zero.
    public Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0;
    }

    // getAccountNumber() - Returns a String representing the account number.
    public String getAccountNumber() {
        return this.accountNumber;
    }

    // getCustomer() - Returns a reference to the Customer object associated with this account
    public Customer getCustomer() {
        return this.customer;
    }

    // getBalance() - Returns the available balance (may be a decimal value).
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int compareTo(Account account) {
        int accCompare =accountNumber.compareTo(account.getAccountNumber());
        if (accCompare < 0) {
            return -1;
        } else if (accCompare > 0) {
            return 1;
        } else {
            return 0;
        }
        //return accCompare;
        }
    }

