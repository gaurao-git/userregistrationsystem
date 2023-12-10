package com.user.registration.system.userregistrationsystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {
        private Integer userId;

        private String email;

        private String mobileNumber;

        private LocalDate dateOfBirth;
}
