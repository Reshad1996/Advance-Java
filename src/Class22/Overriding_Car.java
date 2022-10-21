package Class22;

public class Overriding_Car {

    void start() {
        System.out.println("Use the key to start me");
    }
    void stop() {
        System.out.println("Use brakes to stop m");
    }
    void park() {
        System.out.println("Park me manually");
    }
}

class BMW extends Overriding_Car {

    void start() {
        System.out.println("Use the push start to start me");
    }
    void stop() {
        super.stop();
        System.out.println("I can also use auto breaking to stop");
    }
}

class Toyota extends Overriding_Car {

    void start() {
        System.out.println("Use the push start to start me");
    }
}

class Tesla extends Overriding_Car {

    void start() {
        System.out.println("Use the  App to start me");
    }
    void stop() {
        super.stop();
        System.out.println("Use AI and auto breaking to stop me ");
    }
    void park() {
        System.out.println("I can auto park myslef");
    }
}