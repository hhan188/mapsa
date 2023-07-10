//package org.MapsaPractice.Services;
//
//import org.MapsaPractice.Entities.ArtistDetail;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//public class ArtistDetailService {
//    SessionFactory sessionFactory;
//    public ArtistDetailService(SessionFactory sessionFactory){
//        this.sessionFactory=sessionFactory;
//    }
//    public void creatArtistDetail(ArtistDetail artistDetail){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.update(artistDetail);
//        session.getTransaction().commit();
//        session.close();
//
//    }
//    public void updateArtistDetail(ArtistDetail artistDetail){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.update(artistDetail);
//        session.getTransaction().commit();
//        session.close();
//    }
//    public void deleteArtistDetail(ArtistDetail artistDetail){
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.delete(artistDetail);
//        session.getTransaction().commit();
//        session.close();
//    }
//    public ArtistDetail getArtistDetailById(Integer artistDetailId){
//        Session session = sessionFactory.openSession();
//        ArtistDetail artistDetail = session.get(ArtistDetail.class, artistDetailId);
//        session.close();
//        return artistDetail;
//    }
//}
