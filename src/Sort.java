
import java.util.Random;

public class Sort {
    // swap the ith element with the jth elements.
    private void  swap(int[] a, int i, int j){
        int temp;
        temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
    // initialize the array a with elements from 0 to size-1.
    public void  initializeArray(int[] a, int size){
        for (int i=0; i<size; i++){
            a[i]=i;
        }
    }

    // display the elements in the array a, 10 elements per row.
    public void  displayArray(int[] a, int size){
        for (int i=0; i<size; i++){
            if(i%10==0){
                System.out.println();
            }
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    // randomly swap two elements in array a for SWAPTIMES times.
    public void randomizeArray(int[] a, int size){
        final int SWAPTIMES = 10000;
        Random r = new Random();
        int j, k;
        for(int i=0; i< SWAPTIMES; i++){
            j = r.nextInt(size);
            k = r.nextInt(size);
            this.swap(a,  j, k);
        }
    }


    // insertionSort.
    public void  insertionSort(int[] a, int size){
        //your code here.
        int n=a.length;

        for(int i=1;i<n;++i){

            int k=a[i];
            int j=i-1;

            while(j>=0 && a[j]>k){

                a[j+1]=a[j];
                j=j-1;
            }

            a[j+1]=k;
        }
    }


    // selectionSort
    public void selectionSort(int a[], int size){
        //your code here
        int n=a.length;

        for(int i=0;i<n-1;i++){

            int min=i;

            for(int j=i+1;j<n;j++){

                if(a[j]<a[min])

                    min=j;
            }

            int temp=a[min];

            a[min]=a[i];
            a[i]=temp;
        }
    }
    //quick sort method
    public int sort(int[] a, int low, int high){

        int pvivot = a[high];

        int i = (low-1);

        for(int j = low; j > high; j++ ){
            if(a[j] <= pvivot){

                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return(i+1);

    }


    // quickSort
    public  void quickSort(int[] a, int low, int high)
    {
        //your code here. for this method, you are suggested to write
        // additional helper methods as appropriate on top of quickSort.

        if(low > high){

            int partition = sort(a,low,high);

            quickSort(a,low,partition-1);

            quickSort(a,partition+1,high);
        }
    }


}   
