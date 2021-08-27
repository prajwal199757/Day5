package com.training.org;
import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {
            ArrayList<String> lst=new ArrayList<String>();
            lst.add("Anju");
            lst.add("Tanuja");
            lst.add("Manish");
            lst.add("Parimal");
            lst.add("Eshan");

            Iterator itr=lst.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
}}
