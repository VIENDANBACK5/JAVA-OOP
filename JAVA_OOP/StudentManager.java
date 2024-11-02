import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private static final String FILE_NAME = "student.dat";

    // Hiển thị danh sách sinh viên
    public void displayStudents() {
        List<Student> students = readStudents();
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Thêm sinh viên vào cuối file
    public void addStudent(Student student) {
        try (ObjectOutputStream oos = new AppendableObjectOutputStream(new FileOutputStream(FILE_NAME, true))) {
            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc danh sách sinh viên từ file
    @SuppressWarnings("unchecked")
    private List<Student> readStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                students.add((Student) ois.readObject());
            }
        } catch (EOFException e) {
            // Đã đọc hết file
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}