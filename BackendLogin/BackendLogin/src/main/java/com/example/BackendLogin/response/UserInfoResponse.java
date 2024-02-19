package com.example.BackendLogin.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UserInfoResponse {

    private Long id;
    private String username;
    private List<String> roles;
}
