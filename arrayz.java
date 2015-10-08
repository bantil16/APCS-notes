  import java.util.Arrays;
  import java.util.Random;
  public class arrayz 
  {
int[] array = new int[10];
Random randomInt = new Random();
int k;

public int shuffle(array[k])
{
    for(int i = 0; i < array.Length; i++)
    {
        int temp = 1 + randomInt.nextInt(array.length);
        for(int j = i; j < array.length; j++)
        {
            if (temp!= array[j] && temp!= array[i])
            {
                array[i] = temp;
            }
        }
    }
}

public static void main(String[] args)
{
    shuffle();
    System.out.println(Arrays.toString(array));
}
}