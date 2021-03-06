package com.miggie.musicbyyourears.requests;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public abstract class BaseUserRequest {

    /** Username **/
    @NotBlank @Email
    private String username;
    /** Password **/
    @NotBlank
    private String password;
}
