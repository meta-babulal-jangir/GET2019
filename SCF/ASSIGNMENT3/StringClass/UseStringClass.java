public class UseStringClass{
    public static void main(String args[])
    {
        StringClass string=new StringClass();
        System.out.println(string.checkEquals("hellou","hellow"));
        System.out.println(string.reverseString("hellow"));
        System.out.println(string.changeCase("heLLow"));
        System.out.println(string.getLargestWord("hello  how   You I Am Doing Work at metacube Software Company "));  
    }
}
