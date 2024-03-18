package kh.com.sbilhbank.encryption.controller;

import kh.com.sbilhbank.encryption.service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CryptoServiceController {

    @Autowired
    private CryptoService cryptoService;

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody  String plainText) {
        return cryptoService.encrypt(plainText);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody String cipherText) {
        return cryptoService.decrypt(cipherText);
    }
}
