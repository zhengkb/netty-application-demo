package serializer;

public interface Serializer {

    byte JSON_SERIALIZER = 1;

    Serializer DEFAULT = new JSONSerializer();

    byte getSerializerAlgorithm();

    byte[] serialize(Object obj);

    <T> T deserialize(Class<T> clazz, byte[] bytes);
}
