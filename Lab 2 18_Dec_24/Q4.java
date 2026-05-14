class ObjectCounter {
    // Static variable to count the number of objects
    private static int objectCount = 0;

    // Constructor increments the count each time an object is created
    public ObjectCounter() {
        objectCount++;
    }

    // Static method to get the current object count
    public static int getObjectCount() {
        return objectCount;
    }
}

public class Q4 {
    public static void main(String[] args) {
        // Create objects of the class
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Print the total number of objects created
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}

