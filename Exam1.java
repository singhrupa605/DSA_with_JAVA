public class Exam1 {
    public static void main(String[] args) {
        

        int a[] = {5,4,3,2,1};
        selectionSort(a, a.length);
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i] + " ");
       }
    }

    public static void bubbleSort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                    if(a[j]>a[j+1])
                    {
                            swap(a, j, j+1);
                    }
            }
        }
    }

    public static void selectionSort(int a[],int n)
    {
        int smallest = 0;
        for(int i=0;i<n-1;i++)
        {
            smallest = i;
            for(int j=i+1;j<n;j++)
            {
                    if(a[j]<a[smallest])
                    {
                           smallest = j;
                    }
            }
            swap(a, smallest,i);
        }
    }

        public static void swap(int a[],int i,int j)
        {
            int temp = a[i];
            a[i] = a[j];
             a[j] = temp;
        }

}
