package com.qianfeng.springboothello.controller;

        import com.qianfeng.springboothello.entity.Resources;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.web.bind.annotation.*;


/**
 * @author FuZhiFan
 * @Date 2019/7/29
 */
@RestController
@RequestMapping("user")
public class UserController {

   /* @Value("${fileServer.path}")
    private String fileServer;

    @Value("${emailServer.path}")
    private String  emailServer;
*/
    @Autowired
    private Resources resources;

   /* @GetMapping("properties")
    public String properties(){
        return fileServer+":"+emailServer;
    }
*/
    @GetMapping("resource")
    public String resources(){
        return resources.getFileServer()+":::"+resources.getEmailServer();
    }



    @RequestMapping("hello")
    public String hello(){
        return "hello SpringBoot!!!!!!!!!";
    }

    @GetMapping("page")
    public String page(@RequestParam(name="pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }


    @GetMapping("page/{pageIndex}")
    public String page2(@PathVariable(name="pageIndex") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }
}
