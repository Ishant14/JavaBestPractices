```java

public class Maths<T> {

    T obj1;
    T obj2;

    Maths(T obj1, T obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T sum(){
        if(obj1.getClass()==Integer.class && obj2.getClass() ==Integer.class){
            return (T)(Integer)((Integer)obj1 + (Integer) obj2);
        }

        if(obj1.getClass()==String.class && obj2.getClass() ==String.class){
            return (T)(String)((String)obj1 + (String) obj2);
        }
        return null;
    }


}
```
