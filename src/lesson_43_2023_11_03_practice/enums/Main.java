package lesson_43_2023_11_03_practice.enums;

import java.util.Arrays;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setRole(UserRole.ADMIN);
        user.setRole(UserRole.CLIENT);
        user.setRole(UserRole.MANAGER);
        user.setRole(UserRole.GUEST);

        System.out.println("=================");
        UserRole role = UserRole.MANAGER;
        String roleToString = role.toString();
        System.out.println("roleToString: " + roleToString);

        int ordinal = role.ordinal();
        System.out.println("ordinal: " + ordinal);

        UserRole[] roles = UserRole.values();
        System.out.println(Arrays.toString(roles));

        Size size = Size.S;
        System.out.println(size.getUsa());

        System.out.println(UserRole.ADMIN.equals(UserRole.MANAGER));

    }
}
