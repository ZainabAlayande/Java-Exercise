package PathCreated;

public class PathsClass implements PathInterface {

    private PathsClass() {

    }

    public static PathInterface get() {
        return new PathsClass();
    }
}
