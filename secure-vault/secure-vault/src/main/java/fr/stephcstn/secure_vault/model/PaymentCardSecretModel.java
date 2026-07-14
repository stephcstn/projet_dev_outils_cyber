package fr.stephcstn.secure_vault.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "payment_card_secrets")
public class PaymentCardSecretModel extends SecretModel {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public PaymentCardSecretModel(Long id, String title, Date createdAt, String cardNumber, String cardHolderName,
            String expirationDate, String cvv) {
        super(id, title, createdAt);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }
}