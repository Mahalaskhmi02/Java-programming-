class String_Test{
public static void main(String args[]){
String s="My name is maha";
String[] strArray=s.split(" ");
for(int i=strArray.length-1;i>=0;i--)
System.out.print(strArray[i]+"");
}
}