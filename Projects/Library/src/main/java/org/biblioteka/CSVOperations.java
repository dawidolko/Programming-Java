package org.biblioteka;

import java.io.IOException;

// Interfejs do operacji na plikach CSV
interface CSVOperations {
    void importFromCSV(String filePath) throws IOException;

    void exportToCSV(String filePath) throws IOException;
}

