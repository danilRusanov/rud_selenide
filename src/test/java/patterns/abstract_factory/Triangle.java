package patterns.abstract_factory;

public class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println(getClass());
    }
}
