package exception;

import javax.naming.LimitExceededException;

public class ServiceException extends RuntimeException {
    public static final int BIZ_EXCEPTION = 1;
    public static final int FORBIDDEN_EXCEPTION = 2;
    public static final int SERIALIZATION_EXCEPTION = 3;
    public static final int NO_INVOKER_AVAILABLE_AFTER_FILTER = 4;
    public static final int LIMIT_EXCEEDED_EXCEPTION = 5;
    private static final long serialVersionUID = 7815426752583648734L;
    /**
     * RpcException cannot be extended, use error code for exception type to keep compatibility
     */
    private int code;

    public ServiceException() {
        super();
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(int code) {
        super();
        this.code = code;
    }

    public ServiceException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(int code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isBiz() {
        return code == BIZ_EXCEPTION;
    }

    public boolean isForbidded() {
        return code == FORBIDDEN_EXCEPTION;
    }


    public boolean isSerialization() {
        return code == SERIALIZATION_EXCEPTION;
    }

    public boolean isNoInvokerAvailableAfterFilter() {
        return code == NO_INVOKER_AVAILABLE_AFTER_FILTER;
    }

    public boolean isLimitExceed() {
        return code == LIMIT_EXCEEDED_EXCEPTION || getCause() instanceof LimitExceededException;
    }
}
