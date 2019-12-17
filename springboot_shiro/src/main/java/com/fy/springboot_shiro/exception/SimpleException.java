package com.fy.springboot_shiro.exception;

/**
 * @Author: fy fangyuan@i-soon.net
 * @Date: 2019/12/16 14:22
 * @Description:
 */
public class SimpleException extends  RuntimeException {

    public SimpleException() {
        super();
    }


    public SimpleException(String message) {
        super(message);
    }


    public SimpleException(String message,Throwable cause) {
        super(message, cause);
    }

    public  SimpleException(Throwable cause) {
        super(cause);
    }


}
