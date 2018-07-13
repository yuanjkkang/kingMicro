package com.king.common.mongodb.log.repo;

import org.springframework.stereotype.Repository;

import com.king.common.mongodb.log.model.SysLogVO;
import com.king.common.mongodb.mongo.BaseMongoRepositoryImpl;

/**
 * 日志数据接口实现类
 * @author King chen
 * @emai 396885563@qq.com
 * @data2018年4月19日
 */
@Repository
public class SysLogRepoImpl extends BaseMongoRepositoryImpl<SysLogVO, String> implements SysLogRepo {


}
