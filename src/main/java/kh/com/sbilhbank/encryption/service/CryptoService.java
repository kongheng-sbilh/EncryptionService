package kh.com.sbilhbank.encryption.service;

public interface CryptoService {
    String encrypt(String plainText);
    String decrypt(String cipherText);
}
