package com.itzjx.test;

import com.itzjx.domain.Items;
import com.itzjx.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void testFindById(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //dao测试
//        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
//        Items items = itemsDao.findById(1);
//        System.out.println(items.getName());


        //Service测试
        ItemsService service = ac.getBean(ItemsService.class);
        Items items = service.findById(1);
        System.out.println(items.getName());
    }


}
