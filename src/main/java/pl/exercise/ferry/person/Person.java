package pl.exercise.ferry.person;

import java.math.BigDecimal;

public class Person {
    private PaxType paxType;

    public Person(PaxType paxType) {
        this.paxType = paxType;
    }
    public int getPrize(){
        if(paxType == PaxType.CHILD) return 0;
        else if (paxType == PaxType.CHILD) return 5;
        else if (paxType == PaxType.ADULT) return 10;
        else return 5;
    }

}
