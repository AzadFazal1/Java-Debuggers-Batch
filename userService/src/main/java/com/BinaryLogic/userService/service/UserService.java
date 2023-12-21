package com.BinaryLogic.userService.service;


import org.springframework.http.ResponseEntity;

import com.BinaryLogic.userService.dto.UserDTO;

public interface UserService {

    public UserDTO addUser(UserDTO userDTO);
    public ResponseEntity<UserDTO> fetchUserDetailsById(Integer userId);


}
