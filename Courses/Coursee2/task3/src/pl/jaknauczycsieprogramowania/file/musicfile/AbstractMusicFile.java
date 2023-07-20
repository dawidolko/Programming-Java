package pl.jaknauczycsieprogramowania.file.musicfile;

import pl.jaknauczycsieprogramowania.file.AbstractFile;
import pl.jaknauczycsieprogramowania.file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    protected String bandName;
    protected String title;

    protected AbstractMusicFile(String name, int size, String bandName, String title) {
        super(name, size);

        this.bandName = bandName;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }
}
