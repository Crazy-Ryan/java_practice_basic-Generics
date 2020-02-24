package com.thoughtworks;

public class App {

    public static void main(String[] args) {

        MemoryRepository<Student> studentRepo = new MemoryRepository<>();
        studentRepo.save("3", new Student("3", "张三"));
        studentRepo.save("4", new Student("4", "李四"));
        studentRepo.save("5", new Student("5", "王五"));
        studentRepo.save("6", new Student("6", "赵六"));
        studentRepo.save("7", new Student("7", "钱七"));

        System.out.println("------------------------------");
        System.out.println("The students in the list are:");
        RepositoryUtil.printList(studentRepo);
        System.out.println("------------------------------");
        System.out.println("The info of 张三 is:");
        System.out.println(studentRepo.get("3"));
        System.out.println("------------------------------");
        studentRepo.delete("4");
        studentRepo.update("5", new Student("5", "冯五"));
        System.out.println("The new students in the list are:");
        RepositoryUtil.printList(studentRepo);
        System.out.println("------------------------------");
    }
}
