package com.als.appfinancas.repositories;

import java.util.List;

import com.als.appfinancas.model.entities.RecordModel;
import com.als.appfinancas.model.entities.UserModel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends JpaRepository<RecordModel, Long> {

    List<RecordModel> findByUser(UserModel user);

    Page<RecordModel> findByUser(Pageable pageable, UserModel user);
}
