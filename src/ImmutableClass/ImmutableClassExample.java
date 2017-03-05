package ImmutableClass;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by igaurav on 3/5/2017.
 */
public final class ImmutableClassExample {

    private final int  id;
    private  final String name;
    private final HashMap<String,String> hashMap;

    public int getId(){
        return  id;
    }

    public  String getName(){
        return name;
    }

    public HashMap<String,String> getHashMap(){
        return (HashMap<String,String>) hashMap.clone();
    }

    /*public ImmutableClassExample(int id,String name,HashMap<String,String> testHashMap){
        System.out.println("Performing Deep Copy for Object Initialisation:");
        this.id=id;
        this.name=name;
        HashMap<String,String> hashMap1 = new HashMap<String, String>();
        String key;
        Iterator<String> it = testHashMap.keySet().iterator();
        while (it.hasNext()){
            key = it.next();
            hashMap1.put(key,testHashMap.get(key));
        }
        this.hashMap = hashMap1;
    }*/


    public ImmutableClassExample(int id,String name, HashMap<String,String> testHashMap){
        System.out.println("Performing Shallow Copy for Object Initialisation:");
        this.id= id;
        this.name= name;
        this.hashMap = (HashMap<String, String>) testHashMap.clone();
    }

    public  static void main(String args[]){
        HashMap<String,String> h1= new HashMap<String,String>();
        h1.put("1","first");
        h1.put("2","second");
        String s= "original";
        int i=10;
        ImmutableClassExample im = new ImmutableClassExample(i,s,h1);

        //Lets see whether its copy by field or copy by reference
        System.out.println(s==im.getName());
        System.out.println(h1==im.getHashMap());
        //print the im values
        System.out.println("im id:"+im.getId());
        System.out.println("im name:"+im.getName());
        System.out.println("im hashMap:"+im.getHashMap());

        //Chnage the local varibales
        i=20;
        s="modified";
        h1.put("3","third");
        //print the values again
        System.out.println("im id after local variables:"+ im.getId());
        System.out.println("im name after local variables:"+im.getName());
        System.out.println("im testMap after local variables:"+im.getHashMap());

        HashMap<String,String> hmTest=im.getHashMap();
        hmTest.put("4","new");
        System.out.println("im getHapsMap valeu after changing variable from accessor"+im.getHashMap());

    }

}
