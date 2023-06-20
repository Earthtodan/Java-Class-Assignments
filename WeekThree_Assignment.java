public class WeekThree_Assignment {
        public static void main(String[] args) {

            String firstName = "ram_bethina";

            String[] nameParts = firstName.split("_");
            String capitalizedFirstName = nameParts[0].substring(0,1).toUpperCase() + nameParts[0].substring(1);
            String capitalizedLastName = nameParts[1].substring(0,1).toUpperCase() + nameParts[1].substring(1);
            String fullName = capitalizedFirstName + " " + capitalizedLastName;

            System.out.println("Name: "+fullName); /*HOMEWORK, REPLACE WITH A FUNCTION IN THE STRING CLASS THAT REPLACES _ WITH EMPTY SPACE>);*/
        }
}

