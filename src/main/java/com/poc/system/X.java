package com.poc.system;

public class X {
    static int i = 1111;

    static{
        i = i-- - --i;    //L1
    }

    {
        i = i++ + ++i;    //L2
    }
}
