package com.eidiko.niranjana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eidiko.niranjana.ext.FileUtils;
@Controller
public class ExtensionController {

	@PostMapping("/get")
	@ResponseBody
	public static void getExtensionController()
	{
		byte[] bytes = FileUtils.ExtensionGet(".png").getBytes();
	}
}
