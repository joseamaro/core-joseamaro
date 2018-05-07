package com.core.data.entity.response;

/**
 * Created by carlos on 07-05-18.
 */

public class ResponseBaseEntity<T> {
    public String status;
    public String message;
    public T data;
}