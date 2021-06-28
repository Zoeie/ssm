package com.zoe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

//http://localhost:8080/img/poster/1.jpg
@Controller
@RequestMapping("/img")
public class ImgReadController {

    @RequestMapping("/{subpath}/{imageName:.+}")
    public void helloWorld(@PathVariable String subpath, @PathVariable String imageName, HttpServletResponse response) {
        try{
            File file = new File("D:\\images\\"+subpath+"\\"+imageName);
            System.out.println("path:"+file.getAbsolutePath());
            System.out.println("file:"+file.exists());
            FileInputStream fis = new FileInputStream(file); // 以byte流的方式打开文件 d:\1.gif   
            int i = (int) file.length(); //得到文件大小   
            byte data[] = new byte[i];
            fis.read(data);//读数据
            response.setContentType("image/*"); //设置返回的文件类型   
            OutputStream toClient = response.getOutputStream(); //得到向客户端输出二进制数据的对象   
            toClient.write(data);//输出数据   
            toClient.flush();
            toClient.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("图片不存在");
        }
    }

}
