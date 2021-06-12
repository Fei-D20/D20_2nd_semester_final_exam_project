package com.function.eventCard;

import com.db.daoimplement.eventcard.Impl_CommentDao;
import com.db.util.CRUD_Util;
import com.db.util.ConnectionUtil;
import com.domain.eventcard.Dom_Comment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-10-23.47
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Func_Comment implements IF_Func_Dao<Dom_Comment>{
    Impl_CommentDao impl_commentDao = new Impl_CommentDao();

    @Override
    public void add(Dom_Comment dom_comment) {
        impl_commentDao.add(dom_comment);
    }

    @Override
    public void modify(Dom_Comment dom_comment) {
        impl_commentDao.modify(dom_comment);
    }

    @Override
    public void delete(Dom_Comment dom_comment) {
        impl_commentDao.delete(dom_comment);
    }

    @Override
    public Dom_Comment getInstance(Dom_Comment dom_comment) {
        ResultSet instance = impl_commentDao.getInstance(dom_comment);
        try {
            dom_comment.setLocalDate(instance.getDate(1).toLocalDate());
            dom_comment.setCommentAuthor(instance.getString(3));
            dom_comment.setCommentText(instance.getString(2));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            ConnectionUtil.closeConPSAndRS(CRUD_Util.getConnection(),CRUD_Util.getPreparedStatement(),CRUD_Util.getResultSet());
        }
        return dom_comment;
    }

    @Override
    public ArrayList<Dom_Comment> getAll() {
        impl_commentDao.getAll();
        return null;
    }
}
