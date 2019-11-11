//package com.xutao.pmc.mq;
//
//import com.pmc.bean.TbNews;
//import com.pmc.service.TbNewsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.stereotype.Component;
//
//import javax.jms.JMSException;
//import javax.jms.MapMessage;
//
//@Component
//public class NewsServiceMqListener {
//
//    @Autowired
//    TbNewsService tbNewsService;
//    @JmsListener(destination = "UPDATE_NEWS_NO",containerFactory = "jmsQueueListener")
//    public void consumePaymentResult(MapMessage mapMessage){
//
//        try {
//           String newsId = mapMessage.getString("orderId");
//           // System.out.println(newsId);
//           //tbNewsService.updateNewsGlance(Integer.parseInt(newsId));
//        }catch (JMSException e){
//            e.printStackTrace();
//        }
//    }
//
//}
