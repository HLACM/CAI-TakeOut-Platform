package com.cai.takeout.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cai.takeout.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}