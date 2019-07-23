package pl.exercise.ferry.transport;

public class Merchandise {
    private String name;
    private int volume;

    public Merchandise(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }


    public int getPrice(){
        return volume * 50;
    }
    @Override
    public String toString(){
        return "name: " + name + ", volume: " + volume + ", shipping prize: " + getPrice();
    }
}
