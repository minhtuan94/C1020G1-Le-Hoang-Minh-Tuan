package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimezoneController {

    @GetMapping("/worldclock")
    public String getTimeByTimezone(ModelMap model,
                                    @RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {

//        Đầu tiên chúng ta sẽ lấy thời gian hiện tại và múi giờ của địa phương cùng với múi giờ của thành phố được chỉ định.

// Get current time at local
        Date date = new Date();
// Get timezone by the local
        TimeZone local = TimeZone.getDefault();
// Get timezone by the specified city
        TimeZone locale = TimeZone.getTimeZone(city);

//        Hàm getRawOffset()trả về lượng thời gian tính bằng mili giây để thêm vào UTC để có thời gian chuẩn trong múi giờ này.
        // Calculate the current time in the specified city
        long locale_time = date.getTime() +
                (locale.getRawOffset() - local.getRawOffset());
// Reset the date by locale_time
        date.setTime(locale_time);

        // Chuyển dữ liệu về cho view
        model.addAttribute("city", city);
        model.addAttribute("date", date);
        return "/worldclock";
    }
}
//    @RequestMapping("worldclock")  ánh xạ request lên phương thức xử lý.
//@RequestParam(name = "city", required = false, defaultValue = "Asia/Ho_Chi_Minh")  khai báo tham số của phương thức xử lý, ràng buộc với tham số từ request.