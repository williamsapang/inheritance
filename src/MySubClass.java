public class MySubClass extends MySuperClass{

    String commonStr = "sub common string";

    public MySubClass(String constructorStr){
        super(constructorStr);
        System.out.println("subclass constructor");
    }

    public void MySubClassMethod(){
        System.out.println("subclass method");
    }

    public void printCommonString(){
        System.out.println(commonStr);
        System.out.println(super.commonStr);
    }

    public void commonMethod(){
        System.out.println("sub common method");
    }

    public void printCommonMethod(){
        commonMethod();
        super.commonMethod();
    }

}
