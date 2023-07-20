package pl.jaknauczycsieprogramowania.drive;

import pl.jaknauczycsieprogramowania.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
