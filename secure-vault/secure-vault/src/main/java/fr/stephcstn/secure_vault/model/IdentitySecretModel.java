package fr.stephcstn.secure_vault.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "identity_secrets")
public class IdentitySecretModel extends SecretModel {
    private String firstName;
    private String gender;
    private String lastName;
    private Date dateOfBirth;
    private String encryptedIdentityNumber;

    public IdentitySecretModel(Long id, String title, Date createdAt, String firstName, String gender, String lastName,
            Date dateOfBirth, String encryptedIdentityNumber) {
        super(id, title, createdAt);
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.encryptedIdentityNumber = encryptedIdentityNumber;
    }
}