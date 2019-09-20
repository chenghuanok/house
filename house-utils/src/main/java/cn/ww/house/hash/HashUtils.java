package cn.ww.house.hash;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 * hash工具类
 * @Author: chenghuan
 * @Date: 2019/9/18 22:23
 */
public final class HashUtils {

    /**
     * 盐
     */
    private static final String key = "house";

    public static String pwdHmacMd5(final String pwd){
       return Hashing.hmacMd5(getKey(key)).hashString(pwd, Charsets.UTF_8).toString();
    }

    /**
     * 获取key
     * @param
     * @return
     * @author chenghuan
     * @date 2019/9/20 22:31
    */
    private static Key getKey(final String key){
        byte[] keyBytes = key.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(keyBytes, "hmacMd5");
        return secretKeySpec;
    }
}
