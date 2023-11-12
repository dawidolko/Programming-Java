import javax.swing.table.DefaultTableModel;

class MyTableModel extends DefaultTableModel {

    private boolean[] canEdit;

    public MyTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
        canEdit = new boolean[columnNames.length];
        // Ustawienie domyślnej nieedytowalności kolumn
        for (int i = 0; i < columnNames.length; i++) {
            canEdit[i] = false;
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return canEdit[column];
    }

    // Dodana metoda do ustawiania edytowalności kolumny
    public void setColumnEditable(int column, boolean editable) {
        canEdit[column] = editable;
        this.fireTableStructureChanged(); // Powiadomienie o zmianie struktury modelu tabeli
    }
}
