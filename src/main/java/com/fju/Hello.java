package com.fju;

import java.io.*;

public class Hello {

    public void hello(){
        try{
            FileInputStream hello = new FileInputStream("C:/Users/USER/IdeaProjects/final-project-for-1092-java2-v2-yangsheep106/src/main/java/com/fju/hello.txt" );
            InputStreamReader isr = new InputStreamReader(hello);
            BufferedReader br = new BufferedReader(isr);
            String s1 = br.readLine();
            System.out.println(s1);
            String s2 = br.readLine();
            System.out.println(s2);
            String s3 = br.readLine();
            System.out.println(s3);
            String s4 = br.readLine();
            System.out.println(s4);
            String s5 = br.readLine();
            System.out.println(s5);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
