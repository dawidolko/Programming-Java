import javax.swing.table.DefaultTableModel;

class MyTableModel extends DefaultTableModel {

    boolean editable;

    public MyTableModel(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
        this.editable = false;
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return editable && column != 0;
    }

    public void setCellEditable(boolean editable) {
        this.editable = editable;
    }
}

