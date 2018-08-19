package db;

import models.Patron;
import models.Review;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBPatron {

    private static Session session;

    public static List<Review> getReviewsBy(Patron patron){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Review> results = null;
        try {
            Criteria cr = session.createCriteria(Review.class);
            cr.add(Restrictions.eq("patron", patron));
            results =  cr.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }


}//end
