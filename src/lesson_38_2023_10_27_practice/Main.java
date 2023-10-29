package lesson_38_2023_10_27_practice;

import lesson_38_2023_10_27_practice.repositories.UsersRepository;
import lesson_38_2023_10_27_practice.services.UsersService;
import lesson_38_2023_10_27_practice.view.Menu;

// Created by Volodymyr Sh on 27.10.2023
// project name: AIT_Lessons
public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepository();
        UsersService usersService = new UsersService(usersRepository);
        Menu menu = new Menu(usersService);
        menu.run();


    }
}
