// WRONG APROUCH
class PaymentProcessor {

    fun processPayment(type: String) {
        when (type) {
            "CREDIT_CARD" -> processCreditCard()
            "PAYPAL" -> processPaypal()
            "GOOGLE_PAY" -> processGooglePay()
        }
    }

    private fun processCreditCard() { /* ... */ }
    private fun processPaypal() { /* ... */ }
    private fun processGooglePay() { /* ... */ }
}

// CORRECT APPROACH (Polymorphism + Abstraction)
interface PaymentMethod {
    fun pay()
}

class CreditCardPayment : PaymentMethod {
    override fun pay() { /* Credit card logic */ }
}

class PaypalPayment : PaymentMethod {
    override fun pay() { /* PayPal logic */ }
}

class GooglePayPayment : PaymentMethod {
    override fun pay() { /* Google Pay logic */ }
}



class PaymentProcessor {

    fun process(payment: PaymentMethod) {
        payment.pay()
    }
}