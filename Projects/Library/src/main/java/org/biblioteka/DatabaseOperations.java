package org.biblioteka;

import java.io.IOException;

// Interfejs do operacji na bazie danych
interface DatabaseOperations {
    void saveToDatabase(String filePath) throws IOException;

    void loadFromDatabase(String filePath) throws IOException;
}


