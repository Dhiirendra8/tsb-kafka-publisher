package com.example.tsb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tsb.service.KafkaService;
import com.tsb.model.IA7061in;
import com.tsb.ods.sys.api.schema.TransactionRequestIA7061;

@RestController
@RequestMapping("/domain")
public class KafkaController {
	
	@Autowired
	private KafkaService service;
	
//	@PostMapping("/lookup1")
//	public String lookup(@RequestBody KafkaModel model) {
//		
//		
//		ProductRequestBS0100 object = new ProductRequestBS0100();
////		RequestModel object = new RequestModel();
//		object.setCodentid(model.getCodentid());
//		object.setDenentid(model.getDenentid());
//		
//		service.crawl(object);
//		
//		return "Domain Crawler has scrapped your data";
//	}
//	
	@PostMapping("/lookup")
	public String lookupIA7061(@RequestBody IA7061in model) {
		
		
//		ProductRequestBS0100 object = new ProductRequestBS0100();
////		RequestModel object = new RequestModel();
//		object.setCodentid(model.getCodentid());
//		object.setDenentid(model.getDenentid());
//		
		service.IA7061Service(model);
		
		return "Domain Crawler has scrapped your data";
	}
	
	@PostMapping("/lookup2")
	public String lookupIA7061SchemaRegistry(@RequestBody TransactionRequestIA7061 model) {
		
		
//		ProductRequestBS0100 object = new ProductRequestBS0100();
////		RequestModel object = new RequestModel();
//		object.setCodentid(model.getCodentid());
//		object.setDenentid(model.getDenentid());
//		
		service.IA7061ServiceSchemaRegistry(model);
		
		return "Domain with *Schema Registry* has scrapped your data";
	}
}
