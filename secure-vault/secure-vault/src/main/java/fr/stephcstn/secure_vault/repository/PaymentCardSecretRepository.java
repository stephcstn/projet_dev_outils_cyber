package fr.stephcstn.secure_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.stephcstn.secure_vault.model.PaymentCardSecretModel;

@Repository
public interface PaymentCardSecretRepository extends JpaRepository<PaymentCardSecretModel, Long> {

}
