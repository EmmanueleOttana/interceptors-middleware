package co.develhope.interceptorsmiddleware2.controllers;

import co.develhope.interceptorsmiddleware2.entity.Month;
import co.develhope.interceptorsmiddleware2.interceptors.MonthInterceptor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("/{monthNumber}")
    public Month getMonth(@PathVariable int monthNumber){
        return new MonthInterceptor().getMonth(monthNumber);
    }


}
