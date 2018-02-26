package com.rcloud.erp;

//import com.rcloud.erp.cache.RedisUtil;
import com.rcloud.erp.cache.RedisUtil;
import com.rcloud.erp.entity.User;
import com.rcloud.erp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HttpController {


    @Resource(type = UserService.class)
    private UserService userServices;

    public UserService getUserServices() {
        return this.userServices;
    }

    public void setUserServices(UserService userServices) {
        this.userServices = userServices;
    }

    @RequestMapping(value = "/user/add",headers = "Accept=application/json")
    @ResponseBody
    public Map<String,String > index(HttpServletRequest request,@RequestBody String s) throws IOException {

        //RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        //ServletRequestAttributes sra = (ServletRequestAttributes) ra;
        //HttpServletRequest request = sra.getRequest();
        System.out.println(s);
       /* BufferedReader reader = request.getReader();

        String message = "";
        String line = null;
        while((line = reader.readLine()) != null) {
            message += line;
        }
        System.out.println(message);
*/
        Map<String,String > baseDetail = new HashMap<String, String>();
            baseDetail.put("sss","sdsd");
        User user = new User();
        user.setUser_id("124");
        user.setUsername("lili");
        RedisUtil RedisUtil = new RedisUtil();
        RedisUtil.set("11","111");
        RedisUtil.get("11");
       // this.userServices.addUser(user);
        return baseDetail;
    }

}
