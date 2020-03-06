package comparable;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {
    // Start with the code from the previous assignment, then modify as needed
    private String lastName;
    private String firstName;
    private String streetAddress;
    private String zipCode;
    private Account account;

    //    A constructor that initializes the last name, first name, address, and zip code.
    public Customer(String lastName, String firstName, String streetAddress, String zipCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    //    getLastName() - Returns a String that is the customer’s last name
    public String getLastName() {
        return this.lastName;
    }

    //    getFirstName() - Returns a String that is the customer’s first name
    public String getFirstName() {
        return this.firstName;
    }

    //    getStreetAddress() - Returns a String indicating the customer’s street address
    public String getStreetAddress() {
        return this.streetAddress;
    }

    //    getZipCode() - Returns a String indicating the customer’s zip code
    public String getZipCode() {
        return this.zipCode;
    }

    //    setAccount(Account a) - Sets the Account for this customer
    public void setAccount(Account account) {
        this.account = account;
    }

    //    getAccount() - Returns a reference to the Account object associated with this customer
    public Account getAccount() {
        return this.account;
    }

    // Method required by the interface
    @Override
    public int compareTo(Customer cust) {
        int lastCompare = lastName.compareTo(cust.getLastName());
        int firstCompare = firstName.compareTo(cust.getFirstName());
        int accCompare = account.compareTo(cust.getAccount());

        //same last name
        if (lastCompare < 0) {
            return -1;
        }else if (lastCompare > 0) {
            return 1;
        }
        // same first name
        if (firstCompare < 0) {
            return -1;
        }else if (firstCompare > 0) {
            return 1;
        }
        // same last and first name
        if (accCompare < 0) {
            return -1;
        }else if (accCompare > 0) {
            return 1;
        }else{
            return 0;
        }

//        if (lastCompare != 0) {
//            //last names differ
//            return lastCompare;
//        }
//        // same last name
//           else if (firstCompare!=0){
//               return firstCompare;
//           }else{
//
//               return accCompare;
//           }
        //last names differ

        //same last and first name
//        if (this.lastName.compareTo(cust.getLastName()) != 0) {
//            return this.lastName.compareTo(cust.getLastName());
//        } else if (this.firstName.compareTo(cust.getFirstName()) != 0) {
//            return (this.firstName.compareTo(cust.getFirstName()));
//        } else {
//            return this.account.compareTo(cust.getAccount());
//                }
            }
        }









