public class Rectangle {

    private int left, top, width, height;

    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

    public void initialize(Rectangle anotherRectangle) {
        this.left = anotherRectangle.left;
        this.top = anotherRectangle.top;
        this.width = anotherRectangle.width;
        this.height = anotherRectangle.width;
    }
}

