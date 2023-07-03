class zeroReplace{

    public void nullifyRow(int[][] matrix, int row)
    {
        for(int i=0; i<matrix[0].length; i++)
        {
            matrix[row][i]=0;
        }
    }

    public void nullifyColumn(int[][] matrix, int column)
    {
        for(int j=0; j<matrix.length; j++)
        {
            matrix[column][j]=0;
        }
    }

    public void replace(int[][] matrix)
    {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    column[j]=true;
                }
            }
        }

        for(int i=0; i<row.length; i++)
        {
            if(row[i]) nullifyRow(matrix, i);
        }
        for(int j=0; j<column.length; j++)
        {
            if(column[j]) nullifyColumn(matrix, j);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Hi");
    }
}
