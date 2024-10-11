package com.rbasystems.api.validator;

import java.util.Arrays;
import java.util.List;

public interface Fields {
    String OPEN_API_VERSION = "API Specification Version";
    List<String> SUPPORTED_OPEN_API_VERSIONS = Arrays.asList(new String[] { "3.0.3", "3.1.0" });

    public interface Info {
        String INFO = "Info";
        String TITLE = "API title field";
        String API_VERSION = "API version";
    }

    String Invalid_API_SPEC_FILE = " Api specification file is invalid.";
    String EmptyFieldMessage = " must not be empty";
    String UNSUPPORTED_API_SPEC = " Unsupported API Specification version is provided.";

}
