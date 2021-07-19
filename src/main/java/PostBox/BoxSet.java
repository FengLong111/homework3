package PostBox;

public class BoxSet {
    float length;
    float width;
    int height;

    public BoxSet(float length, float width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public boolean validate(float length, float width, int height) {
        boolean box = false;
        if (this.length > length && this.width > width && this.height > height){
            box = true;
        }
        return box;
    }
}
