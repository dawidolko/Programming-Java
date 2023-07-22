package Species;

public class Species
{
    private String genusName; // Nazwa rodzaju
    private String speciesName; // Nazwa gatunkowa
    private int numberChrom; // Liczba chromosomów 2n
    private int basicNumberChrom; // Podstawowa liczba chromosomów x
    private String description; // Opis

    public Species() { }
    public Species(String genusName, String speciesName, int numberChrom, int basicNumberChrom, String description)
    {
        this.genusName = genusName;
        this.speciesName = speciesName;
        this.numberChrom = numberChrom;
        this.basicNumberChrom = basicNumberChrom;
        this.description = description;
    }

    public String getGenusName() {
        return genusName;
    }
    public String getSpeciesName() {
        return speciesName;
    }
    public int getNumberChrom() {
        return numberChrom;
    }
    public int getBasicNumberChrom() {
        return basicNumberChrom;
    }
    public String getDescription() {
        return description;
    }
    public void setGenusName(String genusName) {
        this.genusName = genusName;
    }
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
    public void setNumberChrom(int numberChrom) {
        this.numberChrom = numberChrom;
    }
    public void setBasicNumberChrom(int basicNumberChrom) {
        this.basicNumberChrom = basicNumberChrom;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void FullName()
    {
        System.out.format("\n\tRodzaj: %s\n\tGatunek: %s\n", genusName, speciesName);
    }

    public void Haploid()
    {
        System.out.format("\n\tHaploidalna liczba chromosomów n rodzaju %s z gatunku %s: %d\n", genusName, speciesName, numberChrom/2);
    }

    public void Clone(Species copy)
    {
        this.genusName = copy.genusName;
        this.speciesName = copy.speciesName;
        this.numberChrom = copy.numberChrom;
        this.basicNumberChrom = copy.basicNumberChrom;
        this.description = copy.description;
    }

    public void Print()
    {
        System.out.format("\n\tNazwa rodzaju: %s\n\tNazwa gatunku: %s\n\tLiczba chromosomów 2n: %d" +
                        "\n\tPodstawowa liczba chromosomów x: %d\n\tOpis: %s\n",
                genusName, speciesName, numberChrom, basicNumberChrom, description);
    }
}
