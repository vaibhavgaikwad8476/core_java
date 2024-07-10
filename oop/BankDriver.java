class Bank {
    String bName;
    String branch;
    long accounts;
    String branchId;
    String bType;
    Employee employee;

    Bank(String bName, String branch, long accounts, String branchId, String bType, String eName, String eid, String exp, String position, double salary) {
        this.bName = bName;
        this.branch = branch;
        this.accounts = accounts;
        this.branchId = branchId;
        this.bType = bType;
        this.employee = new Employee(eName, eid, exp, position, salary);
        
    }

    void displayBank() {
        System.out.println();
        System.out.println("***Bank Details***");
        System.out.println("Bank Name: " + bName);
        System.out.println("Branch: " + branch);
        System.out.println("Accounts in bank: " + accounts);
        System.out.println("Branch ID: " + branchId);
        System.out.println("Bank Type: " + bType);
        System.out.println();
    }
}

class Employee {
    String eName;
    String eid;
    String exp;
    String position;
    double salary;

    Employee(String eName, String eid, String exp, String position, double salary) {
        this.eName = eName;
        this.eid = eid;
        this.exp = exp;
        this.position = position;
        this.salary = salary;
       
    }

    void displayEmployee() {
        System.out.println("***Employee Details***");
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Experience: " + exp);
        System.out.println("Employee Position: " + position);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}

class Customer {
    String cName;
    long cAccountNo;
    String aType;
    String address;
    long conNumber;

    Customer(String cName, long cAccountNo, String aType, String address, long conNumber) {
        this.cName = cName;
        this.cAccountNo = cAccountNo;
        this.aType = aType;
        this.address = address;
        this.conNumber = conNumber;
       System.out.println();
    }

    void displayCustomer() {
        System.out.println("***Customer Details***");
        System.out.println("Customer Name: " + cName);
        System.out.println("Customer Account Number: " + cAccountNo);
        System.out.println("Account Type: " + aType);
        System.out.println("Customer Address: " + address);
        System.out.println("Contact Number: " + conNumber);
    }
}

class BankDriver {
    public static void main(String[] args) {
        Bank obj = new Bank("State Bank", "Shirur", 1000, "IFSC123456", "Public", "Ramesh", "SB123", "3Years 2Month", "Manager", 50000.0);
        obj.displayBank();
        obj.employee.displayEmployee();

        Customer customer = new Customer("Suresh", 12345678901234L, "Saving", "Pune", 9876543266L);
        customer.displayCustomer();
    }
}