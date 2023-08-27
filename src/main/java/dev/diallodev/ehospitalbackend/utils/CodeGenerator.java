package dev.diallodev.ehospitalbackend.utils;

import java.util.Random;
import java.util.UUID;

public class CodeGenerator {

    public static String generateCode(String prefix) {
        StringBuilder code = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            int randomNum = r.nextInt(36);
            char c = (randomNum < 10)? (char)(randomNum + '0'): (char)(randomNum - 10 + 'A');
            code.append(c);
        }
        return prefix.concat(code.toString());
    }

    public static String generatePassword() {
        return UUID.randomUUID().toString().substring(0, 8);
    }
}
