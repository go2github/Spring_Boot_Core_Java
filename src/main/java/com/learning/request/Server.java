package com.learning.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class Server {
    String name;
    String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
}
