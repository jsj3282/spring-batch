package com.example.springbatch.repeat_skip_retry.retry;

public class RetryableException extends RuntimeException{

    public RetryableException() {
        super();
    }

    public RetryableException(String message) {
        super(message);
    }

}
