1.spring �����ļ�application.xml

2.������  AlertService.java

3.������  ReceiverListener.java

4.������ AlertServiceTest.java

�����¼:

Issue1:ע��ʱ��ʼ�ձ�NullPointException

Solve1:Junit ����Ĭ�ϵ�ִ����Suite����Ҫ��Ϊspring ��Junit��org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner.class)
