public class WeekFourAssignment {
    public static void main(String[] args) {
        String firstName = "abraham";
        String lastName = "lincoln";

        String primaryPhone = "555-123-1245";
        String secondaryPhone = "555.123.1246";

        // Call to methods that sanitize input.
        String capitalizedFirstName = sanitizeName(firstName);
        String capitalizedLastName = sanitizeName(lastName);
        String fullName = capitalizedFirstName + " " + capitalizedLastName;

        String cleanPrimaryPhone = sanitizePhone(primaryPhone);
        String cleanSecondaryPhone = sanitizePhone(secondaryPhone);

        // Print results.
        System.out.println("Name: " + fullName);
        System.out.println("Primary Phone: " + cleanPrimaryPhone);
        System.out.println("Secondary Phone:" + cleanSecondaryPhone);
    }

    //method to sanitize names
    public static String sanitizeName(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static String sanitizePhone(String phone) {
        return phone.replaceAll("-","")
                .replaceAll("\\.","")
                .replaceAll("\\(","")
                .replaceAll("\\)","");
    }


    //method to sanitize phone numbers

}
