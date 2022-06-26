package com.application1.application1;

import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Headers("Content-Type:application/json")
@FeignClient(name= "${feign.name}", url = "${feign.url}")
public interface RestClientService {
    @RequestMapping(value = "/app2/student/save",method = RequestMethod.POST)
    Student save(Student student);
}
