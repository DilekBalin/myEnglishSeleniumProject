package com.MyFirstProject;

import org.junit.*;

public class Day03_FirstJnitClass {



    @Before
    public void setUp() {
        System.out.println("BEFORE METHOD");
    }

    @After
    public void tearDown() {
        System.out.println("AFTER METHOD");
    }


    @Test
    public void tets01() {
        System.out.println("This is test 1");
    }
    @Ignore
    @Test
    public void tets02() {
        System.out.println("This is test 2");
    }

    @Test
    public void tets03() {
        System.out.println("This is test 3");
    }

    @Test
    public void tets04() {
        System.out.println("This is test 4");
    }
}
