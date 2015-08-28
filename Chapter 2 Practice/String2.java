public class String2
{
    public static void main(String[] args)
    {
        String animal1= "quick brown fox ";
        String animal2= "lazy dog ";
        String article= "The ";
        String action= "jumps over ";
        String message= article.concat(animal1.concat(action.concat(article.concat(animal2))));
        System.out.println(message);
        String alpha1=" abc ";
        String alpha2=" def";
        String alpha3="ghi ";
        message=alpha1+alpha2+alpha3;
        System.out.println(message);
    }
}