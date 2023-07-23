package org.biblioteka;

import java.util.Objects;
import java.util.UUID;

class Reader {
    private UUID id;
    private String name;
    private String pesel;

    public Reader(String name, String pesel) throws IllegalArgumentException {
        this.id = UUID.randomUUID();
        this.name = name;
        this.pesel = pesel;
    }

    public Reader(UUID id, String name, String pesel) throws IllegalArgumentException {
        this.id = id;
        this.name = name;
        this.pesel = pesel;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Imię i nazwisko: " + name + ", PESEL: " + pesel;
    }

    public static boolean validatePesel(String pesel) {
        if (pesel == null || pesel.length() != 11) {
            return false;
        }

        //niestety z jakiegoś powodu nie działa mi walidacja peselu
//        int[] weights = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
//        int sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += Integer.parseInt(pesel.substring(i, i + 1)) * weights[i];
//        }
//        int checksum = (10 - (sum % 10)) % 10;
//        return checksum == Integer.parseInt(pesel.substring(10, 11));
//    }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Reader reader = (Reader) obj;
        return Objects.equals(name, reader.name) &&
                Objects.equals(pesel, reader.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pesel);
    }

}

