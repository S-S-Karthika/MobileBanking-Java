package basic.MobilePacking;



public class MobileBanking {
    public static void main(String[] args) {
        Account account = new Account("123456789", 5000.00, "John Doe");

        DebitCard debitCard = new DebitCard("123456789", "John Doe", "987654321", "12345");
        debitCard.withdraw(account, 10000.00, "1234");

        GPay gPay = new GPay("12345678", "John Doee", "5678", "JohnDoe");
        gPay.payBills("karthika", 1500.00, "Utility", "5678");
    }
}

