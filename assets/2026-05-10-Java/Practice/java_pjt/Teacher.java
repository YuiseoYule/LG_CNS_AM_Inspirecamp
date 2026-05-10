public class Teacher {

    public String name;
    public int age;
    public String address;
    public boolean isMarraige; // Note: 'isMarried' is the standard naming convention

    public void eating() {
        System.out.println("Have a meal for giving a lecture.");
    }

    public String teaching(String subject) {
        return "The subject what instructor teach is " + subject + " .";
    }
}