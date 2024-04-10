package com.example.demo.UserService;

import com.example.demo.Bean.UserBean;
import oracle.net.jdbc.TNSAddress.AddressList;

public interface UserService {
	UserBean login(String userName, String passWord);

	AddressList showAddressList(String abName);
}
