class ReverserStringwithoutinbldfunction{
    public static void main (String[] args){
String Str = "Greeks";char ch;
String R=" ";
int i; for(i=0;i<Str.length();i++)
{ ch = Str.charAt(i);
R=ch+R;
}
System.out.println(" "+R);
}
}
