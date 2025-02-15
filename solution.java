public class solution {

    public static void moveZeros(int arr[],int size){
  
    int i = 0;
    int j = size - 1;

    while(i<=j){
        if(arr[i]==0 && arr[j]!=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        else if( arr[i]==0 && arr[j]==0){
            j--;
        }
        else if(arr[i]!=0 && arr[j]==0){
            i++;
        }
        else if(arr[i]!= 0 && arr[j]!=0){
            i++;
        }
       
    }
}

    public static void display(int []arr,int size){
    
    for(int i = 0 ; i<size;i++){
        System.out.printf("%d ",arr[i]);
    }
    System.out.println("");
}
    public static void main(String []args){
        int arr[] ={1,0,3,0,12};
        int size = arr.length;

        display(arr,size);
        moveZeros(arr,size);
        display(arr,size);

    }
}