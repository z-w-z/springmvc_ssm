package com.zwz.ssm.serviceImpl;

import com.zwz.ssm.mapper.ItemsMappperCustom;
import com.zwz.ssm.po.ItemsQueryVO;
import com.zwz.ssm.po.ItemsCustom;
import com.zwz.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ZWZ
 */
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsMappperCustom itemsMappperCustom;
    public List<ItemsCustom> findItemsList(ItemsQueryVO itemsQueryVO) throws Exception {
        return itemsMappperCustom.findItemsList(itemsQueryVO);
    }
}
