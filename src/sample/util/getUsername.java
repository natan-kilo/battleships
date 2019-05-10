package sample.util;

import java.io.BufferedReader;
import java.io.FileReader;

public class getUsername {
    public static String getUsername(){
        try {
            FileReader fr = new FileReader("src/sample/userdata/username.txt");
            BufferedReader br = new BufferedReader(fr);
            String username = br.readLine();
            if (username.equals("")){
                throw new Exception("username is empty");
            }
            return username;
        } catch (Exception e){
            return null;
        }
    }
}
