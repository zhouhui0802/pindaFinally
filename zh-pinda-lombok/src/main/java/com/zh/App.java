package com.zh;

import com.zh.entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        User user1=new User();

        user1.setId(1);
        user1.setName("zh");
        user1.setAge(18);

        int id=user1.getId();
        String name=user1.getName();
        int age=user1.getAge();

        User user2=new User(2,"test",20);


        User user3=User.builder().id(3).name("test3").age(22).build();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        System.out.println( "Hello World!" );
    }
}
