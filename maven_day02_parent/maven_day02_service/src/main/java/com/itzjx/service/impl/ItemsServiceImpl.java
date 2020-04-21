package com.itzjx.service.impl;

import com.itzjx.dao.ItemsDao;
import com.itzjx.domain.Items;
import com.itzjx.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemsService")
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;

    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
