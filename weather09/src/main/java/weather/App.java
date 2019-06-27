package weather;

import java.util.*;
import java.io.IOException;
import com.mini.work.*;

public class App {
    public static void main(String[] args) {
        List<Weather> wlist;
        JsonClient app = new JsonClient();
        HashMap<String, String> hmap = Utils.initData();
        List<String> jsonList;
        
        try {
            jsonList = app.getResults(hmap);
            wlist = JsonConvert.dealList(jsonList);
            int i = 0;
            for (Weather w: wlist) {
                //Weather中toString()是覆盖重载了
                System.out.println(w);
                i++;
            }
            System.out.println(i);
        } catch (IOException e) {
            //System.out.println("123");
        } catch (InterruptedException e) {
            //System.out.println("456");
        }
   }
}