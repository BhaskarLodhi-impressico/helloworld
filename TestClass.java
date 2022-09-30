package com.test;


import java.util.Collections;
import java.util.*;

public class TestClass
{
    public static void main(String[] args)
    {
        List list = List.of(1,2,3,4,5);

        list.stream().sorted(Collections.reverseOrder()).forEach(e -> System.out.println(e));
    }
}



