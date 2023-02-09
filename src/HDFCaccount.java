import java.util.UUID;

public class HDFCaccount implements BankInterface {
    private String name;
    private String AccountNo;
    private int balance;
    private String password;
    private double rateofinterest;
    //now construct constructor by using fun+alt+insert of name,balance and pass that you hv to enter ini
    public HDFCaccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateofinterest =6.6;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(double rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    @Override
    public int getbalance() {
        return this.balance;
    }

    @Override
    public String depositemoney(int amount){
        balance+=amount;
        return "credited money"+amount;
    }

    @Override
    public String withdrawmoney(int amount, String enterpass) {
        if(enterpass.equals(password)){
            if(balance<amount){
                return "Insufficient balance";
            }
            else {
                balance -= amount;
                return "Money Debited";
            }
        }
        else {
            return "Incorrect password";
        }
    }

    @Override
    public double calculateinterest(int time) {
        return (balance%rateofinterest*time)/100.0;
    }
}
