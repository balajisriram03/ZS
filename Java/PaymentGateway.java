interface PaymentApp {
    boolean processPayment(double amount);
}

class CreditCard implements PaymentApp {
    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        if (!cardNumber.isEmpty() && amount > 0) {
            
            System.out.println("Credit card payment successful.");
            return true;
        } else {
           
            System.out.println("Credit card payment failed.");
            return false;
        }
    }
}

class PayPal implements PaymentApp {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        if (!email.isEmpty() && amount > 0) {
            System.out.println("PayPal payment successful.");
            return true;
        } else {
            System.out.println("PayPal payment failed.");
            return false;
        }
    }
}

public class PaymentGateway {
    public boolean makePayment(double amount, PaymentApp paymentMethod) {
        return paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        PaymentApp creditCard = new CreditCard("1234-5678-9812-3456", "12/25");
        PaymentApp payPal = new PayPal("user@outlook.com");
        PaymentGateway paymentGateway = new PaymentGateway();

        double creditCardAmount = 100.0;
        double payPalAmount = 50.0;

        paymentGateway.makePayment(creditCardAmount, creditCard);
        paymentGateway.makePayment(payPalAmount, payPal);
    }
}