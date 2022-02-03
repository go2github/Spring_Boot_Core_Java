package com.learning.garbage;

public class GarBageExample {
    public static void main(String[] args) {
        GarBageExample garBageExample=new GarBageExample();
        System.out.println(garBageExample.hashCode());
        garBageExample = null;
        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");

    }
    @Override
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
}
