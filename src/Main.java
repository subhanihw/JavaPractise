import java.util.stream.IntStream;

class Main
{
    public static void main (String[]args)
    {

//        System.out.println(findFactor(220));
//        System.out.println(findFactor(284));
//        int n = 10;
//        IntStream.range(1, 11).forEach(ele -> System.out.println(ele + " x " + n + " = " + (ele * n)));
        String s = "  sdsd    sds    ";
        System.out.println(s.isBlank());
        System.out.println(s.strip());
        System.out.println(s.stripLeading().replace(" ", "#"));
        System.out.println(s.stripTrailing().replace(" ", "#"));
        System.out.println(s.trim());
        System.out.printf("Naruto %s hello\n", s);
    }

    static int findFactor (int n)
    {
        int i, sum = 0;
        boolean flag = false;

        for(i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
                sum += i;

            if(i == n/i)
                flag = true;
        }
        if(flag)
            i -= 2;

        for(; i >= 1; i--)
        {
            if (n % i == 0)
                sum += (n/i);
        }
        return sum - n;
    }
}