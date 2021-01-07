/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.crypto;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;

import com.shop.utils.crypto.EncrytedPasswordUtil;

@SpringBootTest
public class EncrytedPasswordUtilTest {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    EncrytedPasswordUtil encrytedPasswordUtil;

    @Test
    void bCryptPasswordEncoder() {
	String encryptPass_Input = "123";
	log.info("Input Password:" + encryptPass_Input);
	String encryptPass_Storage = BCrypt.hashpw("123", BCrypt.gensalt());
	log.info("Data Storage[123]:" + encryptPass_Storage);
	boolean passed = BCrypt.checkpw("123", encryptPass_Storage);
	log.info("Compare: " + passed);
	assertTrue(passed);
    }
}
