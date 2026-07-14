package fr.stephcstn.secure_vault.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ssh_key_secrets")
public class SshKeySecretModel extends SecretModel {
    private String publicKey;
    private String privateKey;

    public SshKeySecretModel(Long id, String title, Date createdAt, String publicKey, String privateKey) {
        super(id, title, createdAt);
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }
}