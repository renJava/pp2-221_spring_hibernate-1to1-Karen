package hiber.dao;

import hiber.model.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   private final SessionFactory sessionFactory;

   public UserDaoImp(SessionFactory sessionFactory) {
      this.sessionFactory = sessionFactory;
   }


   @Override
   public User getUserByCar(String model, int series) {
      String hql = "FROM User WHERE car.model = :model AND car.series = :series";
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery(hql, User.class);
      query.setParameter("model", model);
      query.setParameter("series", series);
      User searchUser = query.getSingleResult();
      System.out.println("\nПоиск юзера по модели и серии машины:");
      return searchUser;
   }

//@Override
//public User getUserByCar(String car_model, int car_series) {
//   EntityManager entityManager = sessionFactory.getCurrentSession();
//   TypedQuery<User> query = entityManager
//           .createQuery("SELECT u FROM User u JOIN FETCH u.car m WHERE m.model = :model AND m.series =: series", User.class)
//           .setParameter("model", car_model)
//           .setParameter("series", car_series);
//   return query.getSingleResult() == null ? query.getSingleResult() : new User();
//}

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   public List<User> listUsers() {
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User", User.class);
      return query.getResultList();
   }

}
