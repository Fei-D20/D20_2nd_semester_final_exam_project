package com.Function.eventCard;

import com.DB.DaoImplement.eventcard.Impl_CommentDao;
import com.Domain.eventcard.Dom_Comment;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Comment {
    public static void addComment(Dom_Comment dom_comment){
        Impl_CommentDao impl_commentDao = new Impl_CommentDao();
        impl_commentDao.add(dom_comment);
    }
}
