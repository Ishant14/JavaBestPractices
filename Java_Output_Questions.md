
## Que1 . What will be the output of the following program ?

```java
class Test1 {   
	
	int initialValue =5 ;
	static int y =10;
		
	{
		System.out.println("Block called :"+ initialValue);
	}
	
	static{
		System.out.println("static block called"+y);
	}
	
 Test1(int x) {
     System.out.println("Constructor called " + x);
 }
}

//This class contains an instance of Test1 
class Test2 {    
 
 public static void main(String[] args) {    
      Test1 t1 = new Test1(5);
 }
}
```

```
