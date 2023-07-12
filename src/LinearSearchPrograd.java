import java.util.Scanner;

public class LinearSearchPrograd {
    public static int linearSearchOfElement(int[] array,int k)
    {
        int count=0;
        for(int i:array)
        {
            if(i==k)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        int k=scanner.nextInt();
        System.out.println(linearSearchOfElement(array,k));
    }
}
