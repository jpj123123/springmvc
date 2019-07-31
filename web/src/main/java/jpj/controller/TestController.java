package jpj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: jingpj
 * @Date：creste in 2019/7/31
 */
@Controller
@RequestMapping("/test")
public class TestController {
  @RequestMapping("/test")
  @ResponseBody
  public String test(){
    return "hello word";
  }
}
