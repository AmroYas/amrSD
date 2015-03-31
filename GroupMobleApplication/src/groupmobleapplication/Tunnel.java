/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupmobleapplication;

import com.jcraft.jsch.*;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
public class Tunnel {

    public void connection() throws Exception {
        String host = "jaguar.wmin.ac.uk";
        String user = "w1439058";
        String password = "zumarik101";
        int port = 22;

        int tunnelLocalPort = 9080;
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
