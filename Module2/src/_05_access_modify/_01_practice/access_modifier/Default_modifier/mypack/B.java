package _05_access_modify._01_practice.access_modifier.Default_modifier.mypack;

import _05_access_modify._01_practice.access_modifier.Default_modifier.pack.A;

class B {
    public static void main(String args[]) {

        A obj = new A();//Compile Time Error

        obj.msg();//Compile Time Error

    }}
