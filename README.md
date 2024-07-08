**Multithreading in Java**

MultiThreadClass extends the "Thread" class to execute the threads. In the class, we override the "run" method and put our code in the method. From the main class, we create an object of the class and execute the "start" method to call our function.

MultiThreadClass2 implements the "Runnable" interface to execute the threads. Here, in the main class, we create an object of the "Thread" class and execute the "start" function through that object.

Most of the execution is similar in both the cases but implementing the Runnable interface allows us to do multiple inheritance, which is not possible when extending the Thread class.
