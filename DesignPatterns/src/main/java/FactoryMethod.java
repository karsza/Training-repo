public class FactoryMethod {
    public interface Animal{
        String getAnimal();
        String makeSound();
    }
    public interface Color {
        String getColor();
    }
    public class Duck implements Animal{
        @Override
        public String getAnimal(){
            return "Duck";
        }
        @Override
        public String makeSound(){
            return "Squeks";
        }
    }
    public class Dog implements Animal{
        @Override
        public String getAnimal(){
            return "Dog";
        }
        @Override
        public String makeSound(){
            return "whoof";
        }
    }
    public class White implements Color{
        @Override
        public String getColor(){
            return "White";
        }
    }
    public class Black implements Color{
        @Override
        public String getColor(){
            return "Black";
        }
    }
    public interface AbstractFactory <T>{
        T create (String type);
    }
    public class AnimalFactory implements AbstractFactory{
        @Override
        public Animal create (String animalType){
            if ("Dog".equalsIgnoreCase(animalType)){
                return new Dog();
            }
            else if ("Duck".equalsIgnoreCase(animalType)){
                return new Duck();
            }
            return null;
        }
    }
    public class ColorFactory implements AbstractFactory{
        @Override
        public Color create (String color){
            if ("White".equalsIgnoreCase(color)){
                return new White();
            }
            else if ("Black".equalsIgnoreCase(color)){
                return new Black();
            }
            return null;
        }
    }
    public class FactoryProvider {
        public AbstractFactory getFactory (String choice){
            if ("Animal".equalsIgnoreCase(choice)){
                return new AnimalFactory();
            }
            else if ("Color".equalsIgnoreCase(choice)){
                return new ColorFactory();
            }
            return null;
        }
    }
}
