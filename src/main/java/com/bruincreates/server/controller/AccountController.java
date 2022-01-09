package com.bruincreates.server.controller;

import com.bruincreates.server.model.request.RegistrationRequest;
import com.bruincreates.server.model.servlet.RestResponse;
import com.bruincreates.server.model.user.UserControlBlock;
import com.bruincreates.server.service.AccountService;
import com.bruincreates.server.utility.ServletUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Account Controller is responsible for all user account
 * management service. Importantly, this api is exposed to
 * the general public and a Spring session is not established
 */

@Slf4j
@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/register")
    public RestResponse<UserControlBlock> register(@Valid @RequestBody RegistrationRequest request) {
        accountService.register(request);
        return RestResponse.success(ServletUtils.getCurrentPrincipal());
    }

}
