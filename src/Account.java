public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account() {
        super();
    }
    public Account(int id, Customer customer, double balance) {
        super();
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustumerName(){
        String name = this.getCustomer().getName();
        return name;
    }

    public Account deposit(double amount){
        Account account = new Account();
        double currentBalance = this.getBalance();
        this.setBalance(currentBalance + getBalance());
        account = this;
        return account;
    }

    public Account Withdraw(double amount){
        Account account = new Account();
        double currentBalance = this.getBalance();
        if (currentBalance > amount){
            this.setBalance(currentBalance - getBalance());
            account = this;
        }
        return account;
    }
}
