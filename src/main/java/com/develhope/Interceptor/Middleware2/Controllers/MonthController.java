package com.develhope.Interceptor.Middleware2.Controllers;

import com.develhope.Interceptor.Middleware2.Entities.Month;
import com.develhope.Interceptor.Middleware2.interceptor.MonthInterceptor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

import static com.develhope.Interceptor.Middleware2.interceptor.MonthInterceptor.mese;

@RestController
@RequestMapping("/month")
public class MonthController {

    @GetMapping("/{monthNumber}")
    public Month specificMonth (@PathVariable int monthNumber) {
        List<Month> months = Arrays.asList(mese);
        for (Month month : months) {
            if (month.getMonthNumber() == monthNumber) {
                return month;
            }
        }
        return new Month(0, "null", "null", "null");
    }
}
