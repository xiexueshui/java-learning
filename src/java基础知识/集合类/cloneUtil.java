import java.io.*;

/**
 * @auther xxs
 * @date 2021-05-24
 * 深克隆工具类
 */
public class cloneUtil {
    /**
     * Object序列化
     * @param o
     * @return
     */
    public static byte[] serialize(Object o){
        ObjectOutputStream objectOutputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(o);
            byte[] bytes = byteArrayOutputStream.toByteArray();
            return bytes;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(objectOutputStream);
            close(byteArrayOutputStream);
        }
        return null;

    }

    /**
     * Object反序列化
     * @param bytes
     * @return
     */
    public static Object unSerialize(byte[] bytes){
        ObjectInputStream objectInputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bytes);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            close(objectInputStream);
            close(byteArrayInputStream);
        }
        return null;

    }

    /**
     * 关闭io流对象
     *
     * @param closeable
     */
    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 深克隆
     * @param o
     * @return
     */
    public  static <T extends Serializable> T deepClone(T o){
        return (T) unSerialize(serialize(o));
    }
}
