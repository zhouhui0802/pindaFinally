package com.zh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class ExceptionHandlerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ExceptionHandlerApp.class, args);
        System.out.println( "Hello World!" );
    }
}
