
package utility;
import java.io.*;

public class IPAddress {
    static String sIP="";
    static File f, ff;
    
    public IPAddress(){}
                    
    public static String getAddress(){
        //accessing IP Address from file
        try{
            f = new File("IPAddress.txt").getAbsoluteFile();
            BufferedReader in = new BufferedReader(
                    new FileReader(f));
            sIP = in.readLine();
            System.out.println(sIP);
            in.close();
        }catch(Exception e){
            sIP = "127.0.0.1";
            System.out.println(e.getMessage());
        }
        return sIP;
    }
    
   public static void saveAddress(String sMes){
        //saving new IP address to text file
        try{
            if (!new File("IPAddress.txt").getAbsoluteFile().
                    exists()){
                new File("IPAddress.txt").createNewFile();
            }
            ff = new File("IPAddress.txt").getAbsoluteFile();
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(new FileWriter(ff, false)));
            out.print(sMes);
            out.close();
        }catch(Exception e){}
    }
}
