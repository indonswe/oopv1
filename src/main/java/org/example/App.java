package org.example;

import org.example.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person objName = new Person();
        objName.setFirstName("Kalle");
        String nam = objName.getFirstName();

        System.out.println(nam);
    }
}
