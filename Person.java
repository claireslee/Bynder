package Bynder;

import java.net.*;
import java.util.ArrayList;
import java.io.*;
public class Person extends ReadURL {

    String n;
    String a;
    String h1;
    String h2;
    String m;
    String ic;
    String mb;
    String is;

    public Person(String n, String a, String h1, String h2, String m, String ic, String mb, String is) {
        this.n = n;
        this.a = a;
        this.h1 = h1;
        this.h2 = h2;
        this.m = m;
        this.ic = ic;
        this.mb = mb;
        this.is = is;
    }

    public String getName() {
        return n;
    }

    public int getAge() {
        return Integer.parseInt(a);
    }

    public String getH1() {
        return h1;
    }

    public String getH2() {
        return h2;
    }

    public String getMov() {
        return m;
    }

    public String getIc() {
        return ic;
    }

    public String getMb() {
        return mb;
    }

    public String getIs() {
        return is;
    }
}

//make an arraylist filled with people objects with coressponding attributes -> then we can traverse through this to compare