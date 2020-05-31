package com.brightcoding.app.ws.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.brightcoding.app.ws.entities.UserEntity;

@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {
	
	UserEntity findByEmail(String email);
	
	UserEntity findByUserId(String userId);
	
	@Query(value="select * from users u where u.first_name = 'Younes'", nativeQuery = true)
	Page<UserEntity> findAllUsersWithFirstName( Pageable pageableRequest );

}
