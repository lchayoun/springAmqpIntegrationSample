package com.example.springAmqpIntegrationSample;

import io.prometheus.client.Collector;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Counter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Service;

/**
 * Created by lchayoun on 5/22/17.
 */
@Service
public class ExampleBean implements SmartInitializingSingleton, DisposableBean {

    private Collector collector;

    @Override
    public void destroy() throws Exception {
        CollectorRegistry defaultRegistry = CollectorRegistry.defaultRegistry;
        defaultRegistry.unregister(collector);
    }

    @Override
    public void afterSingletonsInstantiated() {
        CollectorRegistry defaultRegistry = CollectorRegistry.defaultRegistry;
        collector = Counter.build("name", "help").create();
        defaultRegistry.register(collector);
    }
}
