package patterns.abstract_factory;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println(getClass());
    }

}
