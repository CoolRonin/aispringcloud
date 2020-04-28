package com.southwind.feign;

import com.southwind.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")//声明式接口，不需要写实现类     访问的是provider服务,前提是注册中心里有它
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();//使用rest方式

    @GetMapping("/student/index")
    public String index();
}
