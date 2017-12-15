package test;


import com.leon.data.StudentInfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class StudentTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        Configuration configuration = new Configuration().configure();//创建配置对象
        sessionFactory = configuration.buildSessionFactory();//创建会话工厂
        session = sessionFactory.openSession();//开启会话
        transaction = session.beginTransaction();//开启事务
    }

    @After
    public void destory() {
        transaction.commit();//事务提交
        session.close();//关闭会话
        sessionFactory.close();//关闭会话工厂
    }

    @Test
    public void testStudent() {
        //生成对象
        StudentInfoEntity studentInfoEntity = new StudentInfoEntity();
        studentInfoEntity.setStudentId("111");
        studentInfoEntity.setStudentName("aaleoo");
        studentInfoEntity.setStudentBatch("2016");
        studentInfoEntity.setStudentGender("mail");
        studentInfoEntity.setStudentPw("1124298701");
        //保存对象进数据库
        session.save(studentInfoEntity);
    }
}
