1.spring 配置文件application.xml

2.发送类  AlertService.java

3.接收类  ReceiverListener.java

4.测试类 AlertServiceTest.java

错误记录:

Issue1:注入时，始终报NullPointException

Solve1:Junit 采用默认的执行类Suite，需要改为spring 的Junit类org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner.class)
