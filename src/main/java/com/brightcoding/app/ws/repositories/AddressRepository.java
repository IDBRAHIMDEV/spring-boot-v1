package com.brightcoding.app.ws.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.AddressEntity;
import com.brightcoding.app.ws.entities.UserEntity;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity, Long> {
    
	List<AddressEntity> findByUser(UserEntity currentUser);
}
