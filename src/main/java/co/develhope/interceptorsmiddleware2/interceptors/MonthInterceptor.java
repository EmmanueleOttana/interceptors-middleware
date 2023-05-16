package co.develhope.interceptorsmiddleware2.interceptors;

import co.develhope.interceptorsmiddleware2.entity.Month;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    private List<Month> sixMonths = new ArrayList<>(Arrays.asList(
            new Month(4, "April", "Aprile", "April"),
            new Month(5, "May", "Maggio", "Durfen"),
            new Month(6, "June", "Giugno", "Juni"),
            new Month(7, "July", "Luglio", "Juli"),
            new Month(8, "August", "Agosto", "August"),
            new Month(9, "September", "Settembre", "September")
    ));

    public Month getMonth(int number) {
        for (Month month : sixMonths) {
            if (month.getMonthNumber() == number) {
                return month;
            }
        }
        return new Month();
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String valuePath = request.getServletPath().substring(request.getServletPath().lastIndexOf("/")+1);
        if (valuePath == null || !valuePath.matches("^[0-9]*")) {
            //response.sendError(HttpStatus.BAD_REQUEST.value());
            response.setStatus(400);
            throw new IllegalArgumentException("Mese non esiste");
        } else return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }

}
