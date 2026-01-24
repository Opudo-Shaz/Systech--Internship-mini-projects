package com.example.assessments.javase010;

public class Main {
    public static void main(String[] args) {
        Assessment2_sharon_opudo.Book book1 = new Assessment2_sharon_opudo.Book("1984", "Grace Orwa", "9780451524935", 1949.0);
        Assessment2_sharon_opudo.Book book2 = new Assessment2_sharon_opudo.Book("A doll's House", "Henrik Ibsen", "9780451524936", 1960.0);

        System.out.println(book1);
        System.out.println(book2); 

        Employee emp = new Employee("Alice", 101, 50000);
        emp.displayEmployeeInfo();
        Developer dev = new Developer("Bob", 102, 70000, "Java");
        dev.displayEmployeeInfo();

        BankAccount account = new BankAccount("123456789", 1000.0, "John Doe");
        System.out.println("Initial Balance: " + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
    
}
