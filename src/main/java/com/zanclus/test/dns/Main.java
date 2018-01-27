package com.zanclus.test.dns;

import io.vertx.core.Launcher;
import io.vertx.core.VertxOptions;
import io.vertx.core.dns.AddressResolverOptions;

import java.util.Arrays;

public class Main extends Launcher {

    @Override
    public void beforeStartingVertx(VertxOptions options) {
        super.beforeStartingVertx(options);
        options.setAddressResolverOptions(new AddressResolverOptions()
            .setServers(Arrays.asList("8.8.8.8", "8.8.4.4"))
            .setQueryTimeout(5000));
    }
}
