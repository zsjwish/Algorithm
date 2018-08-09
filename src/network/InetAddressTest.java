package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * created by zsj in 11:28 2018/6/29
 * description:
 **/
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress moocAdd = InetAddress.getByName("www.mooctest.net");
        InetAddress localAdd = InetAddress.getLocalHost();
        System.out.println("localAddress" + localAdd.getHostAddress());
        System.out.println("moocAddress" + moocAdd.getHostAddress());

    }
}
