package com.api.springbootcrud.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PersonDto {
    @NotBlank
    @Size(max = 80)
    private String name;
    @NotBlank
    @Size(max = 14)
    private String cpf;
    @NotBlank
    @Size(max = 14)
    private String phoneNumber;
    @NotBlank
    @Size(max = 50)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
