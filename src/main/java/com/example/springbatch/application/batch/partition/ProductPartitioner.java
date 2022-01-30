package com.example.springbatch.application.batch.partition;

import com.example.springbatch.application.batch.domain.ProductVO;
import com.example.springbatch.application.batch.job.api.QueryGenerator;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

public class ProductPartitioner implements Partitioner {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Map<String, ExecutionContext> partition(int gridSize) {

        ProductVO[] productList = QueryGenerator.getProductList(dataSource);
        Map<String, ExecutionContext> result = new HashMap<>();

        int number = 0;

        for(int i = 0; i < productList.length; i++) {
            ExecutionContext value = new ExecutionContext();
            result.put("partition" + number, value);
            value.put("product", productList[i]);
            number++;
        }

        return result;
    }
}
