package com.example.springbatch.application.batch.job.api;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApiJobChildConfiguration {

    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;
    private final Step apiMaterStep;
    private final JobLauncher jobLauncher;

    @Bean
    public Step jobStep() {
        return stepBuilderFactory.get("jobStep")
                .job(childJob())
                .launcher(jobLauncher)
                .build();
    }

    @Bean
    public Job childJob() {
        return jobBuilderFactory.get("childJob")
                .start(apiMaterStep)
                .build();
    }


}
