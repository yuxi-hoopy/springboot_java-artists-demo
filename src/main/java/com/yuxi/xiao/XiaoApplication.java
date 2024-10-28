package com.yuxi.xiao;

import com.yuxi.xiao.dao.Painter;
import com.yuxi.xiao.dao.PainterRepo;
import com.yuxi.xiao.service.PainterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class XiaoApplication {

	public static void main(String[] args) {


		SpringApplication.run(XiaoApplication.class, args);
	}

}
