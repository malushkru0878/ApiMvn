package ru.netology.main;

import ru.netology.api.FormDate;
import ru.netology.api.Post;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.passport = "9999 № 99900099";
        post.patronymic = "Иванович";
        post.phone = "+7(999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }

}