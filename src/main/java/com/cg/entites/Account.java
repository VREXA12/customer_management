package com.cg.entites;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@GeneratedValue
	@Id
	private Long accountId;
	private Double balance;
	private LocalDateTime created;

	public Account() {
	}

	public Account(Double balance, LocalDateTime created) {
		this.balance = balance;
		this.created = created;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountid(Long accountId) {
		this.accountId = accountId;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public LocalDateTime getCreated() {
		return created;
	}

	public void setCreated(LocalDateTime created) {
		this.created = created;
	}

}
