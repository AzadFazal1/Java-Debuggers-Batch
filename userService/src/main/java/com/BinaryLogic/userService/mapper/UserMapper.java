package com.BinaryLogic.userService.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BinaryLogic.userService.dto.UserDTO;
import com.BinaryLogic.userService.entity.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);

}