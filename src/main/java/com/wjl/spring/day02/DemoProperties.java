package com.wjl.spring.day02;

import java.util.Properties;

public class DemoProperties {
    private Properties emailAddrs;

    public Properties getEmailAddrs() {
        return emailAddrs;
    }

    public void setEmailAddrs(Properties emailAddrs) {
        this.emailAddrs = emailAddrs;
    }

    @Override
    public String toString() {
        return "DemoProperties{" +
                "emailAddrs=" + emailAddrs +
                '}';
    }
}
