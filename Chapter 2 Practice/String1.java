public class String1
{
    public static void main(String[] args)
    {
        String greeting = "Hello, World!";
        int n = greeting.length();
        
        System.out.println("Length = " + n);
        
        String river = "Mississippi";
        String bigRiver= river.toUpperCase();
        System.out.println( "river: " + river + "\nbigRiver: " + bigRiver );
    }
}