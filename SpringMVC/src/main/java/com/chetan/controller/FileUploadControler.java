package com.chetan.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

@Controller
public class FileUploadControler {

	@RequestMapping("/FileUpload")
	public String showupLoadForm() {

		return "FileUpload";
	}

	@RequestMapping(path = "/uploadImag", method = RequestMethod.POST)
	public String uploadImag(@RequestParam("profile") CommonsMultipartFile file, HttpSession s, Model m) {
		/* File uploading */
		System.out.println("Size: " + file.getSize());
		System.out.println("Filename: " + file.getContentType());
		System.out.println("Filename: " + file.getOriginalFilename());
		System.out.println("Filename: " + file.getName());

		byte[] data = file.getBytes();
		String p = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + file.getOriginalFilename();
		System.out.println("Path" + p);
		try {
			FileOutputStream fos = new FileOutputStream(p);
			fos.write(data);
			fos.close();
			m.addAttribute("msg", "Uploaded successfullt");
			m.addAttribute("filename", file.getOriginalFilename());

			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Uploading error");
		}
		return "fileSuccess";

	}
}
