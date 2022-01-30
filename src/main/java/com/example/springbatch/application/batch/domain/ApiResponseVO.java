package com.example.springbatch.application.batch.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
@Builder
public class ApiResponseVO {

    private int status;
    private String msg;

}
