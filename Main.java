package com;
public class Name{
    String first = "Theodore";
    String last = "Moose";
    String full = first+last;

    public static void main(String [] args) {
    Name name = new Name();
    name.first  = "Manuel";   
    name.last  = "Diaz";
    name.full=name.first + " " + name.last;
    System.out.println(name.full);
    }
}