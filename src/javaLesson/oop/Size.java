package javaLesson.oop;

public enum Size {

    VERY_SMALL("XS"), SMALL("S"),  AVERAGE("M"), BIG("L"), VERY_BIG("XL"), UNDEFINED("") ;

    Size (String abbreviatation) {
this.abbreviatation = abbreviatation;
    }
    private String abbreviatation;

    public String getAbbreviatation() {
        return abbreviatation;
    }
}

