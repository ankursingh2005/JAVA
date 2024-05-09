public class Inherritage {
    class A
    {
        void display()
        System.out.println("class A");
    }
}
class B extends class A
{
    void display()
    {
        System.out.println("class B");
    }
}
class C extends class a
{
    void display()
    {
        System.out.println("class C");
    }
}
class D
{
    public static void main(String a[])
    {
        B obj1=newB();
        c obj2=newC();
        obj1.display();
        obj2.display();
    }
}