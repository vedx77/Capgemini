@FunctionalInterface
interface Demo
{
    public void add();
}

interface Demo1
{
    public int sub(int a, String b);
}

class CompDemo
{

    public static void main(String args[])
    {
        Demo d = ()-> {
            System.out.print("Hello");
        };
        d.add();
        Demo1 obj = (x,y) -> {
            System.out.println("Demo1 working b:"+y);
            return x;
        };
        System.out.println(obj.sub(35,"Raisoni"));
    }
}