package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(String.valueOf(1));
            InputStream inputStream = new FileInputStream(String.valueOf(1));

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User user = new User();
            user.setMale(true);
            SimpleDateFormat simpleDate = new SimpleDateFormat("dd/M/yyyy");
            Date date = simpleDate.parse("10/10/1989");
            user.setBirthDate(date);
            user.setFirstName("Bugs");
            user.setLastName("Bunny");
            user.setCountry(User.Country.OTHER);
            javaRush.users.add(user);

            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            PrintWriter writer = new PrintWriter(outputStream);
            if (this.users.size() > 0){
                for (User user : this.users) {
                    writer.println(user.isMale() + "/" + user.getBirthDate().getTime() + "/" + user.getFirstName()
                            + "/" + user.getLastName() + "/" +user.getCountry());
                    writer.flush();
                }
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String userInfo;
            while ((userInfo = reader.readLine()) != null){
                String[] s = userInfo.split("/");
                User user = new User();
                user.setMale(Boolean.parseBoolean(s[0]));
                user.setBirthDate(new Date(Long.parseLong(s[1])));
                user.setFirstName(s[2]);
                user.setLastName(s[3]);
                user.setCountry(User.Country.valueOf(s[4]));
                users.add(user);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
