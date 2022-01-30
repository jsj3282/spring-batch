package com.example.springbatch.itemWriter.flatFileItemWriter_delimeted;


import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.batch.item.support.ListItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import java.util.Arrays;
import java.util.List;
/*
@Configuration
@RequiredArgsConstructor
public class FlatFileDelimitedConfiguration {

    private JobBuilderFactory jobBuilderFactory;
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job job() throws Exception {
        return jobBuilderFactory.get("batchJob")
                .incrementer(new RunIdIncrementer())
                .start(step1())
                .build();
    }

    @Bean
    public Step step1() throws Exception {
        return stepBuilderFactory.get("step1")
                .<Customer, Customer>chunk(10)
                .reader(customItemReader())
                .writer(customItemWriter())
                .build();
    }

    @Bean
    public ItemReader<? extends Customer> customItemReader() {
        List<Customer> customers = Arrays.asList(new Customer(1, "hong gil dong1", 41),
        new Customer(2, "hong gil dong2", 42),
        new Customer(3, "hong gil dong3", 43));

        ListItemReader<Customer> reader = new ListItemReader<>(customers);
//        ListItemReader<Customer> reader = new ListItemReader<>(Collections.emptyList());
        return reader;
    }

    @Bean
    public ItemWriter<? super Customer> customItemWriter() {

        return new FlatFileItemWriterBuilder<Customer>()
                .name("flatFileWriter")
                .resource(new FileSystemResource("/Users/developer/IdeaProjects/spring-batch/src/main/resources/customer.txt"))
                .append(true)
                .shouldDeleteIfEmpty(true)
                .delimited()
                .delimiter("|")
                .names(new String[]{"id", "name", "age"})
                .build();
    }
}

 */
