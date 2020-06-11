package com.brightcoding.app.ws.services.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightcoding.app.ws.entities.AddressEntity;
import com.brightcoding.app.ws.entities.UserEntity;
import com.brightcoding.app.ws.repositories.AddressRepository;
import com.brightcoding.app.ws.repositories.UserRepository;
import com.brightcoding.app.ws.services.AddressService;
import com.brightcoding.app.ws.shared.dto.AddressDto;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<AddressDto> getAllAddresses(String email) {
		
		UserEntity currentUser = userRepository.findByEmail(email);
		
		List<AddressEntity> addresses = currentUser.getAdmin() == true ? (List<AddressEntity>) addressRepository.findAll() : addressRepository.findByUser(currentUser);
		
		Type listType = new TypeToken<List<AddressDto>>() {}.getType();
		List<AddressDto> addressesDto = new ModelMapper().map(addresses, listType);
		
		return addressesDto;
	}

}
