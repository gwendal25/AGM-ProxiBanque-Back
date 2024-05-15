package org.formation.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double balance;
	private LocalDate creationDate;

	@OneToOne(mappedBy="account")
	private Client client;
	
	public Account() {
	}

	public Account(double balance) {
		this.balance = balance;
		this.creationDate = LocalDate.now();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", creationDate=" + creationDate + "]";
	}
}
