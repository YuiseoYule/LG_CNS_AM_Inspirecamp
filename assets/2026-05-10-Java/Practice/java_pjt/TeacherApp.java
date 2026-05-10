public class TeacherApp {

    public static void main(String[] args) {

        Teacher tea = new Teacher(); 
        /*
        What does ***Teacher tea*** gonna do?  
        it define the variable, this is reference type
        (different from Primitive Type that we have learned)
        so, class itself become a kind of type of variable

        What does new Teacher() gonna do?
        It create an object (instance) from the 'class' (Teacher)
        */

        tea.name = "jslim";
        System.out.println(tea.name);
        /*
        Current     status of tea
        Field	    Type	    Current State (after assignment)
        name	    String	    "jslim"
        age	        int	        0 (Default, until assigned)
        address	    String	    null (Default, until assigned)
        isMarriage	boolean	    false (Default, until assigned)
        */
       tea.eating() ;
       

       String result = tea.teaching("Java");
        System.out.println(result);
    }
}