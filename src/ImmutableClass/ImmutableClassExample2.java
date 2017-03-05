package ImmutableClass;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by igaurav on 3/5/2017.
 */
public final class ImmutableClassExample2
{
    private final int  id;
    private  final String name;
    private final String[] nameArray;

    public int getId(){
        return  id;
    }

    public  String getName(){
        return name;
    }

    public String[] getNameArray() {
        return nameArray.clone();
    }

    public ImmutableClassExample2(int id, String name, String[] nameArray) {
        this.id = id;
        this.name = name;
        this.nameArray = nameArray.clone();
    }

    public  static void main(String args[]){
        int i=10;
        String name="original";
        String nameArray[]={"ishant","gaurav"};

        ImmutableClassExample2 im = new ImmutableClassExample2(i,name,nameArray);

        System.out.println(i==im.getId());
        System.out.println(name==im.getName());
        System.out.println(nameArray==im.getNameArray());

        i=20;
        name="modified";
        nameArray[0]="java";

        System.out.println("Values after local variable changed");
        System.out.println("im id value :"+im.getId());
        System.out.println("im name value:"+im.getName());
        System.out.println("im array value:"+im.getNameArray()[0]);

    }

}
