package com.epam.rd.java.basic.practice3;

import javax.xml.bind.DatatypeConverter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Part4 {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");

        digest.update("password to hash".getBytes());

        byte[] hash = digest.digest();

        System.out.println(Arrays.toString(hash));

        // output: [56, 55, 83, 50, 113, -114, -54, 115, -125, 86, 79, -109, 17, -65, 107, 84]

    }


    public static String hash(String input, String algorithm) {
    MessageDigest messageDigest = null;
    byte[] digest = new byte[0];

    try {
        messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(input.getBytes());
        digest = messageDigest.digest();
    } catch (NoSuchAlgorithmException e) {
        // тут можно обработать ошибку
        // возникает она если в передаваемый алгоритм в getInstance(,,,) не существует
        e.printStackTrace();
    }

    BigInteger bigInt = new BigInteger(1, digest);
    String md5Hex = bigInt.toString(16);

    while( md5Hex.length() < 32 ){
        md5Hex = "0" + md5Hex;
    }

    return md5Hex;
    }
}
