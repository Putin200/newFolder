public class Woof {
    private String name;
    private String weight;
    private String color;
    private String poroda;

    public void east(){
    }

    public void all_data(String name, String weight, String color, String poroda){
        setName(name);
        setWeight(weight);
        setColor(color);
        setPoroda(poroda);
    }

    public String getAll_data(){
        return "Кличка собаки - " + getName() + " Вес - " + getWeight() + " Окраска - " + getColor() + " Порода - " + getPoroda();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setPoroda(String poroda){
        this.poroda = poroda;
    }

    public String getPoroda(){
        return poroda;
    }
}
