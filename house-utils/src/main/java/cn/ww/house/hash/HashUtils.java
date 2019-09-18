package cn.ww.house.hash;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

/**
 * hash工具类
 * @Author: chenghuan
 * @Date: 2019/9/18 22:23
 */
public final class HashUtils {

    private static final HashFunction FUNCTION = Hashing.md5();

    /**
     * 盐
     */
    private static final String salt = "house";
}
