import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class task4KompresjaGZIP {
    public static void main(String[] args) throws IOException {
        // wersja dla Linuxa
        //String nazwaPliku = "/tmp/io_test.gzip";
        // wersja dla Windows
        String nazwaPliku = "io_test.gzip";

        BufferedOutputStream os = new BufferedOutputStream(
                new GZIPOutputStream(
                        new FileOutputStream(nazwaPliku)));
        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(os));
        pw.write("kompresja w Javie jest prosta");
        pw.close();

        // dekompresja
        BufferedInputStream is = new BufferedInputStream(
                new GZIPInputStream(
                        new FileInputStream(nazwaPliku)));
        BufferedReader br = new BufferedReader(
                new InputStreamReader(is));
        String s;
        StringBuilder sb = new StringBuilder();
        while ( (s = br.readLine()) != null ) {
            System.out.println(s);
            sb.append(s);
        }
        br.close();

        java.util.zip.CRC32 crc = new java.util.zip.CRC32();
        crc.update(sb.toString().getBytes());

        System.out.println("CRC32: " + crc.getValue());
    }
}