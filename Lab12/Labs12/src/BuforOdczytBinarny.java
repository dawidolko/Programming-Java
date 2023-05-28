import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BuforOdczytBinarny {

    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedInputStream bis = null;

        try {
            fis = new FileInputStream("data.bin");
            dis = new DataInputStream(fis);
            bis = new BufferedInputStream(fis);

            while(dis.available() != 0) {
                int data = dis.readInt();
                System.out.println("Data: " + data);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null) fis.close();
                if(dis != null) dis.close();
                if(bis != null) bis.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}