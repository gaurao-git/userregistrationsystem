package com.user.registration.system.userregistrationsystem.services;

import com.user.registration.system.userregistrationsystem.dtos.UserDTO;

public interface UserRegistrationService {

    public void createUser(UserDTO userDTO);

    public void updateUser(UserDTO userDTO);

    public UserDTO getUserByID(Integer id);

    public void deleteUserByID(Integer id);
}
