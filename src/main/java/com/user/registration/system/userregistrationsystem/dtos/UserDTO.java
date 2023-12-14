package com.user.registration.system.userregistrationsystem.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

        @NotBlank(message = "user email cannot be null or empty")
        private String email;

        @NotBlank(message = "user mobile number cannot be null or empty")
        private String mobileNumber;

        @NotNull(message = "user date of birth cannot be null or empty")
        private LocalDate dateOfBirth;
}
