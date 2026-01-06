//A bank has list of branches, each branch has list of accounts.
// Your task is to create a summary of account balance
// by account type across all branches.

package org.example;
import java.util.*;
import java.util.stream.*;

// Account class
class Account {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(String accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }
}

// Branch class
class Branch {
    private String branchName;
    private List<Account> accounts;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

// Bank class
class Bank {
    private List<Branch> branches;

    public Bank() {
        branches = new ArrayList<>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    public List<Branch> getBranches() {
        return branches;
    }
}

public class SetD_2 {

    public static void main(String[] args) {

        // Create Bank
        Bank bank = new Bank();

        // Create Branches
        Branch branch1 = new Branch("Mumbai");
        Branch branch2 = new Branch("Pune");
        Branch branch3 = new Branch("Delhi");

        // Add Accounts to Mumbai branch
        branch1.addAccount(new Account("A101", "Savings", 5000));
        branch1.addAccount(new Account("A102", "Current", 12000));
        branch1.addAccount(new Account("A103", "Savings", 7000));
        branch1.addAccount(new Account("A104", "Fixed", 25000));

        // Add Accounts to Pune branch
        branch2.addAccount(new Account("A201", "Savings", 9000));
        branch2.addAccount(new Account("A202", "Current", 15000));
        branch2.addAccount(new Account("A203", "Fixed", 30000));

        // Add Accounts to Delhi branch
        branch3.addAccount(new Account("A301", "Savings", 11000));
        branch3.addAccount(new Account("A302", "Current", 18000));
        branch3.addAccount(new Account("A303", "Fixed", 40000));
        branch3.addAccount(new Account("A304", "Savings", 6000));

        // Add branches to bank
        bank.addBranch(branch1);
        bank.addBranch(branch2);
        bank.addBranch(branch3);

      Map<String,DoubleSummaryStatistics> stats =  bank.getBranches().stream()
                .flatMap(branch -> branch.getAccounts().stream())
                .collect(Collectors.groupingBy(Account::getAccountType, Collectors.summarizingDouble(Account::getBalance)));

        System.out.println(stats);

    }
}
