/*Java - programowanie obiektowe w 3h https://www.youtube.com/watch?v=OvY0f-IWlos*/
package pl.jaknauczycsieprogramowania;

import pl.jaknauczycsieprogramowania.drive.Drive;
import pl.jaknauczycsieprogramowania.drive.HDDDrive;
import pl.jaknauczycsieprogramowania.drive.SSDDrive;
import pl.jaknauczycsieprogramowania.file.File;
import pl.jaknauczycsieprogramowania.file.imagefile.GIFImageFile;
import pl.jaknauczycsieprogramowania.file.imagefile.JPGImageFile;
import pl.jaknauczycsieprogramowania.file.musicfile.MP3MusicFile;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(Monitor.getMaxHeight());

        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);
        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);
        HDDDrive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        //drive.listFiles();
        File file = drive.findFile("plik.mp3");
        //System.out.println(file.getSize());

        MP3MusicFile MP3X = new MP3MusicFile("plikk.mp3", 2000, "2115", "Miłosc bla", 90);
        System.out.println(MP3X.getName());

        System.out.println(MP3X instanceof MP3MusicFile);
    }
}
