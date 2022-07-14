package com.apiFrete.api.cepFrete.repositories;

import com.apiFrete.api.cepFrete.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
