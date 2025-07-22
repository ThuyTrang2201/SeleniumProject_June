package day4;

public class Day4_Student {

    public static void main(String[] args) {
        Day4_Person paul = new Day4_Person();
        paul.setAge(18);
        paul.setName("Paul Marker");
        paul.setPhonenumber("012545588");
        System.out.println("Name: " + paul.getName() + ", Age:" + paul.getAge() + ", Phone number:" + paul.getPhonenumber());

        Day4_Person peter = new Day4_Person();
        peter.setAge(28);
        peter.setName("Paul Bin");
        peter.setPhonenumber("0125458756");
        System.out.println("Name: " + peter.getName() + ", Age:" + peter.getAge() + ", Phone number:" + peter.getPhonenumber());
    }
}
