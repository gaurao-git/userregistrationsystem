package com.user.registration.system.userregistrationsystem.repositories;

import com.user.registration.system.userregistrationsystem.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRegistrationRepository extends CrudRepository<UserEntity,Integer> {
}
