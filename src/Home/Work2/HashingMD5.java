package Home.Work2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingMD5 {

    public static final String TEXT = "Hello";

    public void getHashingMD5() throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(TEXT.getBytes());

        byte byteData[] = md.digest();


        StringBuffer sb = new StringBuffer();
        for (byte aByteData : byteData) {
            sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println("The text in hashing the form : " + sb.toString());

    }

}
