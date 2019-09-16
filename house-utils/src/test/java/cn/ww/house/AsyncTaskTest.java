package cn.ww.house;

import cn.ww.house.async.AsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTaskTest {

    /**
     * 异步任务
     * @param
     * @return
     * @author chenghuan
     * @date 2019/9/16 21:28
    */
    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void asyncTest()throws Exception{
        long start = System.currentTimeMillis();
        Future<Boolean> a = asyncTask.task1();
        Future<Boolean> b = asyncTask.task2();
        Future<Boolean> c = asyncTask.task3();

        //循环到三个任务全部完成
        while (!a.isDone()||!b.isDone()||!c.isDone()) {
            if (a.isDone()&&b.isDone()&&c.isDone()) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        String result = "任务完成，一共用时为："+(end-start)+"毫秒";
        System.out.println(result);
    }
}