package com.dosse.upnp;

public class Main {
    public static void main(String[] args) {
        Gateway gateway = UPnP.getGateway();//discover your gateway
        String localIP = "192.168.18.99";//your device ip in LAN

        OpenPortParam openPortParam = new OpenPortParam();
        openPortParam.setExternalPort(51090);//port exposed to external
        openPortParam.setLocalPort(1090);//your device port in LAN
        openPortParam.setDescription("51090");//description
        openPortParam.setUDP(false);//udp port or not
        openPortParam.setLocalIP(localIP);//your device ip in LAN

        OpenPortParam openPortParam2 = new OpenPortParam();
        openPortParam2.setExternalPort(51091);
        openPortParam2.setLocalPort(41091);
        openPortParam2.setDescription("51091");
        openPortParam2.setLocalIP(localIP);

        OpenPortParam openPortParam3 = new OpenPortParam();
        openPortParam3.setExternalPort(13389);
        openPortParam3.setLocalPort(3389);
        openPortParam3.setDescription("13389");
        openPortParam3.setLocalIP(localIP);

        OpenPortParam openPortParam4 = new OpenPortParam();
        openPortParam4.setExternalPort(15244);
        openPortParam4.setLocalPort(5244);
        openPortParam4.setDescription("15244");
        openPortParam4.setLocalIP(localIP);

        boolean openPortResult = gateway.openPort(openPortParam);
        boolean openPortResult2 = gateway.openPort(openPortParam2);
        boolean openPortResult3 = gateway.openPort(openPortParam3);
        boolean openPortResult4 = gateway.openPort(openPortParam4);

        System.out.println(openPortResult);
        System.out.println(openPortResult2);
        System.out.println(openPortResult3);
        System.out.println(openPortResult4);
    }
}
