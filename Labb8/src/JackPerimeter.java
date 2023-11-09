public class JackPerimeter {
    private int length = 0;
    private int width = 0;

    JackPerimeter(){}
    JackPerimeter(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void setLength(int length){
            this.length = length;
    }
    public void setWidth(int width){
            this.width = width;
    }
    public int getLength(){
        return this.length;
    }
    public int getWidth(){
        return this.width;
    }
    public int getPerimeter(){
        return 2*(this.length+this.width);
    }
}
