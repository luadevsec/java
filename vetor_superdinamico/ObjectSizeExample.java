package vetor_superdinamico;

import org.openjdk.jol.info.ObjectLayout;

public class ObjectSizeExample {
    public static void main(String[] args) {
        Object obj = new Object();
        long objectSize = ObjectLayout.parseInstance(obj).instanceSize();
        System.out.println("Tamanho do objeto em bytes: " + objectSize);
    }
}
