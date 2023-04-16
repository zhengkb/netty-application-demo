import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public class ByteBufTest {
    public static void main(String[] args) {
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer(9, 100);
        System.out.println("allocate ByteBuf(9,100)" + buffer);

        buffer.writeBytes(new byte[]{1, 2, 3, 4});
        System.out.println("writeBytes(1,2,3,4)" + buffer);



    }
}
