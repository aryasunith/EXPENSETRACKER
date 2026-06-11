package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Tracker.TEntity;


@Repository
public interface Trepo extends JpaRepository<TEntity, Integer>{

}
