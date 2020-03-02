package comparable;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

// No changes are required for this class

public class XmlReader {
    private final String inputFileName;
    private XmlHandler myXmlHandler = null;
    private Customer[] customers;

    public XmlReader(String inputFileName) {
        this.inputFileName = inputFileName;

        try {
            // Declare a File object
            File inputFile = new File(inputFileName);

            // Create a SAX parser factory and parser
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            // Create an XML handler
            myXmlHandler = new XmlHandler();

            // Parse the file
            saxParser.parse(inputFile, myXmlHandler);

        } catch (Exception e) {

            System.out.println("Exception: " + e.getMessage());

        }
    }

    public Customer[] getCustomers(){
        // Get the ArrayList of Customers built by the handler and return an array
        Customer[] CustomerArray = new Customer[myXmlHandler.getCustomers().size()];
        CustomerArray = myXmlHandler.getCustomers().toArray(CustomerArray);
    return CustomerArray;
    }
}
