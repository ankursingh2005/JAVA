public class Maxmidmin {
   public static void main(String a[]){
int x,y,z,max,mid,min;
x=10;
y=12;
z=13;
if(x>y && x>z)
{
    max=x;
    if(y>z){
        mid=y;
        min=z;
    }
    else{
    mid=z;
    min=y;
}
   }
   else if(y>x && y>z)
   max=y;
   if(x>z)
   {
    mid=x;
    min=z;
    else{
        mid=z;
        min=x;
    }
   }
  else (z>x && z>y){
    max=z;
    if(x>y)
    {
        mid=x;
        min=y;
        else{
            mid=y;
            min=x;
            System.out.println("max value="+max);
            System.out.println("mid value="+mid);
            System.out.println("min value="+min);
        }
    }
}
