package com.dosse.upnp;

import java.io.Serializable;

public class OpenPortParam implements Serializable {

    private boolean isUDP;
    private String localIP;
    private int localPort;
    private int externalPort;
    private String description;
    private int leaseDuration;

    public boolean isUDP() {
        return isUDP;
    }

    public void setUDP(boolean UDP) {
        isUDP = UDP;
    }

    public String getLocalIP() {
        return localIP;
    }

    public void setLocalIP(String localIP) {
        this.localIP = localIP;
    }

    public int getLocalPort() {
        return localPort;
    }

    public void setLocalPort(int localPort) {
        this.localPort = localPort;
    }

    public int getExternalPort() {
        return externalPort;
    }

    public void setExternalPort(int externalPort) {
        this.externalPort = externalPort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLeaseDuration() {
        return leaseDuration;
    }

    public void setLeaseDuration(int leaseDuration) {
        this.leaseDuration = leaseDuration;
    }

//            params.put("NewRemoteHost", "");
//        params.put("NewProtocol", udp ? "UDP" : "TCP");
//        params.put("NewInternalClient", iface.getHostAddress());
//        params.put("NewExternalPort", "" + port);
//        params.put("NewInternalPort", "" + port);
//        params.put("NewEnabled", "1");
//        params.put("NewPortMappingDescription", "WaifUPnP");
//        params.put("NewLeaseDuration", "0");
}
