import java.lang.*;
class Main {
public static void main(String[] args) throws Exception{
    System.out.println("Dec" + "       " + "Hx" + "           " + "Oct" + "          " + "Char" + "        " + "Html");
    System.out.println();
           for (int i = 0x0020; i <= 0x007F; i++) {
               
               String octal = Integer.toOctalString(i);
               String s = Integer.toHexString(i).toUpperCase();  
               System.out.println( "\033[32m" + i + "\033[0m" + "       " +"\033[34m" + "0x00" + s + "\033[0m"+"        "+"\033[31m" + octal +"\033[0m" + "            " +  "\033[95m" + (char)i + "\033[0m" + "          " + "&#" + i);
            //  Thread.sleep(1000);
               // System.out.println("\033[32mHello, World!\033[0m");
           }
     }                    
}