//package com.zelot.dao;
//
//
//import com.zelot.ModelDo.DeviceDataDo;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoOperations;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.io.IOException;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"classpath:spring/spring.xml"})
//public class SpringMongoTest {
//    private static final Logger log = LoggerFactory.getLogger(SpringMongoTest.class);
//
//    @Autowired
//    private MongoOperations mongoTemplate;
//    private static ObjectMapper objectMapper = new ObjectMapper();
//
//    @Test
//    public void insert() throws IOException {
//        DeviceDataDo deviceDataDo = new DeviceDataDo();
//        deviceDataDo.setDeviceId(61);
//        Map<String,Object> dataMap = new HashMap<>();
//        dataMap.put("status",1);
//        deviceDataDo.setData(objectMapper.writeValueAsString(dataMap));
//        deviceDataDo.setUploadDate(new Date());
//        mongoTemplate.insert(deviceDataDo);
//        log.info("insert:"+objectMapper.writeValueAsString(deviceDataDo));
//    }
//
//    @Test
//    public void find()throws IOException {
//        DeviceDataDo deviceDataDo = mongoTemplate.findOne(Query.query(Criteria.where("deviceId").is(61)),
//                DeviceDataDo.class);
//        log.info("select:"+objectMapper.writeValueAsString(deviceDataDo));
//    }
//    @Test
//    public void update()throws IOException{
//        mongoTemplate.updateFirst(Query.query(Criteria.where("deviceId").is(61)),
//                Update.update("uploadDate",new Date()),DeviceDataDo.class);
//        find();
//    }
//    @Test
//    public void delete()throws IOException{
//        mongoTemplate.remove(Query.query(Criteria.where("deviceId").is(61)),DeviceDataDo.class);
//        find();
//    }
//}
