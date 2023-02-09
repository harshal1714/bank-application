public interface BankInterface {
    int getbalance();
    String depositemoney(int amount);
    String withdrawmoney(int amount, String password);
    double calculateinterest(int time);
}
