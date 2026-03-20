final class Vehicle {
    void display() {
        System.out.println("This is a vehicle.");
    }
}

class FinalClassDemo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}