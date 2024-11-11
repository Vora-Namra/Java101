package Interface;

public class Car implements Engine, Media,Brake{

    @Override
    public void brake() {
        // TODO Auto-generated method stub
        System.out.println("brake of car");
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Strating the car");
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Stop the car");
    }

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("Accelerate the car");
    }


    
    
}
