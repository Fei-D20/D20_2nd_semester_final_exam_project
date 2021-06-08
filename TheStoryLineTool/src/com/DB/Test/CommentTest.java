package com.DB.Test;
import com.DB.DaoImplement.eventcard.Impl_CommentDao;
import com.Domain.eventcard.Dom_Comment;
import org.junit.Test;

import java.time.LocalDate;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-10.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class CommentTest {
    @Test
    public void testInsert(){
        Impl_CommentDao impl_commentDao = new Impl_CommentDao();
        impl_commentDao.add(new Dom_Comment(2,"Fei", LocalDate.now(),"this is the test of comment. "));
    }

    @Test
    public void testModify(){
        Impl_CommentDao impl_commentDao = new Impl_CommentDao();
        Dom_Comment dom_comment = new Dom_Comment();
        dom_comment.setCommentID(1);
        dom_comment.setCommentText("now it test the modify");
        impl_commentDao.modify(dom_comment);
    }

    @Test
    public void testDelete(){
        Impl_CommentDao impl_commentDao = new Impl_CommentDao();
        impl_commentDao.delete(new Dom_Comment(2,"Fei", LocalDate.now(),"this is the test of comment. "));
    }


}
