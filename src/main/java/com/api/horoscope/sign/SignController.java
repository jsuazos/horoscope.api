package com.api.horoscope.sign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/sign")
public class SignController {

    private final SignService signService;

    @Autowired
    public SignController(SignService signService) { this.signService = signService; }

    @GetMapping
    public List<Sign> getSings() { return signService.getSigns(); }

}
