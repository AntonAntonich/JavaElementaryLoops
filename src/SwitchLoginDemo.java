import java.util.Scanner;

public class SwitchLoginDemo {
    // Программа принриает id  и выдает роль соотвествующую это id
    // в зависимости от роли выдются разрешени та те или иные действия

    public static void main(String[] args) {
        final String ADMIN_ROLE = "ADMINISTRATOR";
        final String USER_ROLE = "USER";
        final String GUEST_ROLE = "GUEST";

        final int ADMIN_ID = 1;
        final int USER_ID = 2;
        final int GUEST_ID = 3;




        String userRole = "default";
        int userId;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your id");
        userId = scanner.nextInt();


//        if (userId == ADMIN_ID) {
//            userRole = ADMIN_ROLE;
//        } else if (userId == USER_ID) {
//            userRole = USER_ROLE;
//        } else if (userId == GUEST_ID) {
//            userRole = GUEST_ROLE;
//        } else {
//            System.out.println("Error !");
//        }


        switch(userId) {
            case ADMIN_ID:
                System.out.println("in case 1");
                userRole = ADMIN_ROLE;
                break;

            case USER_ID:
                System.out.println("in case 2");
                userRole = USER_ROLE;
                break;

            case GUEST_ID:
                System.out.println("in case 3");
                userRole = GUEST_ROLE;
                break;

            default:
                System.out.println("Error !");
        }


        System.out.println("user with id: " + userId + " has role: " + userRole);
    }
}
