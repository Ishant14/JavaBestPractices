### 1) Why do abstract classes in Java have constructors?

A constructor in Java doesn't actually "build" the object, it is used to initialize fields.

Imagine that your abstract class has fields x and y, and that you always want them to be initialized in a certain way,
no matter what actual concrete subclass is eventually created. So you create a constructor and initialize these fields.

Now, if you have two different subclasses of your abstract class, when you instantiate them their constructors will be called, 
and then the parent constructor will be called and the fields will be initialized.

If you don't do anything, the default constructor of the parent will be called. However, you can use the super keyword 
to invoke specific constructor on the parent class.

