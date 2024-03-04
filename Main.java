public class Main {

    public static void main(String[] args) {
        String[] students = {"KADİR", "GÖKHAN", "HAKAN", "SUZAN", "PINAR" , "MEHMET",
                "ALİ","EMEL","FIRAT","JAMES","JALE","ERSİN","DENİZ","GÖZDE","ANIL","BURAK"};
        int[] times = {341, 273, 278, 329, 445,402,388,270,243,334,412,393,299,343,317,265};

        maraton manager = new maraton(students, times);

        manager.printTopThree();
        manager.printLowestTimeStudent();
        manager.printSecondBestTime();
        manager.classifyStudents();
    }
}