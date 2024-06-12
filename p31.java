// Write a java program to create a class named 'Bank ' with the following data
// members:
// • Name of depositor
// • Address of depositor
// • Account Number
// • Balance in account
// Class 'Bank' has a method for each of the following:
// 1. Generate a unique account number for each depositor.
// 2. For first depositor, account number will be 1001, for second depositor
// it will be 1002 and so on
// 3. Display information and balance of depositor
// 4. Deposit more amount in balance of any depositor
// 5. Withdraw some amount from balance deposited.
// 6. Change address of depositor

// After creating the class, do the following operations.
// 1. Enter the information (name, address, account number, balance) of the
// depositors. Number of depositors is to be entered by the user.
// 2. Print the information of any depositor.
// 3. Add some amount to the account of any depositor and then display
// final information of that depositor.
// 4. Remove some amount from the account of any.
// depositor and then display final information of that depositor.
// 5. Change the address of any depositor and then display the final
// information of that depositor.
// 6. Randomly repeat these processes for some other
// bank accounts




import java.util.ArrayList;
import java.util.Scanner;

class Bank {
    private String name;
    private String address;
    private int accountNumber;
    private double balance;
    private static int nextAccountNumber = 1001;

    public Bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.accountNumber = nextAccountNumber++;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    public void changeAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address updated to: " + newAddress);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bank> bankAccounts = new ArrayList<>();

        System.out.print("Enter the number of depositors: ");
        int numDepositors = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < numDepositors; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();
            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            Bank account = new Bank(name, address, balance);
            bankAccounts.add(account);
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nBank Operations:");
            System.out.println("1. Display information of any depositor");
            System.out.println("2. Deposit amount to any depositor's account");
            System.out.println("3. Withdraw amount from any depositor's account");
            System.out.println("4. Change address of any depositor");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    Bank account = findAccount(bankAccounts, accNum);
                    if (account != null) {
                        account.displayInfo();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    account = findAccount(bankAccounts, accNum);
                    if (account != null) {
                        account.deposit(depositAmount);
                        account.displayInfo();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline
                    account = findAccount(bankAccounts, accNum);
                    if (account != null) {
                        account.withdraw(withdrawAmount);
                        account.displayInfo();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    accNum = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    account = findAccount(bankAccounts, accNum);
                    if (account != null) {
                        account.changeAddress(newAddress);
                        account.displayInfo();
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    private static Bank findAccount(ArrayList<Bank> bankAccounts, int accountNumber) {
        for (Bank account : bankAccounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
