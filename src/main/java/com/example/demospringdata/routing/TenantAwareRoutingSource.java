package com.example.demospringdata.routing;

import com.example.demospringdata.core.ThreadLocalStorage;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

// AbstractRoutingDataSource for determining a data source at runtime
// ThreadLocalStorage is used for look up key for routing

public class TenantAwareRoutingSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return ThreadLocalStorage.getTenantName();
    }
}
