public class Gopher{
    private String color;
    private String weight;
    private String size;

    public void east(){
    }
    public void all_data(String color,String weight,String size) {
        setColor(color);
        setWeight(weight);
        setSize(size);
    }
    public String getall_data() {
        return "окрас суслика:" + getColor() + " вес суcлика:" + getWeight() + "размер суслика: " + getSize();}


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(String weight) {
        this.weight = weight;

    }

    public String getWeight() {
        return weight;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    //dfggadfku
}



