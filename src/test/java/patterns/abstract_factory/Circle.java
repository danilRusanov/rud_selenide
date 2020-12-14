package patterns.abstract_factory;

public class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println(getClass());
    }
}
