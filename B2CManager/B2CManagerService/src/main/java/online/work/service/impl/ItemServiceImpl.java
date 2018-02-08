package online.work.service.impl;

import online.work.Interface.ItemService;
import online.work.mapper.TbItemMapper;
import online.work.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 84825 on 2018/2/9.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long id) {
        TbItem item = itemMapper.selectByPrimaryKey(id);
        return item;
    }
}
