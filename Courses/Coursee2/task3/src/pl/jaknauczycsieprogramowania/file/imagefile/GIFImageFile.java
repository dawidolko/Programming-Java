package pl.jaknauczycsieprogramowania.file.imagefile;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size) {
        super(name, size);
    }

    public void showAnimation() {
        System.out.println("Showing funny GIF");
    }

    public int getVersion() {
        return 2;
    }
}
