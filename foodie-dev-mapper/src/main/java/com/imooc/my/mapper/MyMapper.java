package com.imooc.my.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author hbj
 * @date 2020/5/16 4:14 下午
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
