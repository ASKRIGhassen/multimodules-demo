package com.mavengurus.converters;

import com.mavengurus.domain.UserCommand;
import com.mavengurus.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userCommandToUser(UserCommand userCommand);

    UserCommand userToUserCommand(User user);

}
