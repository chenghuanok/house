package cn.ww.house.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import java.util.concurrent.Future;

/**
 * 异步任务
 * @Author: chenghuan
 * @Date: 2019/9/16 21:17
 */
@Component
public class AsyncTask {

    @Async
    public Future<Boolean> task1() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(1000);
        long end = System.currentTimeMillis();
        System.out.println("=====任务1 耗时："+(end-start)+"======");
        //返回true，告诉此任务已完成
        return new AsyncResult<Boolean>(true);
    }

    @Async
    public Future<Boolean> task2() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(800);
        long end = System.currentTimeMillis();
        System.out.println("=====任务2 耗时："+(end-start)+"======");
        //返回true，告诉此任务已完成
        return new AsyncResult<Boolean>(true);
    }

    @Async
    public Future<Boolean> task3() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(600);
        long end = System.currentTimeMillis();
        System.out.println("=====任务3 耗时："+(end-start)+"======");
        //返回true，告诉此任务已完成
        return new AsyncResult<Boolean>(true);
    }
}

