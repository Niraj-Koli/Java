package Classes;

public class Classes {
    public static void main(String[] args) {

        Account epsilonsAccount = new Account();

        epsilonsAccount.setNumber("1007216398");
        System.out.println("Account number: " + epsilonsAccount.getNumber());

        epsilonsAccount.setBalance(10000.0);
        System.out.println("Balance = " + epsilonsAccount.getBalance());

        epsilonsAccount.setName("Epsilon");
        System.out.println("Name: " + epsilonsAccount.getName());

        epsilonsAccount.setEmail("faith@epsilon.com");
        System.out.println("Email address: " + epsilonsAccount.getEmail());

        epsilonsAccount.setPhone("7304159510");
        System.out.println("Phone number = " + epsilonsAccount.getPhone());

        epsilonsAccount.withdrawal(20000.00);

        epsilonsAccount.deposit(15000.00);
        epsilonsAccount.withdrawal(20000.00);

        epsilonsAccount.deposit(2000.00);
        epsilonsAccount.withdrawal(7000.00);

        epsilonsAccount.withdrawal(1.00);

    }
}
