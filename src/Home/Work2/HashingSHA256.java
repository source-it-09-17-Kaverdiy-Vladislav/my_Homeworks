package Home.Work2;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingSHA256 {

    public static final String TEXT = "Hello";

    public void getHashingSHA256() throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(TEXT.getBytes());

        byte byteData[] = md.digest();

        StringBuffer sb = new StringBuffer();
        for (byte aByteData: byteData) {
            sb.append(Integer.toString((aByteData & 0xff) + 0x100, 16).substring(1));
        }
            System.out.println("The text in hashing the form : " + sb.toString());
        }
    }

