# Java Banking App

A console-based banking application developed using Java to demonstrate
Object-Oriented Programming concepts.

## Features

- Create a bank account
- Deposit money
- Withdraw money
- View account balance
- View customer and account details
- Supports Savings and Current accounts

## OOP Concepts Demonstrated

### Encapsulation
Account and customer details are kept private and accessed through methods.

### Abstraction
The `Account` class is an abstract class that defines common account behavior.

### Inheritance
`SavingsAccount` and `CurrentAccount` inherit from the `Account` class.

### Polymorphism
The `Account` reference can refer to different account types such as
`SavingsAccount` and `CurrentAccount`.

## Technologies Used

- Java
- Object-Oriented Programming
- VS Code

## How to Run

1. Open the project in VS Code.
2. Open `Main.java`.
3. Run the program.
4. Follow the options displayed in the console.

## Project Structure

```text
src/
├── Account.java
├── SavingsAccount.java
├── CurrentAccount.java
├── Customer.java
├── Bank.java
└── Main.java