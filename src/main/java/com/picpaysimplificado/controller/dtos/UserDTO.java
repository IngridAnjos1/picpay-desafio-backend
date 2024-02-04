package com.picpaysimplificado.controller.dtos;

import com.picpaysimplificado.domain.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email, String password, UserType userType) {
}