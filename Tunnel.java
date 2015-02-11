
import com.jcraft.jsch.*;

public class Tunnel {

 

    public void go() throws Exception {
        String host = "jaguar.wmin.ac.uk";
        String user =  "w1439058";
         String password = "zumarik101";
        int port = 22;

        int tunnelLocalPort = 9080; //following port works just fine if needed change to any avaliable on uour pc/laptop 
        String tunnelRemoteHost = "elephant.ecs.westminster.ac.uk";
        int tunnelRemotePort = 3306;

        JSch jsch = new JSch();
        Session session = jsch.getSession(user, host, port);
        session.setPassword(password);
        localUserInfo lui = new localUserInfo();
        session.setUserInfo(lui);
        session.connect();
        session.setPortForwardingL(tunnelLocalPort, tunnelRemoteHost, tunnelRemotePort);
        System.out.println("Connected");

    }

    class localUserInfo implements UserInfo {

        String passwd;

        public String getPassword() {
            return passwd;
        }

        public boolean promptYesNo(String str) {
            return true;
        }

        public String getPassphrase() {
            return null;
        }

        public boolean promptPassphrase(String message) {
            return true;
        }

        public boolean promptPassword(String message) {
            return true;
        }

        public void showMessage(String message) {
        }
    }
}
