package com.example.tsb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.tsb.model.IA7061in;
import com.tsb.ods.sys.api.schema.TransactionRequestIA7061;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	
	
//	private KafkaTemplate<String, RequestModel> kafkaTemplate;
	
//	private String KAFKA_TOPIC="productLookupBS0100";
	private String KAFKA_TOPIC="transactionLookupIA7061in";
	
//	public void crawl(ProductRequestBS0100 model) {
////	public void crawl(RequestModel model) {
//		
////		kafkaTemplate.send(KAFKA_TOPIC, model);
//		kafkaTemplate.send(KAFKA_TOPIC, model.getCodentid(), model);
//		
//		System.out.println("Published Message to topic Codent-id : "+model.getCodentid());
//		System.out.println("Published Message to topic Denent-id : "+model.getDenentid());
//	}
	
	
	public void IA7061Service(IA7061in model) {
//		public void crawl(RequestModel model) {
			
//			kafkaTemplate.send(KAFKA_TOPIC, model);
		System.out.println("Inside service ia7061 ... ");
		System.out.println("Data : " + model);
			kafkaTemplate.send(KAFKA_TOPIC, model.getIdmarca().toString(), model);
			
			
		}
	
	public void IA7061ServiceSchemaRegistry(TransactionRequestIA7061 model) {
//		public void crawl(RequestModel model) {
			
//			kafkaTemplate.send(KAFKA_TOPIC, model);
		System.out.println("Inside service ia7061 ... ");
		System.out.println("Data : " + model);
			kafkaTemplate.send(KAFKA_TOPIC, model.getIdmarca().toString(), model);
			
			
		}

}
