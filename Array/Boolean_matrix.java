

public class Boolean_matrix {
    public static void main(String[] args) {

    int x=0;
    int y=0;

    int[][] arr = 
    {
        {0,0,0},
        {0,1,0},
        {0,0,0},
        {0,0,0}

    };

    for(int i=0;i<arr.length;i++){

        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==1){
             x=i;
             y=j;  
            }
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

    
    