public class Sorting {
   

    public static void main(String[] args) {
        
        int a[] = {7,8,3,1,2};
             //bubbleSort(a, a.length);
           
           selectionSort(a, a.length);
           printArray(a);
          
            
    }

    public static void bubbleSort(int a[], int n)
    {
        for(int i = 0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1]){
                    // System.out.print(a[j] + " ");
                   // printArray(a);
                    swap(a, j, j+1);
                }
            }
        }
   

    }

    public static void selectionSort(int a[], int n)
    {
        int smallest = 0;
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[smallest]>a[j])
                    {
                            smallest = j;
                    }
                }
                swap(a, smallest,i);
            }

    }

    public static void swap(int arr[], int i, int j )
    {

        int temp = arr[i];
         arr[i] = arr[j];
         arr[j]=temp;
       
    }
    public static void printArray(int a[])
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
