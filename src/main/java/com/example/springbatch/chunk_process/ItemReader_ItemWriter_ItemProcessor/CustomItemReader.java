package com.example.springbatch.chunk_process.ItemReader_ItemWriter_ItemProcessor;


import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.ArrayList;
import java.util.List;

/*
public class CustomItemReader implements ItemReader<Customer> {

    private List<Customer> list;

    public CustomItemReader(List<Customer> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public Customer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {

        if(!list.isEmpty()) {
            list.remove(0);
        }
        return null;
    }
}
*/