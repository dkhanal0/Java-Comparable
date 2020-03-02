package comparable;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class XmlHandler extends DefaultHandler {

    private ArrayList<Customer> customers = new ArrayList<Customer>();  // ArrayList of all Customers
    private Customer currentCustomer; // Reference to the current Customer being processed
    private Account currentAccount; // Reference to the current Account being processed

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        System.out.println("Start element:" + qName);

            // Handle the customer element
            // Get attribute values
            // Instantiate the currentCustomer

            // Handle account element
            // Get attribute values
            // Determine account type and instantiate currentAccount
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End element:" + qName);

            // Handle customer element
            // Add currentCustomer to list of custoemers

            // Handle account element
            // Associate currentAccount with currentCustomer
    }

    // Return a reference to array list
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}


