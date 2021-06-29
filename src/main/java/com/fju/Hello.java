package com.fju;

import java.io.*;

public class Hello {

    public void hello(){
        try{
            FileInputStream hello = new FileInputStream("C:/Users/USER/IdeaProjects/final-project-for-1092-java2-v2-yangsheep106/src/main/java/com/fju/hello.txt" );
            InputStreamReader isr = new InputStreamReader(hello);
            BufferedReader br = new BufferedReader(isr);
            String s = null;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
