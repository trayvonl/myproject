package com.example.demo.UserMapper;



import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Bean.UserBean;
import oracle.net.jdbc.TNSAddress.AddressList;

@Mapper
public interface UserMapper {
	AddressList showAddressList(String abName);

	UserBean getTimeByUserName(String userName);
}
