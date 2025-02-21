public class SumofArray {
    public static void main(String[] args)
    {
        int[] myarray = {1,2,3};
        int sum =0;

        for (int i =0 ;i<myarray.length ;i++)
        {
            sum= sum +myarray[i];
        }
        System.out.println(" "+sum);

    }
}
