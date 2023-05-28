import java.io.*;
import java.util.zip.*;
public class Kompresja {
    public static void main(String args[]){
        String s;
        byte b[] = new byte[100];
        for (int i=0; i<100; i++){
            b[i]=(byte) (i/10);
        }
        try{
            FileOutputStream o = new FileOutputStream("plik2.txt");
            o.write(b);
            o.flush();
            o.close();
            FileOutputStream fos = new FileOutputStream("plik2.gz");
            GZIPOutputStream z = new GZIPOutputStream(new
                    BufferedOutputStream(fos));
            z.write(b,0,b.length);
            z.close();
        } catch (Exception e){}
    }
}