/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 * https://github.com/maithanhduyan/universal-platforms
 */
package com.shop.utils.crypto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class EncrytedPasswordUtil {

    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	return bCryptPasswordEncoder;
    }
}
