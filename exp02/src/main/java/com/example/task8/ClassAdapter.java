package com.example.task8;

// 类适配器
public class ClassAdapter extends ThirdPartyEncryption implements EncryptionAdapter{
    @Override
    public String encrypt(String data) {
        // 调用第三方加密算法
        return encryptData(data);
    }
}
