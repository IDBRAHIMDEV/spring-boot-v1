package com.brightcoding.app.ws.services;

import java.util.List;

import com.brightcoding.app.ws.shared.dto.AddressDto;

public interface AddressService {

	List<AddressDto> getAllAddresses(String email);
}
