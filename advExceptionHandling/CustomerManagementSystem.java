package advExceptionHandling;



import java.util.HashMap;
import java.util.Map;

class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message) {
        super(message);
    }
}

class InvalidCustomerDataException extends RuntimeException {
    public InvalidCustomerDataException(String message) {
        super(message);
    }
}

class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [ID=" + id + ", Name=" + name + "]";
    }
}

public class CustomerManagementSystem {
    private Map<Integer, Customer> customerDatabase = new HashMap<>();

    public void addCustomer(int id, String name) {
        if (name == null || name.isEmpty()) {
            throw new InvalidCustomerDataException("Customer name cannot be empty.");
        }
        customerDatabase.put(id, new Customer(id, name));
    }

    public void updateCustomer(int id, String newName) throws CustomerNotFoundException  {
        Customer customer = customerDatabase.get(id);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer with ID " + id + " not found.");
        }
        customer.setName(newName);
    }

    public void deleteCustomer(int id) throws CustomerNotFoundException {
        if (customerDatabase.remove(id) == null) {
            throw new CustomerNotFoundException("Customer with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {
        CustomerManagementSystem cms = new CustomerManagementSystem();
        try {
            cms.addCustomer(101, "Alice");
            cms.addCustomer(102, "Bob");
            cms.updateCustomer(101, "Alice Cooper");
            cms.deleteCustomer(102);
            cms.deleteCustomer(999);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (InvalidCustomerDataException e) {
            System.out.println("Invalid data: " + e.getMessage());
        }
    }
}

