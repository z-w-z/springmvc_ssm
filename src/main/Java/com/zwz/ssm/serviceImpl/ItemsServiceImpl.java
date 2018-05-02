package com.zwz.ssm.serviceImpl;

import com.zwz.ssm.mapper.ItemsMapper;
import com.zwz.ssm.mapper.ItemsMapperCustom;
import com.zwz.ssm.po.ItemsQueryVo;
import com.zwz.ssm.po.ItemsCustom;
import com.zwz.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ItemsServiceImpl implements ItemsService{

    @Autowired
    private ItemsMapperCustom itemsMapperCustom;

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
            throws Exception {
        //通过ItemsMapperCustom查询数据库
        return itemsMapperCustom.findItemsList(itemsQueryVo);
    }
}
