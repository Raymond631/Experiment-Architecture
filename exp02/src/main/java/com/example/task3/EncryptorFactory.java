package com.example.task3;

import org.springframework.beans.factory.annotation.Value;

public class EncryptorFactory {
    @Value("${Encryptor.type}")
    private String type;

    public Encryptor getEncryptorInstance(){
        switch (type){
            case "des":
                return new DES();
            case "desede":
                return new DESede();
            case "md5":
                return new MD5();
            default:
                throw new RuntimeException("参数配置错误");
        }
    }
}
