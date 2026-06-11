package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Tracker.TEntity;
import com.repo.Trepo;

@Service
public class Tservice {
	@Autowired
private Trepo repo;

	public List<TEntity> getall() {
		return repo.findAll();
	}

	public TEntity getbyid(int id) {
		return repo.findById(id).get();
	}

	public void deletebyid(int id) {
		repo.deleteById(id);
	}

	public TEntity add(TEntity e) {
		
		return repo.save(e);
	}
	public TEntity save(int id, TEntity e) {
		
		TEntity existing = repo.findById(id).get();
		existing.setTitle(e.getTitle());
		existing.setAmount(e.getAmount());
		existing.setDate(e.getDate());
		return repo.save(e);
	}

	

}
