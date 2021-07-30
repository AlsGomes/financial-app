package com.als.appfinancas.repositories;

import com.als.appfinancas.model.entities.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
