package com.data.analy.common.config;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Bean 映射工具 用于对象dto ->entity的转换
 *
 * @author
 * @date
 */
@Configuration
public class OrikaConfig {

	@Bean
	public MapperFactory mapperFactory() {
		return new DefaultMapperFactory.Builder().build();
	}

	@Bean
	public MapperFacade mapperFacade() {
		return mapperFactory().getMapperFacade();
	}

}
