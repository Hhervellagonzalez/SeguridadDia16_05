package com.softtek.SeguridadDia165.service;


import com.softtek.SeguridadDia165.dao.request.SignInRequest;
import com.softtek.SeguridadDia165.dao.request.SignUpRequest;
import com.softtek.SeguridadDia165.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}