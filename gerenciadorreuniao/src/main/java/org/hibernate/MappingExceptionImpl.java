package org.hibernate;

public class MappingExceptionImpl extends MappingException {
    public MappingExceptionImpl (String message, Throwable cause) {
        super (message, cause);
    }

    public MappingExceptionImpl (Throwable cause) {
        super (cause);
    }

    public MappingExceptionImpl (String message) {
        super (message);
    }
}
