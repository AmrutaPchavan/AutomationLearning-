public class LowestNumber
{ public static void main (String[] args)
{
    int[] num ={19,45,37,12};
    int lownum =num[0];

    for(int i =0 ;i<num.length;i++)
    { if(lownum > num[i])
    {
        lownum = num[i];

    }

    }
    System.out.println(" "+lownum);

}
}
