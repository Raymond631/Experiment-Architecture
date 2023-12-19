package com.example.task8;


// 对象适配器
public class ObjectAdapter implements EncryptionAdapter{
    private ThirdPartyEncryption thirdPartyEncryption;

    public ObjectAdapter(ThirdPartyEncryption thirdPartyEncryption) {
        this.thirdPartyEncryption = thirdPartyEncryption;
    }

    @Override
    public String encrypt(String data) {
        // 调用第三方加密算法
        return thirdPartyEncryption.encryptData(data);
    }
}
