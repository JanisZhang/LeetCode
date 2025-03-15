package test;

import java.io.*;

public class DeepCopyUtil {
    public static <T> T deepCopy(T object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.flush();

        byte[] bytes = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream =
                new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object1 = objectInputStream.readObject();

        return (T) object1;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        PracticeTest practiceTest = new PracticeTest();
        PracticeTest practiceTest1 = DeepCopyUtil.deepCopy(practiceTest);

        System.out.println(practiceTest.equals(practiceTest1));
        System.out.println(practiceTest == practiceTest1);
    }
}
