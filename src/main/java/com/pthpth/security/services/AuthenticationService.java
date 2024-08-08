package com.pthpth.security.services;

import com.pthpth.security.dto.JwtAuthenticationResponse;
import com.pthpth.security.dto.RefreshTokenRequest;
import com.pthpth.security.dto.SignUpRequest;
import com.pthpth.security.dto.SigninRequest;
import com.pthpth.security.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
