package com.company.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.company.dao.ITaskDao;

/**
 * @author 白虎
 * @category 定时器
 */
@Component
public class MyTask {
	
	@Autowired
	private ITaskDao staffDao;

	@Scheduled(cron = "0 0 6 * * *")
	public void update() {
		System.out.println(666);
		staffDao.update();
	}
}
