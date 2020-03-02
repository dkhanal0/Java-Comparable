# CSC 241 Comparable Interface

In this assignment, we will modify our XML file reader so that it can build a collection of
Customer objects. In addition, we will introduce the Comparable interface
into two classes. We will again use the Java Simple API 
for XML, or Java SAX, to read and process our XML input file. This provides 
you additional opportunities to work with event driven 
programing. The Java SAX documentation can be found here:

http://www.saxproject.org/

Follow the specification below and make the necessary changes and additions.

## Specification

## # Account
Begin with the code from the previous assignment, then make the following changes
* This class should now implement the Comparable interface
* Add the method required by the interface
* When comparing Account objects, use the value of `accountNumber`


### Customer
Begin with the code from the previous assignment, then make the following chnages:
* This class should now implement the Comparable interface
* Add the method required by the interface
* When comparing Customer objects, use the following order
	- Last name
	- First Name
	- Account

### CommercialAccount and NonCommercialAccount
Use these classes from the previous assignment, but no modifications should be necessary

### XmlHandler
This class must be modified to work with the new input file. See comments in the code
for details:
- startElement - This method should identify the different types of elements
and instantiate object references as needed.
- endElement - This method should associate object references
- getCustomers - This method should return the ArrayList of all Customers generated from
the input file.

### XmlReader
This class has been modified slightly from the previous assignment, but 
no further modifications should be necessary.

### Unneeded Classes
The following classes need not be included in this assignment:
* NonTaxableProduct
* Order
* OrderItem
* Product
* TaxableNy (interface)
* TaxableProduct

## Testing
The `Main` class contains a `main()` method that you can use to test your program.
When you push your code back to your repository, GitHub will initiate a series of
tests to verify the correct operation of each of the required methods.
