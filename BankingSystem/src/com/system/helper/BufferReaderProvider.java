package com.system.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderProvider {

    private static BufferedReader br;

    public static BufferedReader getBufferReader(){
        if (br==null){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            br=bufferedReader;
        }
        return br;
    }

}
