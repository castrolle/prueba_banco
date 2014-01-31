package com.payulatam.banco;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.payulatam.banco.facade.SystemFacade;
import com.payulatam.banco.user.bo.UserBo;

@Component
@ManagedBean
@SessionScoped
public class UserBean {

	@Autowired
	private SystemFacade systemFacade;

	public void setUserBo(UserBo userBo) {
		//this.userBo = userBo;
	}

	public String printMsgFromSpring() {
		systemFacade.findAllParameters();
		return "----------";
	}

}