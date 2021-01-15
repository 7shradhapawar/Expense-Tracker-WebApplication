package com.shradha.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shradha.expense.model.Expense;


public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}