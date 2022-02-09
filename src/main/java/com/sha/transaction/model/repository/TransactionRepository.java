package com.sha.transaction.model.repository;

import com.sha.transaction.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{
    // select * from transactions where user_id = ?;
    List<Transaction> findAllByUserID(Integer userID);
}
