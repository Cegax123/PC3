package Solid.LSP;

import Solid.LSP.NewPayment;

import java.util.ArrayList;
import java.util.List;

public class PaymentHelper {
    List<PreviousPayment>previousPayments = new ArrayList<PreviousPayment>();
    List<NewPayment>newPayment = new ArrayList<NewPayment>();

    public void addPreviousPayment(PreviousPayment user){previousPayments.add(user);}
    public void addNewPayment(NewPayment user){newPayment.add(user);}
    public void showPreviousPayments() {
        for (PreviousPayment payment: previousPayments) {
            payment.previousPaymentInfo();
            System.out.println("------");
        }
    }
    public void processNewPayments()  {
        for (NewPayment payment: newPayment) {
            payment.newPayment();
            System.out.println("------");
        }
    }
}
