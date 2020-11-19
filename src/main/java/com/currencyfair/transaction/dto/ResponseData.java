package com.currencyfair.transaction.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ResponseData {

    @JsonInclude(Include.NON_NULL)
    private String code;

    @JsonInclude(Include.NON_NULL)
    private String message;

    @JsonInclude(Include.NON_NULL)
    private List<?> rows;

    private boolean success = true;

    @JsonInclude(Include.NON_NULL)
    private Long total;

    public ResponseData() {
    }

    public ResponseData(boolean success) {
        setSuccess(success);
    }
    
    public ResponseData(List<?> list) {
        this(true);
        setRows(list);
        setTotal((long) list.size());
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public List<?> getRows() {
        return rows;
    }

    public Long getTotal() {
        return total;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}
