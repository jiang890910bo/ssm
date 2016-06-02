package com.jiangbo.ssm.interceptor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	private static final Integer BEGIN = 9;
	private static final Integer END = 6;
	
	/**
	 * preHandle()�����������ҵ��������������֮ǰ�����ã�
	 * �ڸ÷����ж��û�����request���д����������Ա������������������������ش����Ҫ������������������
	 * ������ҵ������ȥ���д����򷵻�true���������Ա��������Ҫ�ٵ������������ȥ���������򷵻�false��
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Calendar cal = Calendar.getInstance();  
        int hour = cal.get(Calendar.HOUR_OF_DAY); // ��ȡ��ǰʱ��  
        if (hour >= BEGIN && hour <= END) {
        	System.out.println("��ǰ���ϰ�ʱ�䣺"+new SimpleDateFormat("HH:mm:sss").format(new Date()));
            return true;  
        } else {  
            //response.sendRedirect(outsideOfficeHoursPage); // ������ʾҳ��  
            return false;  
        }  
	}
	
	/**
	 * postHandle()�����������ҵ�����������������
	 * ����DispatcherServlet��ͻ��˷�������ǰ�����ã��ڸ÷����ж��û�����request���д���
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
	/**
	 * afterCompletion()�����������DispatcherServlet��ȫ����������󱻵��ã������ڸ÷����н���һЩ��Դ����Ĳ�����
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
}
