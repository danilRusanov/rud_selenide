package patterns.abstract_factory;

public class ShapeFactory {

    public Shape getShape(Type type){

        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Circle();
            case TRIANGLE:
                return new Circle();
            default:
                System.out.println("System doesn't have newPerson shape and return default as circle");
                return new Circle();
        }
    }

    enum Type {
        CIRCLE, SQUARE, TRIANGLE
    }

}
