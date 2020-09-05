package io.kubesphere.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        while (true){
            try {
            Thread.currentThread().sleep(1000);//毫秒
            }
            catch(Exception e){}
            System.out.print("hello, world\n");
        }
    }
}