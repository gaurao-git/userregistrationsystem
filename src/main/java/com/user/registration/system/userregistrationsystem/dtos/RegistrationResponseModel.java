package com.user.registration.system.userregistrationsystem.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class RegistrationResponseModel {
    private String devErrorMsg;
    private String errorMsg;
}
