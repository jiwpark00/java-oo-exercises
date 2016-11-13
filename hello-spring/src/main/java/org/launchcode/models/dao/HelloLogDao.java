package org.launchcode.models.dao;

import org.launchcode.models.HelloLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface HelloLogDao extends CrudRepository<HelloLog, Integer> {
	
	public List<HelloLog> findAll(); // method
	
	public HelloLog findByUid(Integer uid); // method
	
}
