public class Multi_boolean_matrix {
    public static void main(String[] args) {

    int x=0;
    int y=0;
    

    int[][] arr = 
    {
        {0,0,0},
        {0,1,0},
        {0,0,0},
        {0,0,1}

    };
      int[] row = new int[arr.length];
      int[] col = new int[arr[0].length];
    
       for(int i=0;i<row.length;i++){

        if(row[i]==1){
             x=i;
             y=j;  
            
        }
        
    }

    for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[i].length;j++){
            arr[x][j]=1;
            arr[i][y]=1;
        }
        
    }

    for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
      


    }

}

    
    
