package io.datahubproject.openapi.v2.generated.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-11-09T20:44:05.037816+08:00[Asia/Shanghai]")
@Controller
@RequestMapping("/openapi/v2/analytics")
public class DatahubUsageEventsApiController implements DatahubUsageEventsApi {

    private final DatahubUsageEventsApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public DatahubUsageEventsApiController(DatahubUsageEventsApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public DatahubUsageEventsApiDelegate getDelegate() {
        return delegate;
    }
}
