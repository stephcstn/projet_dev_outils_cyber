package fr.stephcstn.secure_vault.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "credential_secrets")
public class CredentialSecretModel extends SecretModel {
    private String url;
    private String username;
    private String encryptedPassword;

    public CredentialSecretModel(Long id, String title, Date createdAt, String url, String username,
            String encryptedPassword) {
        super(id, title, createdAt);
        this.url = url;
        this.username = username;
        this.encryptedPassword = encryptedPassword;
    }
}