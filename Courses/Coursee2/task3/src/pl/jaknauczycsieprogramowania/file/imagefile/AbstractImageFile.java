package pl.jaknauczycsieprogramowania.file.imagefile;

import pl.jaknauczycsieprogramowania.file.AbstractFile;
import pl.jaknauczycsieprogramowania.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
