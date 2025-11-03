public class QuickSort {
    public static void printArray(int[]k){
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }
    }
    public static int partition(int[] a, int si, int ei){
//        if(si<=ei) return;
        int pivot=a[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;

        return i;
    }
    public static void qSort(int[]a, int si, int ei){
        if(si>=ei) return;
        int pIdx=partition(a,si,ei);

        qSort(a,si,pIdx-1); //left
        qSort(a,pIdx+1,ei); //right
    }
    public static void main(String[] args) {
        int[]a={6,2,9,1,4,3,8,-4,-6};
        qSort(a,0,a.length-1);
        printArray(a);
    }
}
