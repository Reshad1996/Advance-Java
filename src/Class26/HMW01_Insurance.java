package Class26;

import java.util.ArrayList;

public abstract class HMW01_Insurance {

        /* Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour
           as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
           as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
           Using for loop/advanced for loop/ iterator access all methods of the class.
        */

        String insuranceName;

        public HMW01_Insurance(String insuranceName) {
                this.insuranceName = insuranceName;
        }

        public abstract void getQuote();

        public abstract void cancelInsurance();

}

class Car extends HMW01_Insurance {

        String carModel;

        public Car(String insuranceName,String carModel) {
                super(insuranceName);
                this.carModel = carModel;
        }

        @Override
        public void getQuote() {
                System.out.println("The quote of "+insuranceName+" insurance for "+carModel+" is 200$ per month");
        }

        @Override
        public void cancelInsurance() {
                System.out.println("The cancellation of "+insuranceName+" insurance services will take one week");
        }
}

class Pet extends HMW01_Insurance {

        String petType;

        public Pet(String insuranceName, String petType) {
                super(insuranceName);
                this.petType = petType;
        }

        @Override
        public void getQuote() {
                System.out.println("The quote of "+insuranceName+" insurance for "+petType+" is 30$ per month");
        }

        @Override
        public void cancelInsurance() {
                System.out.println("The cancellation of "+insuranceName+" insurance services will take two days");
        }
}

class Health extends HMW01_Insurance {

        public Health(String insuranceName) {
                super(insuranceName);
        }

        @Override
        public void getQuote() {
                System.out.println("The quote of "+insuranceName+" insurance for health  is 120$ per month");
        }

        @Override
        public void cancelInsurance() {
                System.out.println("The cancellation of "+insuranceName+" insurance services will take three days");
        }
}

class test {
        public static void main(String[] args) {

                Car car = new Car("GEICO","BMW");
                Pet pet = new Pet("Many pets","Dog");
                Health health = new Health("Cinga");

                ArrayList<HMW01_Insurance> insurance = new ArrayList<>();
                insurance.add(car);
                insurance.add(pet);
                insurance.add(health);

                for (var ins:insurance) {
                        ins.getQuote();
                        ins.cancelInsurance();
                }

        }
}