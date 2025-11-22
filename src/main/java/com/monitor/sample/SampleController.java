package com.monitor.sample;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class SampleController {

	// lombok추가하면 slf4j로 사용
	private final Logger logger = LoggerFactory.getLogger(SampleController.class);

	@GetMapping("/")
	public String hello(HttpServletResponse response) throws IOException {
		logger.info("Attempted access to / endpoint resulted in 403 Forbidden");
		response.sendError(HttpServletResponse.SC_FORBIDDEN, "Access Denied");
		return null;
	}
}
