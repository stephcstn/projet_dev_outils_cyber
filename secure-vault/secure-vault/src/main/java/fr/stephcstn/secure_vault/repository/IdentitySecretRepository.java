package fr.stephcstn.secure_vault.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.stephcstn.secure_vault.model.IdentitySecretModel;

@Repository
public interface IdentitySecretRepository extends JpaRepository<IdentitySecretModel, Long> {

}
