package fr.stephcstn.secure_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.stephcstn.secure_vault.model.SecretModel;

public interface SecretRepository extends JpaRepository<SecretModel, Long> {

}
