package com.example.springbatch.repeat_skip_retry.skip;

import org.springframework.batch.item.ItemProcessor;
/*
public class SkipItemProcessor implements ItemProcessor<String, String> {

    private int cnt = 0;

    @Override
    public String process(String item) throws Exception {

        if (item.equals("6") || item.equals("7")) {
            System.out.println("ItemProcessor : " + item);
            cnt++;
            throw new SkippableException("Process failed. cnt:" + cnt);
        } else {
            System.out.println("ItemProcessor : " + item);
            return String.valueOf(Integer.valueOf(item) * -1);
        }
    }
}

 */
