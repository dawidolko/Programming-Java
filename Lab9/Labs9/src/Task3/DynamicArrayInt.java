package Task3;

public class DynamicArrayInt {
    private int[] table;
    private int nElems;

    public DynamicArrayInt(int maxSize)
    {
        table = new int[maxSize];
        nElems = 0;
    }
    //Add z rolokacja
    public void add(int value)
    {
        if(nElems >= table.length)
        {
            int[] locTable = new int[table.length*2];
            for(int i=0; i< table.length;i++)
            {
                locTable[i]=table[i];
                table=locTable;
            }
            table[nElems]=value;
            nElems++;
        }
    }

    public  int get(int index)
    {
        return table[index];
    }

    public int size()
    {
        return nElems;
    }

    public boolean remove(int index)
    {
        if(nElems==0)
        {
            return false;
        }
        for(int j=index;j<nElems-1;j++)
        {
            table[j]=table[j+1];
        }
        nElems--;
        return true;
    }

    public int find(int searchElem) {
        for (int j = 0; j < nElems; j++) {
            if (table[j] == searchElem) {
                return j;
            }
        }
        return -1;
    }

    public void print()
    {
        for(int i=0; i < nElems; i++)
        {
            System.out.println(get(i)+" ");
        }
        System.out.println();
    }
}
