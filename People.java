public class People {
    public String toString() {
        return "Name: " + name + ", Height: " + height + ", BMI: " + bmi();
    }

    public void addChild(People p) {
        this.children.add(p);
        p.setFather(this);
    }

    public boolean isSibling(People p) {
        return false;
    }

    public static void main(String[] args) {
        // Test People class
        People person = new People(name: "John", height: 1);
        System.out.println(person);

        // Test parent relationship
        People father = new People(name: "Mark", height: 1);
        person.setFather(father);
        System.out.println("Father: " + person.getFather());

        person.setBirthDayYear(1985); // Comment indicates this might not be needed
    }
}
