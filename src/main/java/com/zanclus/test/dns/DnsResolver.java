package com.zanclus.test.dns;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.dns.DnsClient;
import io.vertx.core.dns.DnsClientOptions;

public class DnsResolver extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        DnsClient c = vertx.createDnsClient(new DnsClientOptions());
        c.lookup4("home.ad.zanclus.com.", res -> {
            if (res.succeeded()) {
                System.out.println("Result: "+res.result());
            } else {
                res.cause().printStackTrace();
            }
            vertx.close();
        });
    }
}
