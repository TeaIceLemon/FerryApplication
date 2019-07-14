package pl.exercise.ferry.transport;

public class Person {
    private PaxType paxType;
    private int age;
    private String name;
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        if (age <= 5) this.paxType = PaxType.CHILD;
        else if (age > 5 && age <= 18) this.paxType = PaxType.YOUNG;
        else if (age > 18 && age <= 70) this.paxType = PaxType.ADULT;
        else if (age > 70) this.paxType = PaxType.SENIOR;

    }
    public int getPrize(){
        if(paxType == PaxType.CHILD) return 0;
        else if (paxType == PaxType.YOUNG) return 5;
        else if (paxType == PaxType.ADULT) return 10;
        else if (paxType == PaxType.SENIOR) return 5;
        else return 0;
    }

    public PaxType getPaxType() {
        return paxType;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return "Name: " + getName() + " ,Age: " + getAge() + " ,Pax: " + getPaxType() +
                " ,Ticket prize: " + getPrize();
    }


}
