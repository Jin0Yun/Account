package com.example.account.repository;

import com.example.account.domain.Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transcation, Long> {

}
