package com.shradha.expense.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "category")
@NoArgsConstructor
@Data

public class Category {

	@Id
	private Long id;

	// Travel, Grocery- Categories we are going to connect to user
    @NonNull
	private String name;
	// many categories can be assigned to one user


}


