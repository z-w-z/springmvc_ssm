package com.zwz.ssm.controller;

import com.zwz.ssm.po.Items;
import com.zwz.ssm.po.ItemsCustom;
import com.zwz.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    //商品查詢
    @RequestMapping("/queryItems")
    public ModelAndView queryItems()throws Exception{
        //調用service查找數據庫，查詢商品列表
        List<ItemsCustom> itemsList = itemsService.findItemsList(null);
        //返回ModelAndView
        ModelAndView modelAndView =new ModelAndView();
        //相當與request的setAttribute，在jsp頁面中通過itemsList讀取數據
        modelAndView.addObject("itemsList",itemsList);

        // 指定视图
        // 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
        // modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
        // 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
        modelAndView.setViewName("items/itemsList");

        return modelAndView;
    }

}
